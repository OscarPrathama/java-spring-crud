package com.cruds.services;

import java.util.List;

import com.cruds.models.User;

public interface UserService {

    /**
     * get all user
     * */
    List<User> getAllUsers();

    /**
     * specifies that a method should not have a return value
    */
    void saveUser(User user);

    /**
     * get entity by id
     * */
    User getUserById(long id);

    /**
     * delete entity by id
     * */
    void deleteUserById(long id);

}
