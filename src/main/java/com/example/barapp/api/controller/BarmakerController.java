package com.example.barapp.api.controller;

import com.example.barapp.api.model.Barmaker;
import com.example.barapp.service.BarmakerService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    // @GetMapping("/barmaker")
    // public ResponseEntity<List<Barmaker>> getAllBarmakers() {
    //     List<Barmaker> barmakers = barmakerService.getAllBarmakers();
    //     return new ResponseEntity<>(barmakers, HttpStatus.OK);
    // }
    

}
