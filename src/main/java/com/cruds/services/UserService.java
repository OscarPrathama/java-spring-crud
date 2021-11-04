package com.cruds.services;

import java.util.List;

import com.cruds.models.User;

public interface UserService {
    
    List<User> getAllUsers();

    /**
     * specifies that a method should not have a return value
    */
    void saveUser(User user);

}
