package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.repository.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
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
}
