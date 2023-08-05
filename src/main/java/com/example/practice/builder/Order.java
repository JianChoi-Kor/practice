package com.example.practice.builder;

import lombok.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ToString
@Getter
public class Order {

    private String orderNumber;
    private String productName;
//    private Long totalPrice;
//    private int quantity;


    @Builder.Default
    private Long totalPrice = 100L;
    @Builder.Default
    private int quantity = 1;

//    private List<String> stringList;
//    private Map<String, String> stringMap;
//
//    @Builder
//    public Order(String orderNumber, String productName, Long totalPrice,
//                 @Singular("stringListItem") List<String> stringList,
//                 @Singular("stringMapItem") Map<String, String> stringMap) {
//        this.orderNumber = orderNumber;
//        this.productName = productName;
//        this.totalPrice = totalPrice;
//        this.stringList = stringList;
//        this.stringMap = stringMap;
//    }


    @Builder
    public Order(String orderNumber, String productName, Long totalPrice, int quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }
}
