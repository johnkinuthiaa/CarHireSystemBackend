package com.carhire.carhire.controller;

import com.carhire.carhire.dto.UserReqRes;
import com.carhire.carhire.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping("/register")
    public ResponseEntity<UserReqRes> createNewUser(@RequestBody UserReqRes user){
        return ResponseEntity.ok(service.createNewUser(user));
    }
}
