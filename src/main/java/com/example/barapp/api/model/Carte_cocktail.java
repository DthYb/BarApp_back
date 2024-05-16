package com.example.barapp.api.model;

public class Carte_cocktail {
    private int id;
    private int carte_id;
    private int cocktail_id;
    private Size cocktail_size;
    private double cocktail_price;

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE;
    }

    public Carte_cocktail(int id, int carte_id, int cocktail_id, Size cocktail_size, double cocktail_price) {
        this.id = id;
        this.carte_id = carte_id;
        this.cocktail_id = cocktail_id;
        this.cocktail_size = cocktail_size;
        this.cocktail_price = cocktail_price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCarte_id() {
        return carte_id;
    }
    public void setCarte_id(int carte_id) {
        this.carte_id = carte_id;
    }
    public int getCocktail_id() {
        return cocktail_id;
    }
    public void setCocktail_id(int cocktail_id) {
        this.cocktail_id = cocktail_id;
    }
    public Size getCocktail_size() {
        return cocktail_size;
    }
    public void setCocktail_size(Size cocktail_size) {
        this.cocktail_size = cocktail_size;
    }
    public double getCocktail_price() {
        return cocktail_price;
    }
    public void setCocktail_price(double cocktail_price) {
        this.cocktail_price = cocktail_price;
    }

}
