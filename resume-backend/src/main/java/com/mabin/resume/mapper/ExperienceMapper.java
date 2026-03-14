package com.mabin.resume.mapper;

import com.mabin.resume.entity.Experience;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExperienceMapper {
    
    @Select("SELECT * FROM experience")
    List<Experience> findAll();
    
    @Select("SELECT * FROM experience WHERE id = #{id}")
    Experience findById(Integer id);
    
    @Insert("INSERT INTO experience(start_time, end_time, title, desc_content) " +
            "VALUES(#{startTime}, #{endTime}, #{title}, #{descContent})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Experience experience);
    
    @Update("UPDATE experience SET start_time=#{startTime}, end_time=#{endTime}, " +
            "title=#{title}, desc_content=#{descContent} WHERE id=#{id}")
    int update(Experience experience);
    
    @Delete("DELETE FROM experience WHERE id = #{id}")
    int delete(Integer id);
}
