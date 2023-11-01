package com.ostap.todolist.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;


@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private boolean enabled;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Todo> todos = new LinkedList<>();



}
