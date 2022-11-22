package com.space.scanner.alien.repository;

import com.space.scanner.alien.domain.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlienRepository extends JpaRepository<Alien, String> {
        public List<Alien> findByPlanet(String planet);
        public List<Alien> findByPlanetAndRace(String planet, String race);

}

