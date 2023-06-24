package com.testTask.universe.service.impl;

import com.testTask.universe.model.Galaxy;
import com.testTask.universe.repository.GalaxyRepository;
import com.testTask.universe.service.GalaxyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GalaxyServiceImpl implements GalaxyService {
    private final GalaxyRepository galaxyRepository;

    @Override
    public List<Galaxy> getGalaxies() {
        return galaxyRepository.findAll();
    }

    @Override
    public Galaxy saveGalaxy(Galaxy galaxy) {
        return galaxyRepository.save(galaxy);
    }

    @Override
    public Galaxy getGalaxyById(Long id) {
        return galaxyRepository.findById(id).get();
    }

    @Override
    public Galaxy updateGalaxy(Galaxy newGalaxy, Long id) {
        return galaxyRepository.findById(id)
                .map(galaxy -> {
                    galaxy.setName(newGalaxy.getName());
                    galaxy.setMinorAxisDiameter(newGalaxy.getMinorAxisDiameter());
                    galaxy.setMajorAxisDiameter(newGalaxy.getMajorAxisDiameter());
                    galaxy.setGalaxyType(newGalaxy.getGalaxyType());
                    galaxy.setDistanceFromEarth(newGalaxy.getDistanceFromEarth());
                    return galaxyRepository.save(galaxy);
                }).get();
    }

    @Override
    public void deleteGalaxy(Long id) {
        galaxyRepository.deleteById(id);
    }
}
