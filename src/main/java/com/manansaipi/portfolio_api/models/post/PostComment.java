package com.manansaipi.portfolio_api.models.post;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "comments", schema = "main")
public class PostComment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post postId;
    
    @Column(nullable = false, name = "comment")
    private String comment;

    @Column(nullable = true, name = "name" )
    private String name;
    
    @Column(nullable = true, name = "created_at")
    private LocalDate createdAt;

    @Column(nullable = true, name = "total_likes")
    private int totalLikes;
    
}
