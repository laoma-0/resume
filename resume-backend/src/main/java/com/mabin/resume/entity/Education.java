package com.mabin.resume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private Integer id;
    private String school;
    private String major;
    private String education;
    private String startTime;
    private String endTime;
    private String coreCourse;
    private String certificate;
}
