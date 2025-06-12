package com.manansaipi.portfolio_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manansaipi.portfolio_api.Models.Comment;
import com.manansaipi.portfolio_api.Repository.CommentRepository;
import com.manansaipi.portfolio_api.Service.CommentService;


@RestController
public class MainController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/comment")
    public List<Comment> comment() {
        List<Comment> comments = commentService.response();
        comments.forEach(c -> System.out.println("ID: " + c.getId() + ", Comment: " + c.getComment()));
        return comments;
    }

}
