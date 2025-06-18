package com.manansaipi.portfolio_api.repository.work;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manansaipi.portfolio_api.models.work.Work;

@Repository
public interface WorkImageRepository extends JpaRepository<Work, Long> {

}
