package com.innoverasolutions.resource_management.service;

import com.innoverasolutions.resource_management.model.Skillset;
import com.innoverasolutions.resource_management.repository.SkillsetRepository;
import com.innoverasolutions.resource_management.service.SkillsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillsetServiceImpl implements SkillsetService {

    @Autowired
    private SkillsetRepository skillsetRepository;

    @Override
    public Skillset saveSkillset(Skillset skillset) {
        return skillsetRepository.save(skillset);
    }

    @Override
    public Optional<Skillset> findSkillsetById(Long id) {
        return skillsetRepository.findById(id);
    }

    @Override
    public void deleteSkillsetById(Long id) {
        skillsetRepository.deleteById(id);
    }

    @Override
    public List<Skillset> findAllSkillsets() {
        return skillsetRepository.findAll();
    }
}
