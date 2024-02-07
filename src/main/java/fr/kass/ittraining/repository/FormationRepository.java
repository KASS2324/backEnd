package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
