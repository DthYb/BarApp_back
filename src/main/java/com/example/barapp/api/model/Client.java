package com.example.barapp.api.model;

public class Client {
    private int id;
    private int panier;

    public Client(int id, int panier){
        this.id = id;
        this.panier = panier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPanier() {
        return panier;
    }

    public void setPanier(int panier) {
        this.panier = panier;
    }

    
}
