package com.mabin.resume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private Integer id;
    private String projectName;
    private String startTime;
    private String endTime;
    private String role;
    private String background;
    private String responsibility;
    private String techStack;
    private String achievement;
    private String githubLink;
}
