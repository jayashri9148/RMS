package com.innoverasolutions.resource_management.controller;

import com.innoverasolutions.resource_management.model.Skillset;
import com.innoverasolutions.resource_management.service.SkillsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SkillsetController {

    @Autowired
    private SkillsetService skillsetService;

    // Get all skills and display in the 'skills' page
    @GetMapping("/skills")
    public String viewSkills(Model model) {
        List<Skillset> skillsets = skillsetService.findAllSkillsets();  // Corrected method name to plural
        model.addAttribute("skillsets", skillsets);
        return "skills";  // This will render 'skills.html' in the templates folder
    }

    // Save a new skill and redirect to the 'skills' page
    @PostMapping("/saveSkills")  // Fixed typo in URL
    public String saveSkills(@ModelAttribute("skillset") Skillset skillset) {  // Corrected model attribute to singular
        skillsetService.saveSkillset(skillset);
        return "redirect:/skills";  // Redirect to the '/skills' URL to avoid form resubmission
    }
    @PostMapping("/delete/{id}")
    public String deleteSkill(@PathVariable("id") Long id) {
        skillsetService.deleteSkillsetById(id); // Service deletes the skill
        return "redirect:/skills"; // Redirect to the skills page after deletion
    }
}
