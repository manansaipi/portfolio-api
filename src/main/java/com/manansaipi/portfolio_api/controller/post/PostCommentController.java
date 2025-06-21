package com.manansaipi.portfolio_api.controller.post;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manansaipi.portfolio_api.dtos.post.PostDTO;
import com.manansaipi.portfolio_api.dtos.post.PostDetailDTO;
import com.manansaipi.portfolio_api.service.post.PostService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.manansaipi.portfolio_api.dtos.post.PostCommentDTO;
import com.manansaipi.portfolio_api.dtos.post.PostCommentRequestDTO;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/comment")
public class PostCommentController {

    @Autowired
    private PostService postService;

    // to add new comment to post
    // GET /api/comment/add
    @PostMapping("/add")
    public ResponseEntity<PostCommentDTO> addComment(@RequestBody PostCommentRequestDTO request) {
        PostCommentDTO comment = postService.saveComment(request);
        return ResponseEntity.ok(comment);
    }
    
}
