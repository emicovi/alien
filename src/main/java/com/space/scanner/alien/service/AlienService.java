package com.space.scanner.alien.service;

import com.space.scanner.alien.bean.Planet;
import com.space.scanner.alien.domain.Alien;
import com.space.scanner.alien.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {
    @Autowired
    private AlienRepository alienRepository;
    @Autowired
    Planet planet;

    public void addAlien(String name, String race) {
        Alien alien = new Alien();
        alien.setName(name);
        alien.setRace(race);
        alien.setPlanet(planet.getName());
        alienRepository.save(alien);
    }

    public Alien createAlien(Alien alien) {
       return alienRepository.save(alien);
    }

    public List<Alien> getAliens(){
        return alienRepository.findByPlanet(planet.getName());
    }


    public List<Alien> getAliens(String race){
        return alienRepository.findByPlanetAndRace(planet.getName(),race);
    }

    public Alien getAlien(String id) {
        return alienRepository.findById(id).get();
    }

    public Alien updateAlien(String id, Alien alien) {
        return alienRepository.save(alien);
    }

    public void deleteAlien(String id) {
        alienRepository.deleteById(id);
    }
}
