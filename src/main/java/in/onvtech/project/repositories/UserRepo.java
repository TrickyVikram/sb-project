package in.onvtech.project.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import in.onvtech.project.entities.User;

public interface UserRepo  extends JpaRepository<User, Integer> {
  List<User> findByName(String name);
    
} 