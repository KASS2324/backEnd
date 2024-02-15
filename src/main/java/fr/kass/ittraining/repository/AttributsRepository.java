package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Attributs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributsRepository extends JpaRepository<Attributs,Long> {

    List<Attributs> findByNomContaining(String nom);

}
