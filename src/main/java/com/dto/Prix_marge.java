package com.dto;

public class Prix_marge {

    private int id_prixMarge;
    private float prix;
    private Contrat contrat;
    private Piece piece;


    public Prix_marge(int id_prixMarge, float prix, Contrat contrat, Piece piece) {
        this.id_prixMarge = id_prixMarge;
        this.prix = prix;
        this.contrat = contrat;
        this.piece = piece;
    }

    public int getId_prixMarge() {
        return id_prixMarge;
    }

    public void setId_prixMarge(int id_prixMarge) {
        this.id_prixMarge = id_prixMarge;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void Calcul_cout_marge(Contrat contrat, Piece piece){

        this.prix = (contrat.getTaux()/100) * piece.getPrix_production();

    }


}
