package com.space.scanner.alien.controller;

import com.space.scanner.alien.domain.Alien;
import com.space.scanner.alien.service.AlienService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/aliens")
public class AlienController {
    private AlienService alienService;

    // CREATE
    @PostMapping("")
    Alien createAlien( @RequestBody Alien newAlien) {
        return alienService.createAlien(newAlien);
    }
    // READ
    @GetMapping("/{id}")
    public @ResponseBody Alien getAlien (@PathVariable String id) {
        return alienService.getAlien(id);
    }
    // UPDATE
    @PutMapping("/{id}")
    public @ResponseBody Alien updateAlien (@PathVariable String id, @RequestBody Alien newAlien) {
        return alienService.updateAlien(id, newAlien);
    }
    // DELETE
    @DeleteMapping("/{id}")
    void deleteAlien(@PathVariable String id) {
        alienService.deleteAlien(id);
    }
}
