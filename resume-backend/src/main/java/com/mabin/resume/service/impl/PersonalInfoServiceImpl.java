package com.mabin.resume.service.impl;

import com.mabin.resume.entity.PersonalInfo;
import com.mabin.resume.mapper.PersonalInfoMapper;
import com.mabin.resume.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {
    
    @Autowired
    private PersonalInfoMapper personalInfoMapper;
    
    @Override
    public List<PersonalInfo> findAll() {
        return personalInfoMapper.findAll();
    }
    
    @Override
    public PersonalInfo findById(Integer id) {
        return personalInfoMapper.findById(id);
    }
    
    @Override
    public int insert(PersonalInfo personalInfo) {
        return personalInfoMapper.insert(personalInfo);
    }
    
    @Override
    public int update(PersonalInfo personalInfo) {
        return personalInfoMapper.update(personalInfo);
    }
    
    @Override
    public int delete(Integer id) {
        return personalInfoMapper.delete(id);
    }
}
