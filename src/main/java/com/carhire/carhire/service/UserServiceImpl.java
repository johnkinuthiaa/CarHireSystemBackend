package com.carhire.carhire.service;

import com.carhire.carhire.dto.UserReqRes;
import com.carhire.carhire.models.User;
import com.carhire.carhire.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;


    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserReqRes createNewUser(UserReqRes user) {
        UserReqRes response =new UserReqRes();
        try{
            User newUser = new User();
            if(repository.findById(user.getId()).isEmpty()){
                newUser.setUsername(user.getUsername());
                newUser.setId(user.getId());
                newUser.setEmail(user.getEmail());
                newUser.setPassword(user.getPassword());
                repository.save(newUser);
                response.setStatusCode(200);
                response.setMessage("user Created Successfully");
                response.setUser(newUser);

            }

        } catch (Exception e) {
            response.setStatusCode(500);
            response.setError(e.getMessage());
            throw new RuntimeException(e);
        }
        return response;
    }
}
