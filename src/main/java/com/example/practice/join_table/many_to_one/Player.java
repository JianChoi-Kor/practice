package com.example.practice.join_table.many_to_one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Player {

    @Id
    @Column(name = "player_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false)
    @JoinTable(name = "player_grade",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "grade_id"))
    private Grade grade;
}
