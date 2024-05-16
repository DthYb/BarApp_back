package com.example.barapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.barapp.api.model.Carte_cocktail;

@Service
public class Carte_cocktailService {
    
    private List<Carte_cocktail> Carte_cocktailList;

    public Carte_cocktailService() {
        Carte_cocktailList = new ArrayList<>();
        
        Carte_cocktail tailleM = new Carte_cocktail(2,1,2,Carte_cocktail.Size.SMALL,12.45);
        Carte_cocktail tailleS = new Carte_cocktail(1,1,1,Carte_cocktail.Size.SMALL,12.45);

        Carte_cocktailList.add(tailleS);
        Carte_cocktailList.add(tailleM);
    }
    public Optional<Carte_cocktail> getCarte_cocktail(Integer id){
        Optional optional = Optional.empty();
        for(Carte_cocktail carte_cocktail : Carte_cocktailList){
            if(id==carte_cocktail.getId()){
                optional = Optional.of(carte_cocktail);
                return optional;
            }
        }
        return optional;
    }

}
