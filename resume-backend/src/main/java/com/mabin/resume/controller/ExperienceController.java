package com.mabin.resume.controller;

import com.mabin.resume.entity.Experience;
import com.mabin.resume.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
@CrossOrigin(origins = "*")
public class ExperienceController {
    
    @Autowired
    private ExperienceService experienceService;
    
    @GetMapping
    public List<Experience> findAll() {
        return experienceService.findAll();
    }
    
    @GetMapping("/{id}")
    public Experience findById(@PathVariable Integer id) {
        return experienceService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody Experience experience) {
        return experienceService.insert(experience);
    }
    
    @PutMapping
    public int update(@RequestBody Experience experience) {
        return experienceService.update(experience);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return experienceService.delete(id);
    }
}
