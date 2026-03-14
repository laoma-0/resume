package com.mabin.resume.mapper;

import com.mabin.resume.entity.Award;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AwardMapper {
    
    @Select("SELECT * FROM award")
    List<Award> findAll();
    
    @Select("SELECT * FROM award WHERE id = #{id}")
    Award findById(Integer id);
    
    @Insert("INSERT INTO award(award_name, award_level) " +
            "VALUES(#{awardName}, #{awardLevel})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Award award);
    
    @Update("UPDATE award SET award_name=#{awardName}, award_level=#{awardLevel} WHERE id=#{id}")
    int update(Award award);
    
    @Delete("DELETE FROM award WHERE id = #{id}")
    int delete(Integer id);
}
