package com.mabin.resume.mapper;

import com.mabin.resume.entity.SelfEvaluation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SelfEvaluationMapper {
    
    @Select("SELECT * FROM self_evaluation")
    List<SelfEvaluation> findAll();
    
    @Select("SELECT * FROM self_evaluation WHERE id = #{id}")
    SelfEvaluation findById(Integer id);
    
    @Insert("INSERT INTO self_evaluation(eval_content, short_plan, long_plan) " +
            "VALUES(#{evalContent}, #{shortPlan}, #{longPlan})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(SelfEvaluation selfEvaluation);
    
    @Update("UPDATE self_evaluation SET eval_content=#{evalContent}, short_plan=#{shortPlan}, long_plan=#{longPlan} WHERE id=#{id}")
    int update(SelfEvaluation selfEvaluation);
    
    @Delete("DELETE FROM self_evaluation WHERE id = #{id}")
    int delete(Integer id);
}
