package fr.kass.ittraining.controller;

import fr.kass.ittraining.model.User;
import fr.kass.ittraining.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    // private final SessionService sessionService;

    //public UserController(UserService userService, SessionService sessionService) {
        // this.userService = userService;
        //this.sessionService = sessionService;
    // }

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        userService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable long id){
        return userService.findById(id);
    }

    @PatchMapping("/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }


    // @GetMapping("/searchBySessionId/{id}")
    // public List<User> searchBySessionId(@PathVariable Long id){return userService.findBySessionId(id);}

    // @GetMapping("/searchByDate")
    // @ResponseBody
    // public List<User> searchByDateEndSession(@RequestParam(required = false) String date){ return userService.searchByDateEndSession(date); }
}
