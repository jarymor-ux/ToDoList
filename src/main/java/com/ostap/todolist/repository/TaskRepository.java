package com.ostap.todolist.repository;

import com.ostap.todolist.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Todo, Integer>{
}
