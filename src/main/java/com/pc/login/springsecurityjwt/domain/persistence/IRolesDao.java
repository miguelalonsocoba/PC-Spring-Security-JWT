package com.pc.login.springsecurityjwt.domain.persistence;

import com.pc.login.springsecurityjwt.domain.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolesDao extends JpaRepository<Role, Integer> {
    // Method to search for a role by name in our database.
    Optional<Role> findByName(String name);
}
