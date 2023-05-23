package com.example.practice.groupingBy_partitioningBy;

import java.util.*;
import java.util.stream.Collectors;

public class ByController {

    public static void main(String[] args) {
        List<Stock> stocks = Arrays.asList(
                new Stock("자바신소재", true, 5400L, 1200L, Stock.INDUSTRY.CHEMISTRY),
                new Stock("코틀린화학", true, 4100L, 2700L, Stock.INDUSTRY.CHEMISTRY),
                new Stock("디비케미칼", false, 11900L, 3100L, Stock.INDUSTRY.CHEMISTRY),
                new Stock("디버깅모터스", false, 2200L, 1900L, Stock.INDUSTRY.AUTOMOTIVE),
                new Stock("깃모빌리티", true, 3000L, 4500L, Stock.INDUSTRY.AUTOMOTIVE),
                new Stock("터미널전자", true, 3200L, 1500L, Stock.INDUSTRY.ELECTRONIC),
                new Stock("익셉션전기", false, 4300L, 2000L, Stock.INDUSTRY.ELECTRONIC),
                new Stock("캐시반도체", true, 1200L, 3600L, Stock.INDUSTRY.ELECTRONIC)
        );

        //partitioningBy()
        Map<Boolean, List<Stock>> stockByIsKospi = stocks.stream().collect(Collectors.partitioningBy(Stock::isKospi));
        List<Stock> kospiStock = stockByIsKospi.get(true);
        List<Stock> kosdaqStock = stockByIsKospi.get(false);

        //partitioningBy() + counting()
        Map<Boolean, Long> stockCountByIsKospi = stocks.stream()
                .collect(Collectors.partitioningBy(Stock::isKospi, Collectors.counting()));
        Long kospiStockCount = stockCountByIsKospi.get(true);
        Long kosdaqStockCount = stockCountByIsKospi.get(false);

        //partitioningBy() + maxBy()
        Map<Boolean, Optional<Stock>> topMarketCapByIsKospi = stocks.stream()
                .collect(Collectors.partitioningBy(Stock::isKospi, Collectors.maxBy(Comparator.comparingLong(Stock::getMarketCap))));
        Optional<Stock> topMarketCapKospiOptionalStock = topMarketCapByIsKospi.get(true);
        Optional<Stock> topMarketCapKosdaqOptionalStock = topMarketCapByIsKospi.get(false);

        //partitioningBy() + maxBy() + collectingAndThen()
        Map<Boolean, Stock> topMarketCapByIsKospiReturnStock = stocks.stream()
                .collect(Collectors.partitioningBy(Stock::isKospi,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Stock::getMarketCap)), Optional::get)));
        Stock topMarketCapKospiStock = topMarketCapByIsKospiReturnStock.get(true);
        Stock topMarketCapKosdaqStock = topMarketCapByIsKospiReturnStock.get(false);

        //partitioningBy() + partitioningBy()
        Map<Boolean, Map<Boolean, List<Stock>>> stockByIsKospiAndPrice = stocks.stream()
                .collect(Collectors.partitioningBy(Stock::isKospi, Collectors.partitioningBy(stock -> stock.getPrice() >= 2500)));
        List<Stock> kospiStockPrice2500more = stockByIsKospiAndPrice.get(true).get(true);
        List<Stock> kosdaqStockPrice2500more = stockByIsKospiAndPrice.get(false).get(true);


        //groupingBy() + toList();
        Map<Stock.INDUSTRY, List<Stock>> stockByGroupList = stocks.stream().collect(Collectors.groupingBy(Stock::getIndustry, Collectors.toList()));
        List<Stock> chemistryList = stockByGroupList.get(Stock.INDUSTRY.CHEMISTRY);
        List<Stock> automotiveList = stockByGroupList.get(Stock.INDUSTRY.AUTOMOTIVE);
        List<Stock> electronicList = stockByGroupList.get(Stock.INDUSTRY.ELECTRONIC);

        //groupingBy() + toSet();
        Map<Stock.INDUSTRY, Set<Stock>> stockByGroupSet = stocks.stream()
                .collect(Collectors.groupingBy(Stock::getIndustry, Collectors.toSet()));

        //groupingBy() + counting()
        Map<Stock.INDUSTRY, Long> stockCountByGrouping = stocks.stream()
                .collect(Collectors.groupingBy(Stock::getIndustry, Collectors.counting()));

        //groupingBy() + maxBy()
        Map<Stock.INDUSTRY, Optional<Stock>> topMarketCapOptionalStockByGrouping = stocks.stream()
                .collect(Collectors.groupingBy(Stock::getIndustry, Collectors.maxBy(Comparator.comparingLong(Stock::getMarketCap))));

        //groupingBy() + maxBy() + collectingAndThen()
        Map<Stock.INDUSTRY, Stock> topMarketCapStockByGrouping = stocks.stream()
                .collect(Collectors.groupingBy(Stock::getIndustry,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Stock::getMarketCap)), Optional::get)));

        //groupingBy() + partitioningBy()
        Map<Stock.INDUSTRY, Map<Boolean, List<Stock>>> stockByGroupingAndPartitioning = stocks.stream()
                .collect(Collectors.groupingBy(Stock::getIndustry, Collectors.partitioningBy(Stock::isKospi)));

        return;
    }
}
