package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Attributs;
import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.Session;
import fr.kass.ittraining.repository.FormationRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class FormationService {

    private final FormationRepository formationRepository;
    private final JdbcTemplate jdbcTemplate;

    private final AttributsService attributsService;

    private final SessionService sessionService;

    public FormationService(FormationRepository formationRepository, JdbcTemplate jdbcTemplate, AttributsService attributsService, SessionService sessionService) {
        this.formationRepository = formationRepository;
        this.jdbcTemplate = jdbcTemplate;
        this.attributsService = attributsService;
        this.sessionService = sessionService;
    }

    public List<Formation> findAll(){
        return formationRepository.findAll();
    }

    public Formation findById(Long id){
        return formationRepository.findById(id).orElseThrow(
                () -> new NotFoundException("formation d'Id "+id+" non trouvée")
        );
    }

    public void save(Formation formation){
        formationRepository.save(formation);
    }

    /*public void deleteById(Long id){
        formationRepository.deleteById(id);
    }*/

    public void deleteById(Long id){
        List<Session> sessions  = sessionService.findIdSessionsFormation(id);
        for(int i=0;i<sessions.size();i++){
            sessionService.deleteById(sessions.get(i).getId());
        }
        formationRepository.deleteById(id);
    }


    public void update(Formation formation){
        formationRepository.save(formation);
    }


    public List<Formation> findFormationsByTheme(String theme){
        List<Attributs> attributs = attributsService.findByNomContaining(theme);
        System.out.println("Attributs : " + attributs);
        List<Formation> formationsList= new ArrayList<Formation>();
        List<Formation> formationsRecherche= new ArrayList<Formation>();
        for(int i=0; i<attributs.size();i++){
            Long attribut_id= attributs.get(i).getId();
            System.out.println("Attribut id : " + attribut_id);
            formationsRecherche=findFormationsAttributId(attribut_id);
            for(int formation1=0;formation1<formationsRecherche.size();formation1++){
                Boolean ajouter = true;
                for(int formation2=0;formation2<formationsList.size();formation2++){
                    if(formationsRecherche.get(formation1).equals(formationsList.get(formation2))){
                        ajouter = false;
                    }
                }
                if(ajouter){
                    formationsList.add(formationsRecherche.get(formation1));
                }
            }


            //System.out.println("Formation id : " + formations.get(i).getId());

        }

        return formationsList;
    }


    public List<Formation> findFormationsAttributId(Long id) {
        List<Long> formation_id;
        List<Formation> formations = new ArrayList<>();

        formation_id = jdbcTemplate.queryForList("SELECT DISTINCT formation.id FROM formation " +
                "INNER JOIN formation_attributs on formation.id=formation_attributs.id_formation " +
                "INNER JOIN attributs on formation_attributs.id_attributs=attributs.id "+
                "WHERE attributs.id = ?", Long.class,id);

        for(int i=0 ; i<formation_id.size();i++){
            Formation formation = findById(formation_id.get(i));
            formations.add(formation);
        }
        return formations;
    }

    public List<Formation> findByVille(String ville) {
        return formationRepository.findByVille(ville);
    }


    public List<Formation> findByFormationsThemeAndVille(String theme, String ville) {
        List<Formation> formations = findFormationsByTheme(theme);
        List<Formation> formationList = new ArrayList<Formation>();

        for(int formation=0;formation<formations.size();formation++){
            if(Objects.equals(formations.get(formation).getVille(), ville)){
                formationList.add(formations.get(formation));
            }
        }

        return formationList;

    }



    /*public List<Formation> findByTheme(String theme) {
        return formationRepository.findByTheme(theme);
    }


    public List<Formation> findByVille(String ville) {
        return formationRepository.findByVille(ville);
    }

    public List<Formation> findByThemeAndVille(String theme, String ville) {
        return formationRepository.findByThemeAndVille(theme, ville);
    }

*/

    public List<String> findThemes() {
        return jdbcTemplate.queryForList("SELECT attributs.nom FROM attributs WHERE type LIKE 'Thème%' ", String.class);
    }


}
