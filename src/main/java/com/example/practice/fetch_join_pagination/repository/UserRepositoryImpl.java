package com.example.practice.fetch_join_pagination.repository;

import static com.example.practice.fetch_join_pagination.entity.QUser.user;
import static com.example.practice.fetch_join_pagination.entity.QAccount.account;

import com.example.practice.fetch_join_pagination.entity.User;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.domain.PageRequest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Pageable;
import java.util.List;

public class UserRepositoryImpl implements UserQuerydsl {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getUserListWithPagination() {

        JPAQuery<User> query = new JPAQuery<>(em);

        return query.from(user)
                .join(user.accounts, account).fetchJoin()
                .offset(0)
                .limit(10)
                .fetch();
    }
}
