package com.manansaipi.portfolio_api.dtos.post;

import lombok.Data;

@Data
public class PostCommentRequestDTO {
    private Long postId;
    private String comment;
}
// thsi DTO is use to add comment to post
