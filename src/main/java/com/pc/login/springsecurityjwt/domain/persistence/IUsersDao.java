package com.pc.login.springsecurityjwt.domain.persistence;

import com.pc.login.springsecurityjwt.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsersDao extends JpaRepository<User, Integer> {
    // Method to search for a user by name.
    Optional<User> findByUsername(String username);
    // Method to verify if a user exists in our database.
    Boolean existsByUsername(String username);

}
