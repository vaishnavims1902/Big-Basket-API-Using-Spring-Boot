package com.bigbasket.bigbasketapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.bigbasketapi.model.UserModel;
import com.bigbasket.bigbasketapi.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    
   
    @Autowired
    private UserService userService;

    @GetMapping("/customer")
    public UserModel ggetUser() {
        return new UserModel();
    }
    
    @PostMapping("/Register")
    public ApiResponse<UserModel> register(@RequestBody UserModel user) {
        UserModel registeredUser= userService.registerUser(user);
        if (registeredUser != null){
            ApiResponse<UserModel> response = new ApiResponse<>(true, "Registration successful", registeredUser);
            return response;
        }
        else{
            ApiResponse<UserModel> response = new ApiResponse<>(false, "Registration failed", null);
            return response;
        }
    }
    
    @PostMapping("/Login")
    public ApiResponse<UserModel> login(@RequestBody UserModel user) {

        UserModel logedUser = userService.findBymobileAndPassword(user.getMobile(),user.getPassword());
        if (logedUser != null){
            ApiResponse<UserModel> response = new ApiResponse<>(true, "Login successful", logedUser);
            return response;
        }
        else{
            ApiResponse<UserModel> response = new ApiResponse<>(false, "Invalid credentials", null);
            return response;
        }
    }

    
}
