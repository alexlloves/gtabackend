package com.backend.gta.controller;

import com.backend.gta.model.dto.QuestionDTO;
import com.backend.gta.service.ForumService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/forum")

public class ForumController {
    @Autowired
    private ForumService forumService;

    @GetMapping(value = "/all")
    @ResponseBody
    public ResponseEntity<List<QuestionDTO>> getClients() {
        log.info("Getting questions");
        return ResponseEntity.ok(forumService.getSampleQuestions());
    }


}
