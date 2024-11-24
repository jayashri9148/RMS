package com.innoverasolutions.resource_management.service;

import com.innoverasolutions.resource_management.model.Skillset;

import java.util.List;
import java.util.Optional;

public interface SkillsetService {
    // Save or update a skill set
    Skillset saveSkillset(Skillset skillset);

    // Find a single skill set by ID
    Optional<Skillset> findSkillsetById(Long id);

    // Delete a skill set by ID
    void deleteSkillsetById(Long id);

    // Retrieve all skill sets
    List<Skillset> findAllSkillsets();
}
