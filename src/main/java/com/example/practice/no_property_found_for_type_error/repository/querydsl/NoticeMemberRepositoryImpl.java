package com.example.practice.no_property_found_for_type_error.repository.querydsl;

import com.example.practice.no_property_found_for_type_error.entity.NoticeMember;
import com.example.practice.no_property_found_for_type_error.repository.querydsl.interfaces.NoticeMemberQuerydsl;

import java.util.List;

public class NoticeMemberRepositoryImpl implements NoticeMemberQuerydsl {

    @Override
    public List<NoticeMember> getNoticeMemberList() {
        return null;
    }
}
