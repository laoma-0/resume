package com.mabin.resume.service;

import com.mabin.resume.entity.Education;

import java.util.List;

public interface EducationService {
    List<Education> findAll();
    Education findById(Integer id);
    int insert(Education education);
    int update(Education education);
    int delete(Integer id);
}
