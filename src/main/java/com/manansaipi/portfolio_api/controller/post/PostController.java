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
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    // GET /api/posts
    @GetMapping
    public List<PostDTO> getAllPosts() {
        return postService.getAll();
    }

    // GET post by id
     // GET /api/posts/{id}
    @GetMapping("/{id}")
    public Optional<PostDetailDTO> getPostsById(@PathVariable  Long id) {
        return postService.getById(id);
    }
    
    // get comments by post id
    // GET /api/posts/comments/{postId}
    @GetMapping("/comments/{postId}")
    public List<PostCommentDTO> getCommentsByPostId(@PathVariable Long postId) {
        return postService.getCommentsByPostId(postId);
    }
    
}
