package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "beneficiary")
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long beneficiaryId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double income;
    private String address;

    public Long getBeneficiaryId() { return beneficiaryId; }
    public void setBeneficiaryId(Long beneficiaryId) { this.beneficiaryId = beneficiaryId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Double getIncome() { return income; }
    public void setIncome(Double income) { this.income = income; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}