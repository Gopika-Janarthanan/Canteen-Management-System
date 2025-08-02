package com.example.CanteenManagemetSystem.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_id")
    private int id;

    @Column(name="User_name")
    public String name;

    @Column(name="email")
    public String email;

    @Column(name="password")
    private String password;

    @Column(name = "role")
    private String role;

}
