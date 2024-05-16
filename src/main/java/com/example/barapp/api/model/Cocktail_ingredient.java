package com.example.barapp.api.model;

public class Cocktail_ingredient {
    private int cocktail_id;
    private int ingredient_id;

    public Cocktail_ingredient(int cocktail_id, int ingredient_id) {
        this.cocktail_id = cocktail_id;
        this.ingredient_id = ingredient_id;
    }
    public int getCocktail_id() {
        return cocktail_id;
    }
    public void setCocktail_id(int cocktail_id) {
        this.cocktail_id = cocktail_id;
    }
    public int getIngredient_id() {
        return ingredient_id;
    }
    public void setIngredient_id(int ingredient_id) {
        this.ingredient_id = ingredient_id;
    }

}
