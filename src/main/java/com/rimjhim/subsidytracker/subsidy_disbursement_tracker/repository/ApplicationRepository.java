package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.repository;


import com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// @Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
