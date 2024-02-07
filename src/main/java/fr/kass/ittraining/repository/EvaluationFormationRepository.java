package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.EvaluationFormation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationFormationRepository extends JpaRepository<EvaluationFormation,Long> {
}
