package com.example.practice.querydelegate.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clothes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private Category category;
    private Long price;
    private Boolean isExposed;

    @Getter
    public enum Category {
        TOP,
        PANTS,
        OUTER,
        DRESS;
    }
}
