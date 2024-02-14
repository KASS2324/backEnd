package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.Evaluation;
import fr.kass.ittraining.service.EvaluationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
@CrossOrigin
public class EvaluationController {

    private final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping("/all")
    public List<Evaluation> findAll(){
        return evaluationService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Evaluation evaluation){
        evaluationService.save(evaluation);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        evaluationService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Evaluation findById(@PathVariable long id){
        return evaluationService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody Evaluation evaluation){
        evaluationService.update(evaluation);
    }


}
