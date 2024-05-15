package com.example.barapp.api.model;

public class Client {
    private int id;
    private Panier panier;

    public Client(int id, Panier panier){
        this.id = id;
        this.panier = panier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    
}
