package com.deepthi.resumescrening.repository;

import com.deepthi.resumescrening.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
