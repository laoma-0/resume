package com.mabin.resume.mapper;

import com.mabin.resume.entity.Skill;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SkillMapper {
    
    @Select("SELECT * FROM skill")
    List<Skill> findAll();
    
    @Select("SELECT * FROM skill WHERE id = #{id}")
    Skill findById(Integer id);
    
    @Insert("INSERT INTO skill(skill_type, skill_name, proficiency) " +
            "VALUES(#{skillType}, #{skillName}, #{proficiency})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Skill skill);
    
    @Update("UPDATE skill SET skill_type=#{skillType}, skill_name=#{skillName}, proficiency=#{proficiency} WHERE id=#{id}")
    int update(Skill skill);
    
    @Delete("DELETE FROM skill WHERE id = #{id}")
    int delete(Integer id);
}
