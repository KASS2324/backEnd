package fr.kass.ittraining.service;

import fr.kass.ittraining.exception.NotFoundException;
import fr.kass.ittraining.model.User;
import fr.kass.ittraining.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(
                () -> new NotFoundException("user d'Id "+id+" non trouvée")
        );
    }

    public void save(User user){
        userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public void update(User user){
        userRepository.save(user);
    }

    public User findByEmail(String email){ return userRepository.findByEmail(email);}
    public Long getUserId(User user) {return user.getId();}

    public Long getUserIdByEmail(String email){
        User user= findByEmail(email);
        Long user_id=getUserId(user);
        return user_id;
    }

    // Voir demande personalisee service pour les requêtes demandes...


}
