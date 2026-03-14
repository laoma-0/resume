package com.mabin.resume.service.impl;

import com.mabin.resume.entity.SelfEvaluation;
import com.mabin.resume.mapper.SelfEvaluationMapper;
import com.mabin.resume.service.SelfEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfEvaluationServiceImpl implements SelfEvaluationService {
    
    @Autowired
    private SelfEvaluationMapper selfEvaluationMapper;
    
    @Override
    public List<SelfEvaluation> findAll() {
        return selfEvaluationMapper.findAll();
    }
    
    @Override
    public SelfEvaluation findById(Integer id) {
        return selfEvaluationMapper.findById(id);
    }
    
    @Override
    public int insert(SelfEvaluation selfEvaluation) {
        return selfEvaluationMapper.insert(selfEvaluation);
    }
    
    @Override
    public int update(SelfEvaluation selfEvaluation) {
        return selfEvaluationMapper.update(selfEvaluation);
    }
    
    @Override
    public int delete(Integer id) {
        return selfEvaluationMapper.delete(id);
    }
}
