package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Evaluation;
import fr.kass.ittraining.repository.EvaluationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;


    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public List<Evaluation> findAll(){
        return evaluationRepository.findAll();
    }

    public Evaluation findById(Long id){
        return evaluationRepository.findById(id).orElseThrow(
                () -> new NotFoundException("evaluation d'Id "+id+" non trouvée")
        );
    }

    public void save(Evaluation evaluation){
        evaluationRepository.save(evaluation);
    }

    public void deleteById(Long id){
        evaluationRepository.deleteById(id);
    }

    public void update(Evaluation evaluation){
        evaluationRepository.save(evaluation);
    }

}
