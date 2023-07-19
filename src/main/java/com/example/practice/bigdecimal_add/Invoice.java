package com.example.practice.bigdecimal_add;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
public class Invoice {

    String invoiceNo;
    BigDecimal unitPrice;
    int quantity;
}
