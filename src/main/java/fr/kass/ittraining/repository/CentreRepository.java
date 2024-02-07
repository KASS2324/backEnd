package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreRepository extends JpaRepository<Centre,Long> {

}
