package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.Theme;
import fr.kass.ittraining.service.ThemeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/themes")
@CrossOrigin
public class ThemeController {

    private final ThemeService themeService;

    public ThemeController(ThemeService themeService) {
        this.themeService = themeService;
    }

    @GetMapping("/all")
    public List<Theme> findAll(){
        return themeService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Theme theme){
        themeService.save(theme);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        themeService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Theme findById(@PathVariable long id){
        return themeService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody Theme theme){
        themeService.update(theme);
    }
}
