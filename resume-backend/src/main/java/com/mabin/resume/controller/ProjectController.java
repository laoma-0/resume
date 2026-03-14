package com.mabin.resume.controller;

import com.mabin.resume.entity.Project;
import com.mabin.resume.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
@CrossOrigin(origins = "*")
public class ProjectController {
    
    @Autowired
    private ProjectService projectService;
    
    @GetMapping
    public List<Project> findAll() {
        return projectService.findAll();
    }
    
    @GetMapping("/{id}")
    public Project findById(@PathVariable Integer id) {
        return projectService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody Project project) {
        return projectService.insert(project);
    }
    
    @PutMapping
    public int update(@RequestBody Project project) {
        return projectService.update(project);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return projectService.delete(id);
    }
}
