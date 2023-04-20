package com.example.practice.n_pluse_1_issue.repository;

import com.example.practice.n_pluse_1_issue.entity.Board;

import java.util.List;

public interface BoardQuerydsl {
    List<Board> findAllApplyFetchJoin();
}
