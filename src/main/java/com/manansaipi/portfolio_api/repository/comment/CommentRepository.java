package com.manansaipi.portfolio_api.repository.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manansaipi.portfolio_api.models.comment.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}

