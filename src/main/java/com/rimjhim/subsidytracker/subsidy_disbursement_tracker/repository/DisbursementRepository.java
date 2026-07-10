package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.repository;

import com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity.Disbursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisbursementRepository extends JpaRepository<Disbursement, Long> {
}
