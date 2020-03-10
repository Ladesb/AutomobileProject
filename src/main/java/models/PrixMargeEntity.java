package models;

import javax.persistence.*;

@Entity
@Table(name = "prix_marge", schema = "automobile", catalog = "")
public class PrixMargeEntity {
    private int idPrixMarge;
    private Double prix;
    private Integer contratId;
    private Integer pieceId;

    @Id
    @Column(name = "id_prixMarge")
    public int getIdPrixMarge() {
        return idPrixMarge;
    }

    public void setIdPrixMarge(int idPrixMarge) {
        this.idPrixMarge = idPrixMarge;
    }

    @Basic
    @Column(name = "prix")
    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "contrat_id")
    public Integer getContratId() {
        return contratId;
    }

    public void setContratId(Integer contratId) {
        this.contratId = contratId;
    }

    @Basic
    @Column(name = "piece_id")
    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrixMargeEntity that = (PrixMargeEntity) o;

        if (idPrixMarge != that.idPrixMarge) return false;
        if (prix != null ? !prix.equals(that.prix) : that.prix != null) return false;
        if (contratId != null ? !contratId.equals(that.contratId) : that.contratId != null) return false;
        if (pieceId != null ? !pieceId.equals(that.pieceId) : that.pieceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrixMarge;
        result = 31 * result + (prix != null ? prix.hashCode() : 0);
        result = 31 * result + (contratId != null ? contratId.hashCode() : 0);
        result = 31 * result + (pieceId != null ? pieceId.hashCode() : 0);
        return result;
    }
}
