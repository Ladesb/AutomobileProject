package com.dto;

public class Piece {

    private int id_piece;
    private  String liblle;
    private String description;
    private float prix_production;


    public Piece(int id_piece, String liblle, String description, float prix_production) {
        this.id_piece = id_piece;
        this.liblle = liblle;
        this.description = description;
        this.prix_production = prix_production;
    }

    public int getId_piece() {
        return id_piece;
    }

    public void setId_piece(int id_piece) {
        this.id_piece = id_piece;
    }

    public String getLiblle() {
        return liblle;
    }

    public void setLiblle(String liblle) {
        this.liblle = liblle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix_production() {
        return prix_production;
    }

    public void setPrix_production(float prix_production) {
        this.prix_production = prix_production;
    }
}
