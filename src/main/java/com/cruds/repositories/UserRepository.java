package com.cruds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cruds.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
