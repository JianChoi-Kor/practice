package com.example.practice.sequence_test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sequence")
public class SequenceTestController {

    private final TestRepository testRepository;

    @GetMapping("")
    public ResponseEntity<?> sequenceTest() {
        return ResponseEntity.ok(testRepository.nextval());
    }
}
