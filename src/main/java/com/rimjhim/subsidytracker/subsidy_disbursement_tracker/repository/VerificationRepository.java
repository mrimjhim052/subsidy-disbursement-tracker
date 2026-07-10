package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.repository;

import com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity.Verification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationRepository extends JpaRepository<Verification, Long> {
}