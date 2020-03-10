package models;

import javax.persistence.*;

@Entity
@Table(name = "contrat", schema = "automobile", catalog = "")
public class ContratEntity {
    private int idContrat;
    private String libelle;
    private Double taux;

    public ContratEntity(int id_contrat, String libelle, Double taux) {
        this.idContrat = id_contrat;
        this.libelle = libelle;
        this.taux = taux;
    }

    @Id
    @Column(name = "id_contrat")
    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
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
    @Column(name = "taux")
    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContratEntity that = (ContratEntity) o;

        if (idContrat != that.idContrat) return false;
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) return false;
        if (taux != null ? !taux.equals(that.taux) : that.taux != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idContrat;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (taux != null ? taux.hashCode() : 0);
        return result;
    }
}
