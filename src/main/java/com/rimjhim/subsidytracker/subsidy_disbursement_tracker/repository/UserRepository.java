package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.repository;

import com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}