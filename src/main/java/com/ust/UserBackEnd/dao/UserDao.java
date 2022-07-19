package com.ust.UserBackEnd.dao;

import com.ust.UserBackEnd.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    int insertUser(User user);
    //int insertUser(User user);
    int updateUser(String uname, User user);
    int deleteUser(String uname);
    List<User> queryUser();
    Optional<User> queryUser(String uname);
}
