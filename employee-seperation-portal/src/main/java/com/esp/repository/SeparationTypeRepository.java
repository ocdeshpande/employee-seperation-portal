package com.esp.repository;

import com.esp.model.SeparationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeparationTypeRepository extends JpaRepository<SeparationType, Long> {
    // custom queries, if needed
}