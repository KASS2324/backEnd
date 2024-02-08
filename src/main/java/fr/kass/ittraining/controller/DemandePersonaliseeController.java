package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.DemandePersonalisee;
import fr.kass.ittraining.service.DemandePersonaliseeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demandes")
@CrossOrigin
public class DemandePersonaliseeController {

    private final DemandePersonaliseeService demandePersonaliseeService;

    public DemandePersonaliseeController(DemandePersonaliseeService demandePersonaliseeService) {
        this.demandePersonaliseeService = demandePersonaliseeService;
    }

    @GetMapping("/all")
    public List<DemandePersonalisee> findAll(){
        return demandePersonaliseeService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody DemandePersonalisee demandePersonalisee){
        this.demandePersonaliseeService.save(demandePersonalisee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        demandePersonaliseeService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public DemandePersonalisee findById(@PathVariable long id){
        return demandePersonaliseeService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody DemandePersonalisee demandePersonalisee){
        this.demandePersonaliseeService.update(demandePersonalisee);
    }
}
