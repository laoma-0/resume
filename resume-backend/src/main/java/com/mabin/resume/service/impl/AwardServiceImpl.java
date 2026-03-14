package com.mabin.resume.service.impl;

import com.mabin.resume.entity.Award;
import com.mabin.resume.mapper.AwardMapper;
import com.mabin.resume.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardServiceImpl implements AwardService {
    
    @Autowired
    private AwardMapper awardMapper;
    
    @Override
    public List<Award> findAll() {
        return awardMapper.findAll();
    }
    
    @Override
    public Award findById(Integer id) {
        return awardMapper.findById(id);
    }
    
    @Override
    public int insert(Award award) {
        return awardMapper.insert(award);
    }
    
    @Override
    public int update(Award award) {
        return awardMapper.update(award);
    }
    
    @Override
    public int delete(Integer id) {
        return awardMapper.delete(id);
    }
}
