package com.bigbasket.bigbasketapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bigbasket.bigbasketapi.model.UserModel;
import com.bigbasket.bigbasketapi.repository.UserRepository;

@Service
public class UserService {

    private com.bigbasket.bigbasketapi.repository.UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository =userRepository;
    }

    public List<UserModel> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<UserModel> getUserById(int id) {
        return userRepository.findById(id);
    }

    public UserModel createUser(UserModel user){
        return userRepository.save(user);
    }

    public UserModel findBymobileAndPassword(String mobile, String password) {
        return   userRepository.findByMobileAndPassword(mobile,password);
    }

    public UserModel registerUser(UserModel user) {
        if (userRepository.existsByMobile(user.getMobile())) {
            return null; // Registration failed due to duplicate username
        }
        else{

            return userRepository.save(user);
        }

        // UserModel newUser = new UserModel();
        // newUser.setUsername(user.getUsername());
        // newUser.setPassword(user.getPassword());

        
    }
    

    public UserModel findUser(UserModel user) {
        if (userRepository.existsByMobile(user.getMobile())) {
            return userRepository.findByMobileAndPassword(user.getMobile(), user.getPassword());
        }
        else{

            return null;
        }
    }

   
}
