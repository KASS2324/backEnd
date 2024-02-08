package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.Theme;
import fr.kass.ittraining.repository.ThemeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService {

    private final ThemeRepository themeRepository;

    public ThemeService(ThemeRepository themeRepository) {
        this.themeRepository = themeRepository;
    }

    public List<Theme> findAll(){
        return themeRepository.findAll();
    }

    public Theme findById(Long id){
        return themeRepository.findById(id).orElseThrow(
                () -> new NotFoundException("theme d'Id "+id+" non trouvé")
        );
    }

    public void save(Theme theme){
        themeRepository.save(theme);
    }

    public void deleteById(Long id){
        themeRepository.deleteById(id);
    }

    public void update(Theme theme){
        themeRepository.save(theme);
    }


}
