package com.example.practice.querydelegate;

import com.example.practice.querydelegate.entity.Clothes;
import com.example.practice.querydelegate.repository.ClothesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/querydsl")
public class QueryDelegateTestController {

    private final ClothesRepository clothesRepository;

    @GetMapping("")
    public ResponseEntity<?> test() {
        List<Clothes> clothesList = clothesRepository.findAllByRequestState(RequestState.B);
        return ResponseEntity.ok(clothesList);
    }
}
