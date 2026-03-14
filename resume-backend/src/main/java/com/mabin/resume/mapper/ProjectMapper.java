package com.mabin.resume.mapper;

import com.mabin.resume.entity.Project;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProjectMapper {
    
    @Select("SELECT * FROM project")
    List<Project> findAll();
    
    @Select("SELECT * FROM project WHERE id = #{id}")
    Project findById(Integer id);
    
    @Insert("INSERT INTO project(project_name, start_time, end_time, role, background, responsibility, tech_stack, achievement, github_link) " +
            "VALUES(#{projectName}, #{startTime}, #{endTime}, #{role}, #{background}, #{responsibility}, #{techStack}, #{achievement}, #{githubLink})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Project project);
    
    @Update("UPDATE project SET project_name=#{projectName}, start_time=#{startTime}, end_time=#{endTime}, " +
            "role=#{role}, background=#{background}, responsibility=#{responsibility}, tech_stack=#{techStack}, " +
            "achievement=#{achievement}, github_link=#{githubLink} WHERE id=#{id}")
    int update(Project project);
    
    @Delete("DELETE FROM project WHERE id = #{id}")
    int delete(Integer id);
}
