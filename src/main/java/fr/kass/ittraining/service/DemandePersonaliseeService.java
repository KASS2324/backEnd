package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.DemandePersonalisee;
import fr.kass.ittraining.repository.DemandePersonaliseeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandePersonaliseeService {


    private final DemandePersonaliseeRepository demandePersonaliseeRepository;

    public DemandePersonaliseeService(DemandePersonaliseeRepository demandePersonaliseeRepository) {
        this.demandePersonaliseeRepository = demandePersonaliseeRepository;
    }

    public List<DemandePersonalisee> findAll(){
        return demandePersonaliseeRepository.findAll();
    }

    public DemandePersonalisee findById(Long id){
        return demandePersonaliseeRepository.findById(id).orElseThrow(
                () -> new NotFoundException("demandePersonalisee d'Id "+id+" non trouvée")
        );
    }

    public void save(DemandePersonalisee demandePersonalisee){
        demandePersonaliseeRepository.save(demandePersonalisee);
    }

    public void deleteById(Long id){
        demandePersonaliseeRepository.deleteById(id);
    }

    public void update(DemandePersonalisee demandePersonalisee){
        demandePersonaliseeRepository.save(demandePersonalisee);
    }
}
