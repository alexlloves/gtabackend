package com.backend.gta.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReplyDTO {
    private Long id;
    private String author;
    private String content;
    private LocalDateTime timestamp;
    private Integer likes;


}
