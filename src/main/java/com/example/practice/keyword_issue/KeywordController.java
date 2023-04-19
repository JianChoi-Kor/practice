package com.example.practice.keyword_issue;

import com.example.practice.keyword_issue.entity.Order;
import com.example.practice.keyword_issue.repository.ActionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class KeywordController {

    private final ActionRepository actionRepository;

    @GetMapping(value = "/keyword")
    public void keywordTest() {
        List<Order> orderList = actionRepository.findAll();
        System.out.println("result");
    }
}
