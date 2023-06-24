package com.testTask.universe.service.impl;

import com.testTask.universe.model.Galaxy;
import com.testTask.universe.model.Star;
import com.testTask.universe.repository.StarRepository;
import com.testTask.universe.service.StarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StarServiceImpl implements StarService {
    private final StarRepository starRepository;
    private final GalaxyServiceImpl galaxyService;

    @Override
    public List<Star> getStars() {
        return starRepository.findAll();
    }

    @Override
    public Star saveStar(Long galaxyId, Star star) {
        Galaxy galaxy = galaxyService.getGalaxyById(galaxyId);
        star.setGalaxy(galaxy);
        return starRepository.save(star);
    }

    @Override
    public List<Star> getStarsOfGalaxy(Long galaxyId) {
        return starRepository
                .findAll()
                .stream()
                .filter(star -> star.getGalaxy().getId() == galaxyId)
                .collect(Collectors.toList());
    }

    @Override
    public Star getStarById(Long id) {
        return starRepository.findById(id).get();
    }

    @Override
    public Star updateStar(Star newStar, Long id) {
        return starRepository.findById(id)
                .map(star -> {
                    star.setName(newStar.getName());
                    star.setTemperature(newStar.getTemperature());
                    star.setSolarRadius(newStar.getSolarRadius());
                    star.setSolarLuminosity(newStar.getSolarLuminosity());
                    star.setSolarMass(newStar.getSolarMass());
                    return starRepository.save(star);
                }).get();
    }

    @Override
    public void deleteStar(Long id) {
        starRepository.deleteById(id);
    }
}
