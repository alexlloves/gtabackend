package com.backend.gta.model.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Slf4j
public class QuestionDTO {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime timestamp;
    private List<ReplyDTO> replies;
    private Integer likes;
    private Integer views;
    private List<String> tags;
}
