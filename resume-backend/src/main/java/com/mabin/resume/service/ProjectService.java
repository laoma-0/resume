package com.mabin.resume.service;

import com.mabin.resume.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    Project findById(Integer id);
    int insert(Project project);
    int update(Project project);
    int delete(Integer id);
}
