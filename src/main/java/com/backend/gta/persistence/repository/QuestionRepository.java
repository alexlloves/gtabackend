package com.backend.gta.persistence.repository;

import com.backend.gta.persistence.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
