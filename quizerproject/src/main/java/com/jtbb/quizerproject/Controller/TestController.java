package com.jtbb.quizerproject.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jtbb.quizerproject.Model.QuestionModel;
import com.jtbb.quizerproject.Service.QuestionService;

@RestController
@RequestMapping("question")
public class TestController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public Object getAllQuestions() {
        try {
            List<QuestionModel> questions = questionService.getAllQuestions();
            return questions;
        } catch (Exception e) {
            // Handle the exception here and return a custom error response
            String errorMessage = "An error occurred: " + e.getMessage();
            return new CustomErrorResponse("Internal Server Error", errorMessage);
        }
    }
}

class CustomErrorResponse {
    private String error;
    private String message;

    public CustomErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
