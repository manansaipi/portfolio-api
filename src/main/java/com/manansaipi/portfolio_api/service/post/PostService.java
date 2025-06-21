package com.manansaipi.portfolio_api.service.post;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manansaipi.portfolio_api.dtos.post.PostCommentDTO;
import com.manansaipi.portfolio_api.dtos.post.PostDTO;
import com.manansaipi.portfolio_api.models.post.Post;
import com.manansaipi.portfolio_api.repository.post.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostDTO> getAll() {
        return postRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private PostDTO mapToDTO(Post post) {
        PostDTO dto = new PostDTO();
        dto.setId(post.getId());
        
         List<PostCommentDTO> commentDTOs = post.getComments()
            .stream()
            .map(comment -> {
                PostCommentDTO commentDTO = new PostCommentDTO();
                commentDTO.setId(comment.getId());
                commentDTO.setPostId(post.getId());
                commentDTO.setComment(comment.getComment());
                return commentDTO;
            })
            .collect(Collectors.toList());

        dto.setComments(commentDTOs);

        return dto;
    }
}

