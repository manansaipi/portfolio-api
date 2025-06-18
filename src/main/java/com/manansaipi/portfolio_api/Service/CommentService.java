package com.manansaipi.portfolio_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manansaipi.portfolio_api.models.Comment;
import com.manansaipi.portfolio_api.repository.CommentRepository;


@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAll() {
        return commentRepository.findAll();
    }
}

