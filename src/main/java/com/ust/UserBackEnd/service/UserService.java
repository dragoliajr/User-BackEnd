package com.ust.UserBackEnd.service;
import com.ust.UserBackEnd.dao.UserDao;

import com.ust.UserBackEnd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public  UserService(@Qualifier("UserRepository") UserDao userDao){this.userDao = userDao;}
    public int insertUser(User user){return userDao.insertUser(user);}
    public int updateUser(String uname, User user){return userDao.updateUser(uname, user);}
    public int deleteUser(String uname){return userDao.deleteUser(uname);}
    public List<User> queryUser() {return userDao.queryUser();}
    public Optional<User> queryUser(String uname){return userDao.queryUser(uname);}



}
