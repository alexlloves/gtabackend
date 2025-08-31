package com.backend.gta.persistence.repository;

import com.backend.gta.persistence.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
