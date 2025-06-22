package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDateTime;

import lombok.Data;

@Data
// this DTO is use to add comment to post
public class PostCommentRequestDTO {
    private Long postId;
    private String comment;
    private String name;
    private Integer totalLikes;
    private LocalDateTime createdAt;
}
