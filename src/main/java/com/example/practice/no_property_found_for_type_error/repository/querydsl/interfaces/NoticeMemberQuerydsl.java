package com.example.practice.no_property_found_for_type_error.repository.querydsl.interfaces;

import com.example.practice.no_property_found_for_type_error.entity.NoticeMember;

import java.util.List;

public interface NoticeMemberQuerydsl {
    List<NoticeMember> getNoticeMemberList();
}
