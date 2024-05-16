package com.example.barapp.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.barapp.service.CarteService;
import com.example.barapp.api.model.Carte;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CarteController {

    private CarteService carteService;

    @Autowired
    public CarteController(CarteService carteService){
        this.carteService = carteService;
    }

    @GetMapping("/carte")
    public Carte getCarte(@RequestParam Integer id) {
        Optional<Carte> carte = carteService.getCarte(id);
        if(carte.isPresent()){
            return (Carte) carte.get();
        }
        return null;
    }
    
}
