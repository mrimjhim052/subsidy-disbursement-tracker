package com.rimjhim.subsidytracker.subsidy_disbursement_tracker.controller;

import com.rimjhim.subsidytracker.subsidy_disbursement_tracker.entity.Beneficiary;
import com.rimjhim.subsidytracker.subsidy_disbursement_tracker.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiaries")
public class BeneficiaryController {

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    // POST /beneficiaries - create a new beneficiary
    @PostMapping
    public Beneficiary createBeneficiary(@RequestBody Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    // GET /beneficiaries - list all beneficiaries
    @GetMapping
    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryRepository.findAll();
    }
}