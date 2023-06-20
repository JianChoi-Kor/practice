package com.example.practice.join_table.many_to_many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Class {

    @Id
    @Column(name = "class_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
