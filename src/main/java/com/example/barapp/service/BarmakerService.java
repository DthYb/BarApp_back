package com.example.barapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barapp.api.Repository.BarmakerRepository;
import com.example.barapp.api.model.Barmaker;

@Service
public class BarmakerService {

    @Autowired
    private BarmakerRepository barmakerRepository;

    public Barmaker getBarmakerById(int id) {
        return barmakerRepository.findById(id).orElse(null);
    }

    public Barmaker createBarmaker(Barmaker barmaker) {
        return barmakerRepository.save(barmaker);
    }

    public Barmaker updateBarmaker(int id, Barmaker barmaker) {
        if (barmakerRepository.existsById(id)) {
            barmaker.setId(id);
            return barmakerRepository.save(barmaker);
        }
        return null;
    }

    public void deleteBarmaker(int id) {
        barmakerRepository.deleteById(id);
    }

}
