package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.Theme;
import fr.kass.ittraining.service.FormationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
@CrossOrigin
public class FormationController {

    private final FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping("/all")
    public List<Formation> findAll(){
        return formationService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Formation formation){
        formationService.save(formation);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        formationService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Formation findById(@PathVariable long id){
        return formationService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody Formation formation){
        formationService.update(formation);
    }


}
