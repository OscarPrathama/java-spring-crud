package com.cruds.services;

import java.util.List;

import com.cruds.models.User;
import com.cruds.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
	private UserRepository userRepository;

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user){
        this.userRepository.save(user);
    }

}
