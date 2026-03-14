package com.mabin.resume.service;

import com.mabin.resume.entity.SelfEvaluation;

import java.util.List;

public interface SelfEvaluationService {
    List<SelfEvaluation> findAll();
    SelfEvaluation findById(Integer id);
    int insert(SelfEvaluation selfEvaluation);
    int update(SelfEvaluation selfEvaluation);
    int delete(Integer id);
}
