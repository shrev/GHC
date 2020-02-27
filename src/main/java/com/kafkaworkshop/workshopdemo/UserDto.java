package com.kafkaworkshop.workshopdemo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    Integer userId;
    String userName;

    public UserDto(String userName, Integer userId) {
        this.userName = userName;
        this.userId = userId;
    }


}
