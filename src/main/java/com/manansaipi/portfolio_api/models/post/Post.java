package com.manansaipi.portfolio_api.models.post;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data @Getter @Setter
@Table(name = "posts", schema = "main")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_title", nullable = false )
    private String postTitle;
    
    @Column(name = "post_image", nullable = false )
    private String postImage;

    @Column(name = "post_date", nullable = true)
    private LocalDate posDate;
    
    @Column(name = "author", nullable = false )
    private String author;

    @Column(name = "author_img_url", nullable = false )
    private String authorImgUrl;

  
}
