package com.example.barapp.api.model;
import java.util.ArrayList;


public class Panier {
    private int id;
    private Status etat;
    private ArrayList<Integer> contenu;
    private double montant;
    private int numero;

    public enum Status {
        panier_validé,
        commande_envoyé,
        commande_en_cours,
        commande_terminé,
    }

    public Panier(int id, Status etat, ArrayList<Integer> contenu, double montant, int numero){
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

    public Status getEtat() {
        return etat;
    }

    public ArrayList<Integer> getContenu() {
        return contenu;
    }

    public void setContenu(ArrayList<Integer> contenu) {
        this.contenu = contenu;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
