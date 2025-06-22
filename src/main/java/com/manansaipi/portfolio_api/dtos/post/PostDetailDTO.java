package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class PostDetailDTO {
    private Long id;
    private String postTitle;
    private String postImage;
    private LocalDateTime createdAt;
    private String author;
    private String authorImgUrl;
    private String content;
    private List<PostCommentDTO> comments;
}
