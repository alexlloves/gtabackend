package com.backend.gta.service;

import com.backend.gta.model.dto.QuestionDTO;
import com.backend.gta.model.dto.ReplyDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ForumService {


    public List<QuestionDTO> getSampleQuestions() {
        List<QuestionDTO> questions = new ArrayList<>();

        // Pregunta 1
        QuestionDTO q1 = new QuestionDTO();
        q1.setId(1L);
        q1.setTitle("¿Cuándo será el lanzamiento oficial de GTA 6?");
        q1.setContent("He visto muchos rumores sobre la fecha de lanzamiento, pero no encuentro información oficial. ¿Alguien sabe algo concreto?");
        q1.setAuthor("GamersUnited");
        q1.setTimestamp(LocalDateTime.of(2024, 8, 15, 14, 30));
        q1.setLikes(12);
        q1.setViews(234);
        q1.setTags(Arrays.asList("lanzamiento", "fecha", "oficial"));

        ReplyDTO r1 = new ReplyDTO();
        r1.setId(1L);
        r1.setAuthor("GTAFan2024");
        r1.setContent("Rockstar confirmó que será en 2025, pero no han dado fecha específica aún.");
        r1.setTimestamp(LocalDateTime.of(2024, 8, 16, 10, 15));
        r1.setLikes(5);

        q1.setReplies(Arrays.asList(r1));
        questions.add(q1);

        // Pregunta 2
        QuestionDTO q2 = new QuestionDTO();
        q2.setId(2L);
        q2.setTitle("¿Qué ciudades estarán disponibles en GTA 6?");
        q2.setContent("Escuché rumores de que habrá varias ciudades jugables. ¿Alguien tiene info confiable?");
        q2.setAuthor("ViceCityLover");
        q2.setTimestamp(LocalDateTime.of(2024, 9, 5, 18, 0));
        q2.setLikes(25);
        q2.setViews(512);
        q2.setTags(Arrays.asList("mapa", "ciudades", "rumores"));

        ReplyDTO r2 = new ReplyDTO();
        r2.setId(2L);
        r2.setAuthor("RockstarInsider");
        r2.setContent("Lo confirmado es Vice City, lo demás son especulaciones.");
        r2.setTimestamp(LocalDateTime.of(2024, 9, 6, 11, 20));
        r2.setLikes(10);

        ReplyDTO r3 = new ReplyDTO();
        r3.setId(3L);
        r3.setAuthor("GamerDude");
        r3.setContent("Ojalá incluyan Liberty City también 🤞");
        r3.setTimestamp(LocalDateTime.of(2024, 9, 6, 14, 45));
        r3.setLikes(3);

        q2.setReplies(Arrays.asList(r2, r3));
        questions.add(q2);

        // Pregunta 3
        QuestionDTO q3 = new QuestionDTO();
        q3.setId(3L);
        q3.setTitle("¿GTA 6 saldrá para PC desde el día uno?");
        q3.setContent("Sé que GTA V tardó en salir para PC, ¿pasará lo mismo con GTA 6?");
        q3.setAuthor("PCMasterRace");
        q3.setTimestamp(LocalDateTime.of(2024, 10, 1, 9, 10));
        q3.setLikes(30);
        q3.setViews(890);
        q3.setTags(Arrays.asList("pc", "consolas", "fecha"));

        ReplyDTO r4 = new ReplyDTO();
        r4.setId(4L);
        r4.setAuthor("ConsolePlayer");
        r4.setContent("Primero saldrá en consolas, después seguro en PC como siempre.");
        r4.setTimestamp(LocalDateTime.of(2024, 10, 2, 12, 0));
        r4.setLikes(8);

        q3.setReplies(Arrays.asList(r4));
        questions.add(q3);

        return questions;
    }


}
