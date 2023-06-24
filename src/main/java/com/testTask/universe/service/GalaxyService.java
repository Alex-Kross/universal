package com.testTask.universe.service;

import com.testTask.universe.model.Galaxy;

import java.util.List;

public interface GalaxyService {
    Galaxy saveGalaxy(Galaxy galaxy);
    List<Galaxy> getGalaxies();
    Galaxy getGalaxyById(Long id);
    Galaxy updateGalaxy(Galaxy galaxy, Long id);
    void deleteGalaxy(Long id);
}
