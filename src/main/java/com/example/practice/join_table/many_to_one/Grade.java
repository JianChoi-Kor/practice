package com.example.practice.join_table.many_to_one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Entity
public class Grade {
    @Id
    @Column(name = "grade_id")
    private Long id;

    @Column(name = "code")
    private String code;

//    @OneToMany(mappedBy = "grade")
//    private List<Player> players = new ArrayList<Player>();
}
