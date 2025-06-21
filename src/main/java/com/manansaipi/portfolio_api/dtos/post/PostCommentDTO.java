package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PostCommentDTO {
    private Long id;
    private Long PostId;
    private String comment;
    private String name;
    private int totalLikes;
    private LocalDate createdAt;


}