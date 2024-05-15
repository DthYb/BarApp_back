package com.example.barapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.barapp.api.model.Barmaker;

@Service
public class BarmakerService {
    
    private List<Barmaker> barmakerList;

    public BarmakerService() {
        barmakerList = new ArrayList<>();

        Barmaker barmaker1 = new Barmaker(1,"mail","password","michel","sardou");

        barmakerList.add(barmaker1);
    }

    public Optional<Barmaker> getBarmaker(Integer id) {
        Optional optional = Optional.empty();
        for(Barmaker barmaker : barmakerList) {
            if(id==barmaker.getId()){
                optional = Optional.of(barmaker);
                return optional;
            }
        }
        return optional;
    }
}
