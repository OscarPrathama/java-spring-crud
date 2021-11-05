package com.cruds.repositories;

import com.cruds.models.Post;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<Type / Entity, ID (Data type entity id)>
*/
public interface PostRepository extends JpaRepository<Post, Long> {
    // do your magic here...
}
