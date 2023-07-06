package com.example.practice.querydelegate.repository;

import com.example.practice.querydelegate.entity.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepository extends JpaRepository<Clothes, Long>, ClothesRepositoryCustom {
}
