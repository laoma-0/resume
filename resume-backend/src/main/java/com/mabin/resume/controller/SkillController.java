package com.mabin.resume.controller;

import com.mabin.resume.entity.Skill;
import com.mabin.resume.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill")
@CrossOrigin(origins = "*")
public class SkillController {
    
    @Autowired
    private SkillService skillService;
    
    @GetMapping
    public List<Skill> findAll() {
        return skillService.findAll();
    }
    
    @GetMapping("/{id}")
    public Skill findById(@PathVariable Integer id) {
        return skillService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody Skill skill) {
        return skillService.insert(skill);
    }
    
    @PutMapping
    public int update(@RequestBody Skill skill) {
        return skillService.update(skill);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return skillService.delete(id);
    }
}
