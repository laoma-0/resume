package com.mabin.resume.mapper;

import com.mabin.resume.entity.Education;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EducationMapper {
    
    @Select("SELECT * FROM education")
    List<Education> findAll();
    
    @Select("SELECT * FROM education WHERE id = #{id}")
    Education findById(Integer id);
    
    @Insert("INSERT INTO education(school, major, education, start_time, end_time, core_course, certificate) " +
            "VALUES(#{school}, #{major}, #{education}, #{startTime}, #{endTime}, #{coreCourse}, #{certificate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Education education);
    
    @Update("UPDATE education SET school=#{school}, major=#{major}, education=#{education}, " +
            "start_time=#{startTime}, end_time=#{endTime}, core_course=#{coreCourse}, certificate=#{certificate} WHERE id=#{id}")
    int update(Education education);
    
    @Delete("DELETE FROM education WHERE id = #{id}")
    int delete(Integer id);
}
