package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "disbursement")
public class Disbursement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long disbursementId;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    private Double amount;
    private String status; // e.g., PENDING, RELEASED, HELD

    public Long getDisbursementId() { return disbursementId; }
    public void setDisbursementId(Long disbursementId) { this.disbursementId = disbursementId; }

    public Application getApplication() { return application; }
    public void setApplication(Application application) { this.application = application; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}