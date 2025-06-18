package com.manansaipi.portfolio_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manansaipi.portfolio_api.models.Work;
import com.manansaipi.portfolio_api.repository.WorkRepository;

@Service
public class WorkService {

    @Autowired
    private WorkRepository workRepository;

    public List<Work> getAll() {
        return workRepository.findAll();
    }
}   
