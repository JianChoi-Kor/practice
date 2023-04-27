package com.example.practice.fetch_join_pagination.repository;

import com.example.practice.fetch_join_pagination.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserQuerydsl {

}
