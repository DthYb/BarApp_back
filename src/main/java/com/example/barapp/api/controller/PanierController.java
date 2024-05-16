package com.example.barapp.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.barapp.service.PanierService;
import com.example.barapp.api.model.Panier;

@RestController
public class PanierController {

    private PanierService panierService;

    @Autowired
    public PanierController(PanierService panierService){
        this.panierService = panierService;
    }

    @GetMapping("/panier")
    public Panier getPanier(@RequestParam Integer id) {
        Optional<Panier> panier = panierService.getPanier(id);
        if(panier.isPresent()){
            return(Panier) panier.get();
        }
        return null;
    }

}
