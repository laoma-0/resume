package com.mabin.resume.service.impl;

import com.mabin.resume.entity.Experience;
import com.mabin.resume.mapper.ExperienceMapper;
import com.mabin.resume.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    
    @Autowired
    private ExperienceMapper experienceMapper;
    
    @Override
    public List<Experience> findAll() {
        return experienceMapper.findAll();
    }
    
    @Override
    public Experience findById(Integer id) {
        return experienceMapper.findById(id);
    }
    
    @Override
    public int insert(Experience experience) {
        return experienceMapper.insert(experience);
    }
    
    @Override
    public int update(Experience experience) {
        return experienceMapper.update(experience);
    }
    
    @Override
    public int delete(Integer id) {
        return experienceMapper.delete(id);
    }
}
