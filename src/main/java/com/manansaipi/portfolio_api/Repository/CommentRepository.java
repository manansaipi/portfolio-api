package com.manansaipi.portfolio_api.Repository;

import com.manansaipi.portfolio_api.Models.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}

