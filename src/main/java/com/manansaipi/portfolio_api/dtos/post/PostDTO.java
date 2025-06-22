package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PostDTO {
    private Long id;
    private String postTitle;
    private String postImage;
    private LocalDateTime createdAt;
    private String author;
    private String authorImgUrl;
    private String content;
    private Boolean isVerified;
}
