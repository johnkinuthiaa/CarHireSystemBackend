package com.carhire.carhire.dto;

import com.carhire.carhire.models.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserReqRes {
    private int statusCode;
    private String error;
    private String message;
    private String username;
    private String email;
    public String password;
    private List<User> users;
    private User user;
    private Long id;

}
