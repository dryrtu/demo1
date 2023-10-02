package com.example.springboot.model.mapper;

import com.example.springboot.entity.User;
import com.example.springboot.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone(user.getPhone());
        tmp.setAvartar(user.getAvartar());

        return tmp;
    }
}
