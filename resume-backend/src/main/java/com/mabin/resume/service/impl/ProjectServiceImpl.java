package com.mabin.resume.service.impl;

import com.mabin.resume.entity.Project;
import com.mabin.resume.mapper.ProjectMapper;
import com.mabin.resume.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    
    @Autowired
    private ProjectMapper projectMapper;
    
    @Override
    public List<Project> findAll() {
        return projectMapper.findAll();
    }
    
    @Override
    public Project findById(Integer id) {
        return projectMapper.findById(id);
    }
    
    @Override
    public int insert(Project project) {
        return projectMapper.insert(project);
    }
    
    @Override
    public int update(Project project) {
        return projectMapper.update(project);
    }
    
    @Override
    public int delete(Integer id) {
        return projectMapper.delete(id);
    }
}
