package com.mabin.resume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    private Integer id;
    private String skillType;
    private String skillName;
    private String proficiency;
}
