package org.example.webapp.WebalkProjekt.repository;

import org.example.webapp.WebalkProjekt.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<SessionEntity, Long> {
}
