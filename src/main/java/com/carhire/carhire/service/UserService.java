package com.carhire.carhire.service;

import com.carhire.carhire.dto.UserReqRes;
import com.carhire.carhire.models.User;

public interface UserService {
    UserReqRes createNewUser(UserReqRes user);

}