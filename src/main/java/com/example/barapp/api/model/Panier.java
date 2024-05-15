package com.example.barapp.api.model;

import java.util.ArrayList;

public class Panier {
    private int id;
    private String etat;
    private ArrayList<Integer> contenu;
    private int montant;

    public Panier(int id, String etat, ArrayList<Integer> contenu, int montant){
        this.id = id;
        this.etat = etat;
        this.contenu = new ArrayList<>(contenu);
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public ArrayList<Integer> getContenu() {
        return contenu;
    }

    public void setContenu(ArrayList<Integer> contenu) {
        this.contenu = contenu;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

}
