package com.in28minutes.rest.webservices.ranga_restful_web_services.jpa;

import com.in28minutes.rest.webservices.ranga_restful_web_services.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
