package com.mabin.resume.controller;

import com.mabin.resume.entity.Award;
import com.mabin.resume.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/award")
@CrossOrigin(origins = "*")
public class AwardController {
    
    @Autowired
    private AwardService awardService;
    
    @GetMapping
    public List<Award> findAll() {
        return awardService.findAll();
    }
    
    @GetMapping("/{id}")
    public Award findById(@PathVariable Integer id) {
        return awardService.findById(id);
    }
    
    @PostMapping
    public int insert(@RequestBody Award award) {
        return awardService.insert(award);
    }
    
    @PutMapping
    public int update(@RequestBody Award award) {
        return awardService.update(award);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return awardService.delete(id);
    }
}
