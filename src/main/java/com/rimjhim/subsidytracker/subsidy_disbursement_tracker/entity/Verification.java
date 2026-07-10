package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "verification")
public class Verification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long verificationId;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinColumn(name = "officer_id")
    private User officer;

    private String status; // e.g., PENDING, VERIFIED, REJECTED

    public Long getVerificationId() { return verificationId; }
    public void setVerificationId(Long verificationId) { this.verificationId = verificationId; }

    public Application getApplication() { return application; }
    public void setApplication(Application application) { this.application = application; }

    public User getOfficer() { return officer; }
    public void setOfficer(User officer) { this.officer = officer; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}