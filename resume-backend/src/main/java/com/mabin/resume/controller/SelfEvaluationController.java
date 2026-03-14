package com.mabin.resume.controller;

import com.mabin.resume.entity.SelfEvaluation;
import com.mabin.resume.service.SelfEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/self-evaluation")
@CrossOrigin(origins = "*")
public class SelfEvaluationController {
    
    @Autowired
    private SelfEvaluationService selfEvaluationService;
    
    @GetMapping
    public List<SelfEvaluation> findAll() {
        return selfEvaluationService.findAll();
    }
    
    @GetMapping("/{id}")
    public SelfEvaluation findById(@PathVariable Integer id) {
        return selfEvaluationService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody SelfEvaluation selfEvaluation) {
        return selfEvaluationService.insert(selfEvaluation);
    }
    
    @PutMapping
    public int update(@RequestBody SelfEvaluation selfEvaluation) {
        return selfEvaluationService.update(selfEvaluation);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return selfEvaluationService.delete(id);
    }
}
