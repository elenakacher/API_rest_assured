package com.hackathon.healyouself.tests;

import com.hackathon.healyouself.dto.StoryBmiAnswersRequestDto;
import com.hackathon.healyouself.dto.StoryRequestDto;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Array;

public class APITest {

    @Test
    public void createStoryAPItest() throws IOException {
        Response response = Request.Post("http://localhost:8080/story")
                .bodyString("{\n" +
                        "    \"age\": \"33\",\n" +
                        "    \"description\": \"something2\",\n" +
                        "    \"bodyPart\": \"HEAD\",\n" +
                        "    \"bmiAnswers\": {\n" +
                        "           \"weight\": \"70\",\n" +
                        "           \"height\": \"1.7\"\n" +
                        "           },\n" +
                        "    \"sf36Answers\":{\n" +
                        "       \"1\": \"1\",\n" +
                        "       \"2\": \"1\",\n" +
                        "       \"3\": \"1\",\n" +
                        "       \"4\": \"1\",\n" +
                        "       \"5\": \"1\",\n" +
                        "       \"6\": \"1\",\n" +
                        "       \"7\": \"1\",\n" +
                        "       \"8\": \"1\",\n" +
                        "       \"9\": \"1\",\n" +
                        "       \"10\": \"1\",\n" +
                        "       \"11\": \"1\",\n" +
                        "       \"12\": \"1\",\n" +
                        "       \"13\": \"1\",\n" +
                        "       \"14\": \"1\",\n" +
                        "       \"15\": \"1\",\n" +
                        "       \"16\": \"1\",\n" +
                        "       \"17\": \"1\",\n" +
                        "       \"18\": \"1\",\n" +
                        "       \"19\": \"1\",\n" +
                        "       \"20\": \"1\",\n" +
                        "       \"21\": \"1\",\n" +
                        "       \"22\": \"1\",\n" +
                        "       \"23\": \"1\",\n" +
                        "       \"24\": \"1\",\n" +
                        "       \"25\": \"1\",\n" +
                        "       \"26\": \"1\",\n" +
                        "       \"27\": \"1\",\n" +
                        "       \"28\": \"1\",\n" +
                        "       \"29\": \"1\",\n" +
                        "       \"30\": \"1\",\n" +
                        "       \"31\": \"1\",\n" +
                        "       \"32\": \"1\",\n" +
                        "       \"33\": \"1\",\n" +
                        "       \"34\": \"1\",\n" +
                        "       \"35\": \"1\",\n" +
                        "       \"36\": \"1\"\n" +
                        "   }\n" +
                        "}", ContentType.APPLICATION_JSON)
                .execute();

    }

    @Test
    public void showStory() throws IOException {
        Response response = Request.Get("http://localhost:8080/story").execute();
        System.out.println(response);
    }

}
