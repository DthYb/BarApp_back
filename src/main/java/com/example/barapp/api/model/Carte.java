package com.example.barapp.api.model;

import java.util.ArrayList;

public class Carte {
    private int id;
    private String nom;
    private ArrayList<Integer> contenu; //A retirer au profit de carte_cocktails

    public Carte(int id, String nom, ArrayList<Integer> contenu){
        this.id = id;
        this.nom = nom;
        this.contenu = new ArrayList<>(contenu);
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public ArrayList<Integer> getContenu() {
        return contenu;
    }

    public void setContenu(ArrayList<Integer> contenu) {
        this.contenu = contenu;
    }

}
