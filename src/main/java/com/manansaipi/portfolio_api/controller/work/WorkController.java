package com.manansaipi.portfolio_api.controller.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.manansaipi.portfolio_api.dtos.WorkDTO;
import com.manansaipi.portfolio_api.service.work.WorkService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/works")
public class WorkController {

    @Autowired
    private WorkService workService;
    
    @GetMapping
    public List<WorkDTO> getAllWorks() {
        return workService.getAll();
    }
    
}
