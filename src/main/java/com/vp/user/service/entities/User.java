package com.vp.user.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="micro_users")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private String userId;
    @Column(name = "NAME")
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;

}
