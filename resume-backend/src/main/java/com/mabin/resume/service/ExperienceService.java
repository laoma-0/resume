package com.mabin.resume.service;

import com.mabin.resume.entity.Experience;

import java.util.List;

public interface ExperienceService {
    List<Experience> findAll();
    Experience findById(Integer id);
    int insert(Experience experience);
    int update(Experience experience);
    int delete(Integer id);
}
