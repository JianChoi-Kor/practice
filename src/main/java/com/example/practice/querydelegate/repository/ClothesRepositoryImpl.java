package com.example.practice.querydelegate.repository;

import static com.example.practice.querydelegate.entity.QClothes.clothes;

import com.example.practice.querydelegate.RequestState;
import com.example.practice.querydelegate.entity.Clothes;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class ClothesRepositoryImpl implements ClothesRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Clothes> findAllByRequestState(RequestState requestState) {
        BooleanBuilder builder = new BooleanBuilder();

        if (requestState.equals(RequestState.A)) {
            builder.and(clothes.category.eq(Clothes.Category.TOP)).and(clothes.price.between(10000L, 30000L));
        }
        else if (requestState.equals(RequestState.B)) {
            builder.and(clothes.category.eq(Clothes.Category.TOP)).and(clothes.price.between(40000L, 50000L));
        }
        else if (requestState.equals(RequestState.C)) {
            builder.and(clothes.category.eq(Clothes.Category.PANTS)).and(clothes.price.between(30000L, 50000L));
        }

        JPAQuery<Clothes> query = new JPAQuery<>(em);

        return query.select(clothes)
                .from(clothes)
                .where(clothes.code.isCodeStartWithA())
                .fetch();
    }
}
