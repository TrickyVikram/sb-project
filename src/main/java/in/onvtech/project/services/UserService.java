package in.onvtech.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.onvtech.project.entities.User;
import in.onvtech.project.repositories.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

   public  String getAllUsers(){

    return "user";

   }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return (List<User>) userRepo.saveAll(users);
    }

    public List<User> getUsers() {
        return (List<User>) userRepo.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepo.findById(id);
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public User updateUser(Integer id, User userDetails) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPhone(userDetails.getPhone());

        return userRepo.save(user);
        
    }
}
