package com.innoverasolutions.resource_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skillset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;

    // Default constructor
    public Skillset() {
    }

    // Parameterized constructor
    public Skillset(String skillName) {
        this.skillName = skillName;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    // Override toString for debugging
    @Override
    public String toString() {
        return "Skillset{" +
                "id=" + id +
                ", skillName='" + skillName + '\'' +
                '}';
    }
}
