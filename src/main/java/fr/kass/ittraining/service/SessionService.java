package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Session;
import fr.kass.ittraining.repository.SessionRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SessionService {

    private final SessionRepository sessionRepository;
    private final JdbcTemplate jdbcTemplate;


    public SessionService(SessionRepository sessionRepository, JdbcTemplate jdbcTemplate) {
        this.sessionRepository = sessionRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Session> findAll(){
        return sessionRepository.findAll();
    }

    public Session findById(Long id){
        return sessionRepository.findById(id).orElseThrow(
                () -> new NotFoundException("session d'Id "+id+" non trouvée")
        );
    }

    public void save(Session session){
        sessionRepository.save(session);
    }

    public void deleteById(Long id){
        sessionRepository.deleteById(id);
    }

    public void update(Session session){
        sessionRepository.save(session);
    }


    public List<Session> findIdSessionsFormation(Long id) {
        List<Long> sessions_id = new ArrayList<>();
        List<Session> sessions = new ArrayList<>();

        /*RowMapper<Session> sessionRowMapper = (rs, rowNum) -> new Session(rs.getLong("id"),
                rs.getString("date_end_session"),
                rs.getString("date_start_session"),
               null, null);
        ;
        */
        sessions_id = jdbcTemplate.queryForList("SELECT session.id FROM session " +
                "INNER JOIN formation on session.formation_id=formation.id " +
                "WHERE formation.id = ?", Long.class,id);

        for(int i=0 ; i<sessions_id.size();i++){
            Session session = findById(sessions_id.get(i));
            sessions.add(session);
        }
        return sessions;
    }




}
