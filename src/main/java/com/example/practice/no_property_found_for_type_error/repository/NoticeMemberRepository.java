package com.example.practice.no_property_found_for_type_error.repository;

import com.example.practice.no_property_found_for_type_error.entity.NoticeMember;
import com.example.practice.no_property_found_for_type_error.repository.querydsl.interfaces.NoticeMemberQuerydsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeMemberRepository extends JpaRepository<NoticeMember, Long>, NoticeMemberQuerydsl {
}
