package com.example.barapp.api.model;

public class Panier_cocktails {
    private int id_panier;
    private int id_cocktails;
    
    public Panier_cocktails(int id_panier, int id_cocktails) {
        this.id_panier = id_panier;
        this.id_cocktails = id_cocktails;
    }
    public int getId_panier() {
        return id_panier;
    }
    public void setId_panier(int id_panier) {
        this.id_panier = id_panier;
    }
    public int getId_cocktails() {
        return id_cocktails;
    }
    public void setId_cocktails(int id_cocktails) {
        this.id_cocktails = id_cocktails;
    }

}
