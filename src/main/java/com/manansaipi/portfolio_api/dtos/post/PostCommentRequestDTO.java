package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PostCommentRequestDTO {
    private Long postId;
    private String comment;
    private String name;
    private int totalLikes;
    private LocalDate createdAt;
}
// thsi DTO is use to add comment to post
