package com.manansaipi.portfolio_api.repository.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manansaipi.portfolio_api.models.post.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

