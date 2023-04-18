package com.example.practice.n_pluse_1_issue.repository;

import com.example.practice.n_pluse_1_issue.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardQuerydsl {
}
