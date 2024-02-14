package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.Session;
import fr.kass.ittraining.repository.FormationRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {

    private final FormationRepository formationRepository;
    private final JdbcTemplate jdbcTemplate;

    private final SessionService sessionService;

    public FormationService(FormationRepository formationRepository, JdbcTemplate jdbcTemplate, SessionService sessionService) {
        this.formationRepository = formationRepository;
        this.jdbcTemplate = jdbcTemplate;
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

    public List<Formation> findByTheme(String theme) {
        return formationRepository.findByTheme(theme);
    }

    public List<Formation> findByVille(String ville) {
        return formationRepository.findByVille(ville);
    }

    public List<Formation> findByThemeAndVille(String theme, String ville) {
        return formationRepository.findByThemeAndVille(theme, ville);
    }

    public List<String> findThemes() {
        return jdbcTemplate.queryForList("SELECT DISTINCT theme FROM formation", String.class);
    }
}
