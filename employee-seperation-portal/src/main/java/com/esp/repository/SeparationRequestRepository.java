package com.esp.repository;

import com.esp.model.SeparationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeparationRequestRepository extends JpaRepository<SeparationRequest, Long> {
    // custom queries, if needed
}