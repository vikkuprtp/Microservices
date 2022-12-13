package com.vp.user.service.entities;

import jakarta.persistence.*;


@Entity
@Table(name="micro_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long userId;

    @Column(name = "NAME")
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;

}
