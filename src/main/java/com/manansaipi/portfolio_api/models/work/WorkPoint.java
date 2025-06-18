package com.manansaipi.portfolio_api.models.work;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "work_points")
public class WorkPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "work_id")
    private Work work;

    @Column(name = "point")
    private String point;

}
