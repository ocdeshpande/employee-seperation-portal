package com.esp.repository;

import com.esp.model.SeparationReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeparationReasonRepository extends JpaRepository<SeparationReason, Long> {
    // custom queries, if needed
}