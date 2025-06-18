package com.manansaipi.portfolio_api.service.work;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manansaipi.portfolio_api.dtos.WorkDTO;
import com.manansaipi.portfolio_api.models.work.Work;
import com.manansaipi.portfolio_api.models.work.WorkImage;
import com.manansaipi.portfolio_api.models.work.WorkPoint;
import com.manansaipi.portfolio_api.repository.work.WorkRepository;

@Service
public class WorkService {

   @Autowired
    private WorkRepository workRepository;

    public List<WorkDTO> getAll() {
        return workRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private WorkDTO mapToDTO(Work work) {
        WorkDTO dto = new WorkDTO();
        dto.setId(work.getId());
        dto.setCompany(work.getCompany());
        dto.setRole(work.getRole());
        dto.setDescription(work.getDescription());
        dto.setBgColor(work.getBgColor());
        dto.setStartDate(work.getStartDate());
        dto.setEndDate(work.getEndDate());
        dto.setImgUrl(work.getImgUrl());

        // Convert list of WorkPoint to list of strings
        List<String> points = work.getPoints()
                .stream()
                .map(WorkPoint::getPoint)
                .collect(Collectors.toList());
        dto.setPoints(points);

        // Convert list of WorkImage to list of strings
        List<String> images = work.getImages()
                .stream()
                .map(WorkImage::getImageUrl)
                .collect(Collectors.toList());
        dto.setImages(images);

        return dto;
    }
}   
