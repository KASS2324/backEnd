package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Attributs;
import fr.kass.ittraining.repository.AttributsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttributsService {

    private final AttributsRepository attributsRepository;
    private final JdbcTemplate jdbcTemplate;

    public AttributsService(AttributsRepository attributsRepository, JdbcTemplate jdbcTemplate) {
        this.attributsRepository = attributsRepository;
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Attributs> findAll(){
        return attributsRepository.findAll();
    }

    public Attributs findById(Long id){
        return attributsRepository.findById(id).orElseThrow(
                () -> new NotFoundException("attributs d'Id "+id+" non trouvée")
        );
    }

    public void save(Attributs attributs){
        attributsRepository.save(attributs);
    }

    public void deleteById(Long id){
        attributsRepository.deleteById(id);
    }

    public void update(Attributs attributs){
        attributsRepository.save(attributs);
    }


    public List<Attributs> findAttributsFormation(Long id) {
        List<Long> attributs_id;
        List<Attributs> attributs = new ArrayList<>();

        attributs_id = jdbcTemplate.queryForList("SELECT attributs.id FROM attributs " +
                "INNER JOIN formation_attributs on attributs.id=formation_attributs.id_attributs " +
                "INNER JOIN formation on formation_attributs.id_formation=formation.id "+
                "WHERE formation.id = ?", Long.class,id);


        for(int i=0 ; i<attributs_id.size();i++){
            Attributs attribut = findById(attributs_id.get(i));
            attributs.add(attribut);
        }
        return attributs;
    }

    public List<Attributs> findByNomContaining(String nom){
        System.out.println(nom);
        System.out.println(attributsRepository.findByNomContaining(nom));
        return attributsRepository.findByNomContaining(nom);
    }

    public List<String> findNomCategorie() {
        return jdbcTemplate.queryForList("SELECT DISTINCT attributs.nom FROM attributs WHERE type LIKE 'Catégorie%' ", String.class);
    }
    public List<String> findNomThemes() {
        return jdbcTemplate.queryForList("SELECT DISTINCT attributs.nom FROM attributs WHERE type LIKE 'Thème%' ", String.class);
    }

    public List<String> findNomSousThemes() {
        return jdbcTemplate.queryForList("SELECT DISTINCT attributs.nom FROM attributs WHERE type LIKE 'Sous-Thème%' ", String.class);
    }



}
