package com.mabin.resume.mapper;

import com.mabin.resume.entity.PersonalInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonalInfoMapper {
    
    @Select("SELECT * FROM personal_info")
    List<PersonalInfo> findAll();
    
    @Select("SELECT * FROM personal_info WHERE id = #{id}")
    PersonalInfo findById(Integer id);
    
    @Insert("INSERT INTO personal_info(name, gender, birth_date, address, phone, email, github_url, job_intention, self_tag, intro) " +
            "VALUES(#{name}, #{gender}, #{birthDate}, #{address}, #{phone}, #{email}, #{githubUrl}, #{jobIntention}, #{selfTag}, #{intro})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(PersonalInfo personalInfo);
    
    @Update("UPDATE personal_info SET name=#{name}, gender=#{gender}, birth_date=#{birthDate}, " +
            "address=#{address}, phone=#{phone}, email=#{email}, github_url=#{githubUrl}, " +
            "job_intention=#{jobIntention}, self_tag=#{selfTag}, intro=#{intro} WHERE id=#{id}")
    int update(PersonalInfo personalInfo);
    
    @Delete("DELETE FROM personal_info WHERE id = #{id}")
    int delete(Integer id);
}
