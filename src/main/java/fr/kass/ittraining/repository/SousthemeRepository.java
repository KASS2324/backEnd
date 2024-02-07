package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Soustheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousthemeRepository extends JpaRepository<Soustheme,Long> {
}
