package com.example.barapp.api.model;

public class Taille {
    private int id;
    private Size taille;
    private int prix;

    private enum Size {
        SMALL,
        MEDIUM,
        LARGE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Size getTaille() {
        return taille;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
