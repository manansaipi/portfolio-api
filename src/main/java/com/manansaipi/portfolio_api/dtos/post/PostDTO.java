package com.manansaipi.portfolio_api.dtos.post;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class PostDTO {
    private Long id;
    private String postTitle;
    private String postImage;
    private LocalDate posDate;
    private String author;
    private String authorImgUrl;
    private String content;
    private List<PostCommentDTO> comments;
}
