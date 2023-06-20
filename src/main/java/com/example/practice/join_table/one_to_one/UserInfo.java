package com.example.practice.join_table.one_to_one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private Long id;

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "userInfo")
    private User user;
}
