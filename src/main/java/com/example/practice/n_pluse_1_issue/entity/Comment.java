package com.example.practice.n_pluse_1_issue.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
//@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "board_id", nullable = false)
//    private Board board;
}
