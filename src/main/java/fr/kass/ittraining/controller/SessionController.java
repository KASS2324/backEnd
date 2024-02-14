package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.Session;
import fr.kass.ittraining.service.SessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
@CrossOrigin
public class SessionController {


    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping("/all")
    public List<Session> findAll(){
        return sessionService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Session session){
        sessionService.save(session);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        sessionService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Session findById(@PathVariable long id){
        return sessionService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody Session session){
        sessionService.update(session);
    }

    @GetMapping("/formations/{id}")
    public List<Session> findSessionsFormation(@PathVariable long id){ return sessionService.findIdSessionsFormation(id);}


}
