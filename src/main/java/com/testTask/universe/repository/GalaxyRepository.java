package com.testTask.universe.repository;

import com.testTask.universe.model.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalaxyRepository
        extends JpaRepository<Galaxy, Long> {
}
