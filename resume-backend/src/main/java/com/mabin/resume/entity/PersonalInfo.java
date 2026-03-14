package com.mabin.resume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonalInfo {
    private Integer id;
    private String name;
    private String gender;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    private String githubUrl;
    private String jobIntention;
    private String selfTag;
    private String intro;
}
