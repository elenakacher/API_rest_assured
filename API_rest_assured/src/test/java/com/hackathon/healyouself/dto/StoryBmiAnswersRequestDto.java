package com.hackathon.healyouself.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class StoryBmiAnswersRequestDto {
    String weight;
    String height;
}
