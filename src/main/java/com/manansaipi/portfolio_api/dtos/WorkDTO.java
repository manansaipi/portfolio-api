package com.manansaipi.portfolio_api.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class WorkDTO {
    private Long id;
    private String company;
    private String role;
    private String description;
    private String bgColor;
    private LocalDate startDate;
    private LocalDate endDate;
    private String imgUrl;
    private List<String> points;
    private List<String> images;
}