package com.innoverasolutions.resource_management.repository;

import com.innoverasolutions.resource_management.model.Skillset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsetRepository extends JpaRepository<Skillset, Long> {
}
