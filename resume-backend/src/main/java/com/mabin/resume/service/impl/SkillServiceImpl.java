package com.mabin.resume.service.impl;

import com.mabin.resume.entity.Skill;
import com.mabin.resume.mapper.SkillMapper;
import com.mabin.resume.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    
    @Autowired
    private SkillMapper skillMapper;
    
    @Override
    public List<Skill> findAll() {
        return skillMapper.findAll();
    }
    
    @Override
    public Skill findById(Integer id) {
        return skillMapper.findById(id);
    }
    
    @Override
    public int insert(Skill skill) {
        return skillMapper.insert(skill);
    }
    
    @Override
    public int update(Skill skill) {
        return skillMapper.update(skill);
    }
    
    @Override
    public int delete(Integer id) {
        return skillMapper.delete(id);
    }
}
