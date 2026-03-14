package com.mabin.resume.controller;

import com.mabin.resume.entity.PersonalInfo;
import com.mabin.resume.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal-info")
@CrossOrigin(origins = "*")
public class PersonalInfoController {
    
    @Autowired
    private PersonalInfoService personalInfoService;
    
    @GetMapping
    public List<PersonalInfo> findAll() {
        return personalInfoService.findAll();
    }
    
    @GetMapping("/{id}")
    public PersonalInfo findById(@PathVariable Integer id) {
        return personalInfoService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody PersonalInfo personalInfo) {
        return personalInfoService.insert(personalInfo);
    }
    
    @PutMapping
    public int update(@RequestBody PersonalInfo personalInfo) {
        return personalInfoService.update(personalInfo);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return personalInfoService.delete(id);
    }
}
