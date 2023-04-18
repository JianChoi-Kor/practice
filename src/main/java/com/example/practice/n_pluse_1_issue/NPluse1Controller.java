package com.example.practice.n_pluse_1_issue;

import com.example.practice.n_pluse_1_issue.entity.Board;
import com.example.practice.n_pluse_1_issue.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class NPluse1Controller {

    private final BoardRepository boardRepository;

    @GetMapping("/")
    public void nPluse1Test() {
        List<Board> boardList = boardRepository.findAll();
        for(Board board : boardList) {
            System.out.println(board.getBoardCategory().getCategoryName());
        }
    }
}
