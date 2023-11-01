package com.ostap.todolist.repository;

import com.ostap.todolist.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {

}
