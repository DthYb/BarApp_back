package com.example.barapp.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.barapp.api.model.Carte_cocktail;
import com.example.barapp.service.Carte_cocktailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Carte_cocktailController {

    private Carte_cocktailService carte_cocktailService;

    @Autowired
    public Carte_cocktailController(Carte_cocktailService carte_cocktailService) {
        this.carte_cocktailService = carte_cocktailService;
    }

    @GetMapping("/carte_cocktail")
    public Carte_cocktail getCarte_cocktail(@RequestParam Integer id) {
        Optional<Carte_cocktail> carte_cocktail = carte_cocktailService.getCarte_cocktail(id);
        if(carte_cocktail.isPresent()){
            return(Carte_cocktail) carte_cocktail.get();
        }
        return null;
    }

}
