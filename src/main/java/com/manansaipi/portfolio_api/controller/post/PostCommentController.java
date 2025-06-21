package com.manansaipi.portfolio_api.controller.post;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manansaipi.portfolio_api.service.post.PostService;

import com.manansaipi.portfolio_api.dtos.post.PostCommentDTO;



@RestController
@RequestMapping("/api/comments")
@CrossOrigin(origins = "http://localhost:5173")
public class PostCommentController {

    @Autowired
    private PostService postService;

    @GetMapping()
    public List<PostCommentDTO> getAllComments() {
        return postService.getAllComments();
    }

}
