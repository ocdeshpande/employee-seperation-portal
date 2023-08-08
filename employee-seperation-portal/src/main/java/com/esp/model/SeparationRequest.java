package com.esp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class SeparationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "separation_type_id")
    private SeparationType separationType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "separation_reason_id")
    private SeparationReason separationReason;

    private Date requestDate;
    private Date effectiveDate;
    private String status;
    // other request details, getters, setters, etc.
}