package com.example.practice.n_pluse_1_issue.repository;

import static com.example.practice.n_pluse_1_issue.entity.QBoard.board;
import static com.example.practice.n_pluse_1_issue.entity.QBoardCategory.boardCategory;

import com.example.practice.n_pluse_1_issue.entity.Board;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BoardRepositoryImpl implements BoardQuerydsl {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Board> getBoardList() {
        JPAQuery<Board> query = new JPAQuery<>(em);
        return query.select(board)
                .from(board)
                .join(boardCategory).on(board.boardCategory.eq(boardCategory))
                .fetch();
    }
}
