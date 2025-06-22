package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PostCommentDTO {
    private Long id;
    private Long PostId;
    private String comment;
    private String name;
    private Integer totalLikes;
    private LocalDateTime createdAt;
    private Boolean isVerified;
}