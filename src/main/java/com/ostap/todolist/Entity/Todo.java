package com.ostap.todolist.Entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String task;
    private boolean completed;
    @ManyToOne(fetch = FetchType.LAZY)
    private Users user;
}