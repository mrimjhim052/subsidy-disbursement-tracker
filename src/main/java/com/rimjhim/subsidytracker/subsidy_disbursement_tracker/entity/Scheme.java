package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "scheme")
public class Scheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schemeId;

    private String name;
    private Double amount;

    public Long getSchemeId() { return schemeId; }
    public void setSchemeId(Long schemeId) { this.schemeId = schemeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}