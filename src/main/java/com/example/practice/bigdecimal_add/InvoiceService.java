package com.example.practice.bigdecimal_add;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class InvoiceService {

    public static void main(String[] args) {
        List<Invoice> invoiceList = Arrays.asList(
                new Invoice("a001", BigDecimal.valueOf(20.9), 2),
                new Invoice("a002", BigDecimal.valueOf(5.15), 4),
                new Invoice("a003", BigDecimal.valueOf(12.19), 3),
                new Invoice("a004", BigDecimal.valueOf(3.999), 1)
        );

        BigDecimal sum4 =
                invoiceList.stream().map(Invoice::getUnitPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("sum4 : " + sum4);

        BigDecimal bigDecimal1 = BigDecimal.valueOf(invoiceList.get(0).getQuantity());

        BigDecimal sum5 = invoiceList.stream().map(invoice -> invoice.getUnitPrice().multiply(BigDecimal.valueOf(invoice.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("sum5 : " + sum5);


        //stream을 사용하지 않는 경우
        List<BigDecimal> bigDecimalList = Arrays.asList(
                BigDecimal.valueOf(1.123),
                BigDecimal.valueOf(0.335),
                BigDecimal.valueOf(2.10101),
                BigDecimal.valueOf(0.54321)
        );

        BigDecimal sum1 = BigDecimal.ZERO;
        for (BigDecimal eachValue : bigDecimalList) {
            sum1 = sum1.add(eachValue);
        }
        System.out.println("sum1 : " + sum1);

        BigDecimal sum2 = bigDecimalList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("sum2 : " + sum2);

        BigDecimal sum3 = bigDecimalList.stream().reduce(BigDecimal.ZERO, (x, y) -> x.add(y));
        System.out.println("sum3 : " + sum3);
    }
}
