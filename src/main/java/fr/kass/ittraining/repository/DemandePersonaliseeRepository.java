package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.DemandePersonalisee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandePersonaliseeRepository extends JpaRepository<DemandePersonalisee,Long> {
}
