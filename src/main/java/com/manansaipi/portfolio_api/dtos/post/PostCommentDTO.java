package com.manansaipi.portfolio_api.dtos.post;

import lombok.Data;

@Data
public class PostCommentDTO {
    private Long id;
    private Long PostId;
    private String comment;
}