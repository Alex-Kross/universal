package com.testTask.universe.repository;

import com.testTask.universe.model.Star;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarRepository
        extends JpaRepository<Star, Long> {
}
