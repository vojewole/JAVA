package com.victor.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.bookclub.models.LoginUser;
import com.victor.bookclub.models.User;
import com.victor.bookclub.repositories.UserRepository;

    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser) {
        // TO-DO: Additional validations!
    	String passwordEntered = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(passwordEntered);
        return userRepo.save(newUser);
    }
    
    public User login(LoginUser newLoginObject) {
        // TO-DO: Additional validations!
    	Optional <User> foundUser = this.userRepo.findByEmail(newLoginObject.getEmail());
    	if (foundUser.isEmpty() || 
    		! BCrypt.checkpw(newLoginObject.getPassword(), 
    		foundUser.get().getPassword())) return null;
        return foundUser.get();
    }
    
    public UserService(UserRepository userRepository) {
        this.userRepo= userRepository;
    }
    // returns all the Users
    public List<User> allUsers() {
        return userRepo.findAll();
    }
    // creates a user
    public User createUser(User u) {
        return userRepo.save(u);
    }
    // retrieves a user
    public User findUser(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }
    
    
    public User updateUser(User u) 
    
    {	
    	return userRepo.save(u);
    }
    
    public void deleteUser(Long id) {
    	userRepo.deleteById(id);
    }
}
