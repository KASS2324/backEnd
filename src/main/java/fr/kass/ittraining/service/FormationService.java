package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.Theme;
import fr.kass.ittraining.repository.FormationRepository;
import fr.kass.ittraining.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormationService {

    @Autowired
    private final FormationRepository formationRepository;

    @Autowired
    private final ThemeRepository themeRepository;

    public FormationService(FormationRepository formationRepository, ThemeRepository themeRepository) {
        this.formationRepository = formationRepository;
        this.themeRepository = themeRepository;
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

    public void deleteById(Long id){
        formationRepository.deleteById(id);
    }

    public void update(Formation formation){
        formationRepository.save(formation);
    }

    /*
    public List<Formation> findByTheme(String intitule) {
        Long theme_id = themeRepository.getIntituleById(intitule);
        return themeRepository.findByIntitule(intitule)
    }
    */


}
