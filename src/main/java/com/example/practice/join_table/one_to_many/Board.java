package com.example.practice.join_table.one_to_many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(name = "title")
    private String title;

//    @OneToMany
//    @JoinTable(name = "board_comment",
//            joinColumns = @JoinColumn(name = "board_id"),
//            inverseJoinColumns = @JoinColumn(name = "comment_id"))
//    private List<Comment> comments = new ArrayList<Comment>();
}
