package com.in28minutes.restfulwebservices.jpa;

import com.in28minutes.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
