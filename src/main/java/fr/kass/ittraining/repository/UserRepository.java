package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
