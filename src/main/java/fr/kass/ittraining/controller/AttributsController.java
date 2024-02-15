package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.Attributs;
import fr.kass.ittraining.model.Session;
import fr.kass.ittraining.service.AttributsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attributs")
@CrossOrigin
public class AttributsController {

    private final AttributsService attributsService;

    public AttributsController(AttributsService attributsService) {
        this.attributsService = attributsService;
    }

    @GetMapping("/all")
    public List<Attributs> findAll(){
        return attributsService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Attributs attributs){
        attributsService.save(attributs);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        attributsService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Attributs findById(@PathVariable long id){
        return attributsService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody Attributs attributs){
        attributsService.update(attributs);
    }

    @GetMapping("/formations/{id}")
    public List<Attributs> findAttributsFormation(@PathVariable long id){ return attributsService.findAttributsFormation(id);}

    @GetMapping("/byNom")
    public List<Attributs> findByNomContaining(@RequestParam String nom){
        return attributsService.findByNomContaining(nom);
    }


}
