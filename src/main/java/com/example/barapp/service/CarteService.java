package com.example.barapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.barapp.api.model.Carte;

@Service
public class CarteService {

    private List<Carte> carteList;

    public CarteService() {
        carteList = new ArrayList<>();
        ArrayList<Integer> cocktailList = new ArrayList<>();
        cocktailList.add(1);
        cocktailList.add(2);

        Carte carte1 = new Carte(1, "carte 1", cocktailList);

        carteList.add(carte1);
    }
    public Optional<Carte> getCarte(Integer id){
        Optional optional = Optional.empty();
        for(Carte carte : carteList){
            if(id==carte.getId()){
                optional = Optional.of(carte);
                return optional;
            }
        }
        return optional;
    }

}
