package com.mabin.resume.service;

import com.mabin.resume.entity.PersonalInfo;

import java.util.List;

public interface PersonalInfoService {
    List<PersonalInfo> findAll();
    PersonalInfo findById(Integer id);
    int insert(PersonalInfo personalInfo);
    int update(PersonalInfo personalInfo);
    int delete(Integer id);
}
