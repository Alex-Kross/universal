package com.testTask.universe.service;

import com.testTask.universe.model.Star;

import java.util.List;

public interface StarService {
    Star saveStar(Long galaxyId, Star star);
    List<Star> getStars();
    Star getStarById(Long id);
    Star updateStar(Star star, Long id);
    void deleteStar(Long id);
    List<Star> getStarsOfGalaxy(Long galaxyId);
}
