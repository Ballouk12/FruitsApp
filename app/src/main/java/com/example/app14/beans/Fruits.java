package com.example.app14.beans;

public class Fruits {

    private int id;
    private String nom;
    private double prix;
    private int image;

    private static int comp;

    public Fruits() {
    }

    public Fruits(String nom, double prix, int image) {
        this.id = ++comp;
        this.nom = nom;
        this.prix = prix;
        this.image = image;
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
