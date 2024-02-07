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

    @GetMapping("/email/{email}")
    public User findByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    @GetMapping("email_user_id/{email}")
    public Long getUserIdByEmail(@PathVariable String email){ return userService.getUserIdByEmail(email); }
}
