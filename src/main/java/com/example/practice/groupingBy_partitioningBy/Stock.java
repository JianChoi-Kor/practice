package com.example.practice.groupingBy_partitioningBy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Stock {

    private String name;            //종목명
    private boolean isKospi;        //코스피 여부
    private Long marketCap;         //시가총액 (단위 억 원)
    private Long price;             //주가 (단위 원)
    private INDUSTRY industry;      //업종

    enum INDUSTRY {CHEMISTRY, AUTOMOTIVE, ELECTRONIC}
}
