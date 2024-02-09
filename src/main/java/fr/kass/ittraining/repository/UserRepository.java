package fr.kass.ittraining.repository;

import fr.kass.ittraining.model.Formation;
import fr.kass.ittraining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // @Query(value = "SELECT u.nom, u.prenom FROM user u INNER JOIN session_user su on u.id=su.id_user INNER JOIN session s on su.id_session=s.id WHERE s.date_end_session LIKE '%date%'", nativeQuery = true)
    // List<User> searchBySessionDateEndSessionLike(@Param("date") String date);

    // @Query(value="SELECT u.nom, u.prenom FROM user u INNER JOIN session_user su on u.id=su.id_user INNER JOIN session s on su.id_session=s.id WHERE s.id = :id", nativeQuery = true)
   //  List<User> findBySessionId(Long id);
}
