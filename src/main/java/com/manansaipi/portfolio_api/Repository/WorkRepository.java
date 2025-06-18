package com.manansaipi.portfolio_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manansaipi.portfolio_api.models.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {

}
