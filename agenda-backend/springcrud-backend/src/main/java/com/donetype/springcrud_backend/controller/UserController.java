package com.donetype.springcrud_backend.controller;
import com.donetype.springcrud_backend.exception.UserNotFoundException;
import com.donetype.springcrud_backend.model.User;
import com.donetype.springcrud_backend.repository.UserRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> Users(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
            return userRepository.findById(id)
                    .orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newuser,@PathVariable Long id){
        return userRepository.findById(id)
                .map(user ->
                        {
                            user.setName(newuser.getName());
                            user.setUsername(newuser.getUsername());
                            user.setEmail(newuser.getEmail());
                            return userRepository.save(user);
                        }).orElseThrow(()-> new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        if (!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id " +id+ " has been deleted success.";
    }
}
