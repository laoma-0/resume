package com.mabin.resume.service.impl;

import com.mabin.resume.entity.Education;
import com.mabin.resume.mapper.EducationMapper;
import com.mabin.resume.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    
    @Autowired
    private EducationMapper educationMapper;
    
    @Override
    public List<Education> findAll() {
        return educationMapper.findAll();
    }
    
    @Override
    public Education findById(Integer id) {
        return educationMapper.findById(id);
    }
    
    @Override
    public int insert(Education education) {
        return educationMapper.insert(education);
    }
    
    @Override
    public int update(Education education) {
        return educationMapper.update(education);
    }
    
    @Override
    public int delete(Integer id) {
        return educationMapper.delete(id);
    }
}
