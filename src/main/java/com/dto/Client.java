package com.dto;

public class Client {

    private int id_client;
    private String libelle;
    private Contrat contrat;

    public Client(int id_client, String libelle, Contrat contrat) {
        this.id_client = id_client;
        this.libelle = libelle;
        this.contrat = contrat;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
