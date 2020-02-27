package com.kafkaworkshop.workshopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserDto getUserIdByName(String userId);
    void registerUser(UserDto userDto);
}


