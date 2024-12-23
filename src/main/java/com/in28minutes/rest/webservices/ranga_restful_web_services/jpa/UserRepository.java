package com.in28minutes.rest.webservices.ranga_restful_web_services.jpa;

import com.in28minutes.rest.webservices.ranga_restful_web_services.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
