package com.mabin.resume.service;

import com.mabin.resume.entity.Award;

import java.util.List;

public interface AwardService {
    List<Award> findAll();
    Award findById(Integer id);
    int insert(Award award);
    int update(Award award);
    int delete(Integer id);
}
