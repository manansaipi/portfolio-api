package com.manansaipi.portfolio_api.models.post;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "posts", schema = "main")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_title", nullable = false )
    private String postTitle;
    
    @Column(name = "post_image", nullable = false )
    private String postImage;

    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;
    
    @Column(name = "author", nullable = false )
    private String author;

    @Column(name = "author_img_url", nullable = false )
    private String authorImgUrl;

    @Lob
    @Column(name = "content", nullable = false, columnDefinition="TEXT" )
    private String content;

    @OneToMany(mappedBy = "postId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PostComment> comments;
  
}
