package com.manansaipi.portfolio_api.repository.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manansaipi.portfolio_api.models.post.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {

        // This will automatically generate SQL: SELECT * FROM comments WHERE post_id = ?
        List<PostComment> findByPostId_Id(Long postId);
}

