package com.example.barapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.barapp.api.model.Panier;

@Service
public class PanierService {

    private List<Panier> panierList;

    public PanierService() {
        panierList = new ArrayList<>();
        ArrayList<Integer> contenuList = new ArrayList<>();
        contenuList.add(1);
        contenuList.add(3);

        Panier panier1 = new Panier(1,Panier.Status.commande_en_cours,contenuList,13.45,4 );

        panierList.add(panier1);
    }
    public Optional<Panier> getPanier(Integer id){
        Optional optional = Optional.empty();
        for(Panier panier : panierList){
            if(id==panier.getId()){
                optional = Optional.of(panier);
                return optional;
            }
        }
        return optional;
    }
}
