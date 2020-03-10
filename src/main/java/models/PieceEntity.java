package models;

import javax.persistence.*;

@Entity
@Table(name = "piece", schema = "automobile", catalog = "")
public class PieceEntity {
    private int idPiece;
    private String libelle;
    private String description;
    private Double prixProduction;

    public PieceEntity(int id_piece, String liblle, String description, Double prix_production) {
        this.idPiece = id_piece;
        this.libelle = liblle;
        this.description = description;
        this.prixProduction = prix_production;
    }

    @Id
    @Column(name = "id_piece")
    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "prix_production")
    public Double getPrixProduction() {
        return prixProduction;
    }

    public void setPrixProduction(Double prixProduction) {
        this.prixProduction = prixProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PieceEntity that = (PieceEntity) o;

        if (idPiece != that.idPiece) return false;
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (prixProduction != null ? !prixProduction.equals(that.prixProduction) : that.prixProduction != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPiece;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (prixProduction != null ? prixProduction.hashCode() : 0);
        return result;
    }
}
