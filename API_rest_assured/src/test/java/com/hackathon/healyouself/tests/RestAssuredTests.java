package com.hackathon.healyouself.tests;


import com.hackathon.healyouself.dto.StoryBmiAnswersRequestDto;
import com.hackathon.healyouself.dto.StoryRequestDto;
import com.jayway.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RestAssuredTests {

    @BeforeMethod
    public void ensurePrecondition() { RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    public void storyTest() {
        StoryBmiAnswersRequestDto bmiAnswersRequestDto = StoryBmiAnswersRequestDto.builder()
                .weight("80").height("1.80").build();
        StoryRequestDto requestDto = StoryRequestDto.builder()
                .age("25")
                .description("description")
                .bodyPart("HEAD")
                .bmiAnswers(bmiAnswersRequestDto)
                .build();

        StoryRequestDto story = RestAssured.given()
                .contentType("application/json")
                .body(requestDto)
                .post("story")
                .then()
                .assertThat().statusCode(201)
                .extract().response().as(StoryRequestDto.class);
        System.out.println(story.getAge());
    }
}
