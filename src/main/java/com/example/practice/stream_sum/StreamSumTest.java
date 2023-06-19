package com.example.practice.stream_sum;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.reducing;

public class StreamSumTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer sum = numbers.stream().collect(reducing(0, Integer::sum));
    }
}
