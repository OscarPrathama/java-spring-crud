package com.cruds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cruds.models.User;

@Repository
// JpaRepository<Type / Entity, ID (Data type entity id)>
public interface UserRepository extends JpaRepository<User, Long> {
    
}
