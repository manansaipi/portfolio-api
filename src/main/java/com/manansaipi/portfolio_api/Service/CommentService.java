package com.manansaipi.portfolio_api.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manansaipi.portfolio_api.Models.Comment;
import com.manansaipi.portfolio_api.Repository.CommentRepository;


@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> response() {
        return commentRepository.findAll();
    }
}

