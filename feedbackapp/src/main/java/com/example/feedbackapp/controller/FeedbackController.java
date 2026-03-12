package com.example.feedbackapp.controller;

import com.example.feedbackapp.entity.Feedback;
import com.example.feedbackapp.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    @Autowired
    FeedbackRepository repo;

    @GetMapping("/feedback")
    public String showForm() {
        return "feedback";
    }

    @PostMapping("/saveFeedback")
    @ResponseBody
    public String saveFeedback(@RequestParam String name,
                               @RequestParam String bookName,
                               @RequestParam String feedback) {

        Feedback fb = new Feedback();
        fb.setName(name);
        fb.setBookName(bookName);
        fb.setFeedback(feedback);

        repo.save(fb);

        return "feedback saved!";
    }
}
