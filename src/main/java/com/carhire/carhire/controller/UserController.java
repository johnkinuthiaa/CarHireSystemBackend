//package com.carhire.carhire.controller;
//
//import com.carhire.carhire.dto.UserReqRes;
//import com.carhire.carhire.models.User;
//import com.carhire.carhire.service.UserService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    private final UserService service;
//
//    public UserController(UserService service) {
//        this.service = service;
//    }
//
//    @PostMapping("register")
//    public User createNewUser(@RequestBody User userDetails){
//        return service.createUser(userDetails);
//    }
//}
