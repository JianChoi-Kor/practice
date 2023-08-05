package com.example.practice.builder;

public class BuilderMain {

//    public static void main(String[] args) {
//
//        //builder를 통한 객체 인스턴스 생성
//        Order order = Order.builder()
//                .orderNumber("order123")
//                .productName("something")
//                .totalPrice(1000L)
//                .build();
//
//        System.out.println("order: " + order);
//        //order: Order(orderNumber=order123, productName=something, totalPrice=1000)
//
//        //toBuilder() 메서드를 사용했을 때 OrderBuilder를 반환
//        Order.OrderBuilder orderBuilder = order.toBuilder();
//
//        Order updateOrder = order.toBuilder()
//                .totalPrice(2000L)
//                .build();
//
//        System.out.println("updateOrder: " + updateOrder);
//        //updateOrder: Order(orderNumber=order123, productName=something, totalPrice=2000)
//    }

//    public static void main(String[] args) {
//        Order order = Order.builder()
//                .orderNumber("order123")
//                .productName("something")
//                .totalPrice(1000L)
//
//                //@Singular("stringListItem")
//                .stringListItem("list1")
//                .stringListItem("list2")
//                .stringListItem("list3")
//
//                //@Singular("stringMapItem")
//                .stringMapItem("key1", "value1")
//                .stringMapItem("key2", "value2")
//                .stringMapItem("key3", "value3")
//                .build();
//
//        System.out.println("order: " + order);
//    }

    public static void main(String[] args) {
        Order order = Order.builder().build();
        System.out.println("order: " + order);
    }
}
