package com.example.springboot.service;

import com.example.springboot.entity.User;
import com.example.springboot.exception.NotFoundException;
import com.example.springboot.model.dto.UserDto;
import com.example.springboot.model.mapper.UserMapper;
import com.example.springboot.model.request.CreateUserReq;
import com.example.springboot.model.request.UpdateUserReq;
import com.sun.jdi.request.DuplicateRequestException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Nguyễn Thị Mộng Mơ", "mongmo@gmail.com","0987654321","avatar.img","123"));
        users.add(new User(2, "Bùi Như Lạc", "laclac@gmail.com","0123456789","avatar1.img","123"));
        users.add(new User(3, "Phan Thị Lỏng Lẻo", "longleo@gmail.com","0987564664","avatar3.img","123"));
        users.add(new User(4, "Bành Thị Tèo", "teo@gmail.com","0874845455","avatar9.img","123"));
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user:users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserbyID(int id) {
        for (User user : users){
            if (user.getId()==id){
                return UserMapper.toUserDto(user);
            }
        }
        throw new NotFoundException("No user found");
    }

    @Override
    public List<UserDto> searchUser(String name) {
        List<UserDto> result = new ArrayList<>();
        for (User user : users){
            if (user.getName().contains(name)){
                result.add(UserMapper.toUserDto(user));
            }
        }
        return  result;
    }

    @Override
    public UserDto createUser(CreateUserReq req) {
        User user = new User();
        user.setId(users.size()+1);
        user.setPhone(req.getPhone());
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        user.setPassword(BCrypt.hashpw(req.getPassword(),BCrypt.gensalt(12)));
        users.add(user);
        return UserMapper.toUserDto(user);
    }

    @Override
    public UserDto updateUser(UpdateUserReq req, int id) {
        for (User user : users) {
            if (user.getId() == id) {
                if (!user.getEmail().equals(req.getEmail())) {
                    // Check new email exist
                    for (User tmp : users) {
                        if (tmp.getEmail().equals(req.getEmail())) {
                            throw new DuplicateRequestException("New email already exists in the system");
                        }
                    }
                    user.setEmail(req.getEmail());
                }
                user.setName(req.getName());
                user.setPhone(req.getPhone());
                user.setAvartar(req.getAvatar());
                user.setPassword(BCrypt.hashpw(req.getPassword(), BCrypt.gensalt(12)));
                return UserMapper.toUserDto(user);
            }
        }

        throw new NotFoundException("No user found");
    }

    @Override
    public boolean deleteUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return true;
            }
        }

        throw new NotFoundException("No user found");
    }
}
