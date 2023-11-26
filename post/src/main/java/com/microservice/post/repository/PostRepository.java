package com.microservice.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.post.entity.Post;
public interface PostRepository extends JpaRepository<Post, String> {

}
