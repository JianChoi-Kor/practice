package com.example.practice.sequence_test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Map;

public interface TestRepository extends JpaRepository<Test, Long> {

    @Query(value = "select nextval('test_sequence') from dual", nativeQuery = true)
    Long nextval();
}
