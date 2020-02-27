package com.kafkaworkshop.workshopdemo;

public class UserConverter {
    public static User dtoToEntity(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setUserId(userDto.getUserId());
        return user;
    }

    public static UserDto entityToDto(User user) {
        UserDto userDto = new UserDto(user.getUserName(), (user.getUserId()));
        return userDto;
    }
}
