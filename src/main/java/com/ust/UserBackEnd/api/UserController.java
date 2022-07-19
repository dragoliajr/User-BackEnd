package com.ust.UserBackEnd.api;

import com.ust.UserBackEnd.model.User;
import com.ust.UserBackEnd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="users/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){this.userService =userService;}

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    int insertUser(@RequestBody User user){return userService.insertUser(user);}

    @PutMapping(value = "{uname}")//put don't work
    int updateUser(@PathVariable("uname") String uname, @RequestBody User user ){
        return userService.updateUser(uname, user);
    }
    @DeleteMapping(value = "{uname}")
    int deleteUser(@PathVariable("uname") String uname){
        return userService.deleteUser(uname);
    }
    @GetMapping
    List<User> queryUser() {
        return userService.queryUser();
    }
    @GetMapping(value = "{uname}")
    Optional<User> queryUser(@PathVariable("uname") String uname){
        return  userService.queryUser((uname));
    }

}
