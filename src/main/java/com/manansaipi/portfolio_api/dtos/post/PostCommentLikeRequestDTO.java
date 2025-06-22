package com.manansaipi.portfolio_api.dtos.post;

import lombok.Data;

@Data
// this DTO is use to add comment to post
public class PostCommentLikeRequestDTO {
    private Long commentId;
    private Boolean isLiking;
}
