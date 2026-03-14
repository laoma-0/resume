package com.mabin.resume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private Integer id;
    private String startTime;
    private String endTime;
    private String title;
    private String descContent;
}
