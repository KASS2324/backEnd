package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.Session;
import fr.kass.ittraining.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    private final SessionRepository sessionRepository;


    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
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


}
