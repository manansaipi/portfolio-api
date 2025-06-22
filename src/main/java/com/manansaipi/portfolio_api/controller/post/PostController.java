package com.manansaipi.portfolio_api.controller.post;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manansaipi.portfolio_api.dtos.post.PostCommentDTO;
import com.manansaipi.portfolio_api.dtos.post.PostCommentLikeRequestDTO;
import com.manansaipi.portfolio_api.dtos.post.PostCommentRequestDTO;
import com.manansaipi.portfolio_api.dtos.post.PostDTO;
import com.manansaipi.portfolio_api.dtos.post.PostDetailDTO;
import com.manansaipi.portfolio_api.service.post.PostService;



@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "http://localhost:5173")
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
    
    // GET /api/posts/{postId}/comments
    @GetMapping("/{postId}/comments")
    public List<PostCommentDTO> getCommentsByPostId(@PathVariable Long postId) {
        return postService.getCommentsByPostId(postId);
    }

    // to add new comment to post
    // POST /api/posts/comment
    @PostMapping("/comment")
    public ResponseEntity<PostCommentDTO> addComment(@RequestBody PostCommentRequestDTO request) {
        PostCommentDTO comment = postService.saveComment(request);
        return ResponseEntity.ok(comment);
    }

    // POST /api/posts/comment
    @PostMapping("/comment/like")
    public ResponseEntity<PostCommentDTO> likeComment(@RequestBody PostCommentLikeRequestDTO request) {
        PostCommentDTO comment = postService.likeComment(request);
        return ResponseEntity.ok(comment);  
    }

}
