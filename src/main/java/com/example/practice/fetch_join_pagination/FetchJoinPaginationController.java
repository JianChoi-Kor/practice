package com.example.practice.fetch_join_pagination;

import com.example.practice.fetch_join_pagination.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FetchJoinPaginationController {

    private final UserRepository userRepository;

    @GetMapping("/fetchJoin")
    public ResponseEntity<?> fetchJoinTest() {
        return ResponseEntity.ok(userRepository.getUserListWithPagination());
    }
}
