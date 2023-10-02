package com.example.springboot.service;

import com.example.springboot.entity.User;
import com.example.springboot.model.dto.UserDto;
import com.example.springboot.model.request.CreateUserReq;
import com.example.springboot.model.request.UpdateUserReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();

    public UserDto getUserbyID(int id);

    public List<UserDto> searchUser(String name);

    public UserDto createUser(CreateUserReq req);

    public UserDto updateUser(UpdateUserReq req, int id);

    public boolean deleteUser(int id);
}
