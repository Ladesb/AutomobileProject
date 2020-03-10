package com.dto;

public class Contrat {

    private int id_contrat;
    private String libelle;
    private float taux;

    public Contrat(int id_contrat, String libelle, float taux) {
        this.id_contrat = id_contrat;
        this.libelle = libelle;
        this.taux = taux;
    }

    public int getId_contrat() {
        return id_contrat;
    }

    public void setId_contrat(int id_contrat) {
        this.id_contrat = id_contrat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}
