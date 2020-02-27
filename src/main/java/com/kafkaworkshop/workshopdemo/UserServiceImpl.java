package com.kafkaworkshop.workshopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto getUserIdByName(String userName) {
        return UserConverter.entityToDto(userRepository.getOne(userName));
    }

    @Override
    public void registerUser(UserDto userDto) {
        userRepository.save(UserConverter.dtoToEntity(userDto));
    }

}