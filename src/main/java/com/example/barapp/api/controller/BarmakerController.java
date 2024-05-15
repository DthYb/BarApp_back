package com.example.barapp.api.controller;

import com.example.barapp.api.model.Barmaker;
import com.example.barapp.service.BarmakerService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BarmakerController {

    private BarmakerService barmakerService;

    @Autowired
    public BarmakerController(BarmakerService barmakerService){
        this.barmakerService = barmakerService;
    }
    
    @GetMapping("/barmaker")
    public Barmaker getBarmaker(@RequestParam Integer id) {
        Optional<Barmaker> barmaker = barmakerService.getBarmaker(id);
        if(barmaker.isPresent()){
            return (Barmaker) barmaker.get();
        }
        return null;
    }

}
