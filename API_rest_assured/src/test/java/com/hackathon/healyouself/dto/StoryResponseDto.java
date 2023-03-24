package com.hackathon.healyouself.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class StoryResponseDto {
    String id;
    String age;
    String description;
    String bodyPart;
    String healthScore;
    String bmi;
    String therapies;
    String comments;
}

