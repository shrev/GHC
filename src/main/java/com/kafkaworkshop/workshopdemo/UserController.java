package com.kafkaworkshop.workshopdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {

    UserService userService;

    @RequestMapping(Constants.GET_USER_ID_BY_NAME)
    public UserDto getUserIdByName(@PathVariable String userName) {
        return userService.getUserIdByName(userName);
    }

    @RequestMapping(value = Constants.REGISTER_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.registerUser(userDto);
    }
}
