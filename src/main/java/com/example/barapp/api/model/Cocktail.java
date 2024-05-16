package com.example.barapp.api.model;

public class Cocktail {
    private int id;
    private String nom;
    private String categorie;
    private boolean soft;

    public Cocktail(int id, String nom, String categorie, boolean soft) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.soft = soft;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public boolean isSoft() {
        return soft;
    }
    public void setSoft(boolean soft) {
        this.soft = soft;
    }
    
}
