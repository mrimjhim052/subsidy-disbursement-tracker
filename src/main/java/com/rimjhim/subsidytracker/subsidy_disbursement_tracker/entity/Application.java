package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    @ManyToOne
    @JoinColumn(name = "beneficiary_id")
    private Beneficiary beneficiary;

    @ManyToOne
    @JoinColumn(name = "scheme_id")
    private Scheme scheme;

    private String status; // e.g., SUBMITTED, APPROVED, REJECTED

    public Long getApplicationId() { return applicationId; }
    public void setApplicationId(Long applicationId) { this.applicationId = applicationId; }

    public Beneficiary getBeneficiary() { return beneficiary; }
    public void setBeneficiary(Beneficiary beneficiary) { this.beneficiary = beneficiary; }

    public Scheme getScheme() { return scheme; }
    public void setScheme(Scheme scheme) { this.scheme = scheme; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}