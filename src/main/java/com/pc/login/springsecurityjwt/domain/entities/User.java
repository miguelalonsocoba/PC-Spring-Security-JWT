package com.pc.login.springsecurityjwt.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", nullable = false, unique = true, length = 250)
    private String username;

    @Column(name = "password", nullable = false, length = 250)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "id_users", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_roles", referencedColumnName = "id"))
    private List<Role> roles = new ArrayList<>();
}
