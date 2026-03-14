package com.mabin.resume.service;

import com.mabin.resume.entity.Skill;

import java.util.List;

public interface SkillService {
    List<Skill> findAll();
    Skill findById(Integer id);
    int insert(Skill skill);
    int update(Skill skill);
    int delete(Integer id);
}
