package com.mabin.resume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelfEvaluation {
    private Integer id;
    private String evalContent;
    private String shortPlan;
    private String longPlan;
}
