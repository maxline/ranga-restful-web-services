package com.in28minutes.restfulwebservices.jpa;

import com.in28minutes.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
