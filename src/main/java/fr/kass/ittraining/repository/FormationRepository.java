package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {

    // List<Formation> findByTheme(String theme);

    List<Formation> findByVille(String ville);

    // List<Formation> findByThemeAndVille(String theme, String ville);
}
