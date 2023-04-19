package com.example.practice.keyword_issue.repository;

import com.example.practice.keyword_issue.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Order, Long> {
}
