package com.example.practice.fetch_join_pagination.repository;

import com.example.practice.fetch_join_pagination.entity.User;

import java.util.List;

public interface UserQuerydsl {

    List<User> getUserListWithPagination();
}
