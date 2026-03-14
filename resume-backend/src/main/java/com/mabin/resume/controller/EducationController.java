package com.mabin.resume.controller;

import com.mabin.resume.entity.Education;
import com.mabin.resume.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
@CrossOrigin(origins = "*")
public class EducationController {
    
    @Autowired
    private EducationService educationService;
    
    @GetMapping
    public List<Education> findAll() {
        return educationService.findAll();
    }
    
    @GetMapping("/{id}")
    public Education findById(@PathVariable Integer id) {
        return educationService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody Education education) {
        return educationService.insert(education);
    }
    
    @PutMapping
    public int update(@RequestBody Education education) {
        return educationService.update(education);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return educationService.delete(id);
    }
}
