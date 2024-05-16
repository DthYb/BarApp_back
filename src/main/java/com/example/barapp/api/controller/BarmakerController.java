package com.example.barapp.api.controller;

import com.example.barapp.api.model.Barmaker;
import com.example.barapp.service.BarmakerService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/barmaker")
public class BarmakerController {

    @Autowired
    private BarmakerService barmakerService;

    @GetMapping("/{id}")
    public Barmaker getBarmakerById(@PathVariable int id) {
        return barmakerService.getBarmakerById(id);
    }

    @PostMapping
    public Barmaker createBarmaker(@RequestBody Barmaker barmaker) {
        return barmakerService.createBarmaker(barmaker);
    }

    @PutMapping("/{id}")
    public Barmaker updateBarmaker(@PathVariable int id, @RequestBody Barmaker barmaker) {
        return barmakerService.updateBarmaker(id, barmaker);
    }

    @DeleteMapping("/{id}")
    public void deleteBarmaker(@PathVariable int id) {
        barmakerService.deleteBarmaker(id);
    }
}
