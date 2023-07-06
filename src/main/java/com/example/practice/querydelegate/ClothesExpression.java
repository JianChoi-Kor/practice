package com.example.practice.querydelegate;

import com.example.practice.querydelegate.entity.Clothes;
import com.example.practice.querydelegate.entity.QClothes;
import com.querydsl.core.annotations.QueryDelegate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.StringPath;

import static com.example.practice.querydelegate.entity.QClothes.clothes;

public class ClothesExpression {

    @QueryDelegate(Clothes.class)
    public static BooleanExpression byRequestState(QClothes clothes, RequestState requestState) {

        if (requestState.equals(RequestState.A)) {
            return clothes.category.eq(Clothes.Category.TOP).and(clothes.price.between(10000L, 30000L));
        }
        else if (requestState.equals(RequestState.B)) {
            return clothes.category.eq(Clothes.Category.TOP).and(clothes.price.between(40000L, 50000L));
        }
        else if (requestState.equals(RequestState.C)) {
            return clothes.category.eq(Clothes.Category.PANTS).and(clothes.price.between(30000L, 50000L));
        } else {
            return null;
        }
    }

    @QueryDelegate(String.class)
    public static BooleanExpression isCodeStartWithA(StringPath stringPath) {
        return stringPath.startsWith("A");
    }
}
