package com.hackathon.healyouself.dto;

import lombok.*;

import java.lang.reflect.Array;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class StoryRequestDto{
    String age;
    String description;
    String bodyPart;
    StoryBmiAnswersRequestDto bmiAnswers;
    String sf36Answers;
}
