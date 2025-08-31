package com.backend.gta.model.dto;

import com.backend.gta.persistence.entity.Question;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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


    public static QuestionDTO fromEntity(Question question) {
        if (question == null) return null;

        QuestionDTO dto = new QuestionDTO();
        dto.setId(question.getId());
        dto.setTitle(question.getTitle());
        dto.setContent(question.getContent());
        dto.setAuthor(question.getAuthor());
        dto.setTimestamp(question.getTimestamp());
        dto.setLikes(question.getLikes());
        dto.setViews(question.getViews());
        dto.setTags(question.getTags());

        if (question.getReplies() != null) {
            dto.setReplies(
                    question.getReplies().stream()
                            .map(reply -> {
                                ReplyDTO rDto = new ReplyDTO();
                                rDto.setId(reply.getId());
                                rDto.setAuthor(reply.getAuthor());
                                rDto.setContent(reply.getContent());
                                rDto.setTimestamp(reply.getTimestamp());
                                rDto.setLikes(reply.getLikes());
                                return rDto;
                            })
                            .collect(Collectors.toList())
            );
        }

        return dto;
    }
}
