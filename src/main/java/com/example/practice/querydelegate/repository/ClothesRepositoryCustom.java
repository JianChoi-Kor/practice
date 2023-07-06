package com.example.practice.querydelegate.repository;

import com.example.practice.querydelegate.RequestState;
import com.example.practice.querydelegate.entity.Clothes;

import java.util.List;

public interface ClothesRepositoryCustom {

    List<Clothes> findAllByRequestState(RequestState requestState);
}
