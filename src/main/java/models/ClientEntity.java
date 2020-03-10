package models;

import com.dto.Contrat;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "automobile", catalog = "")
public class ClientEntity {
    private int idClient;
    private String libelle;
    private Integer contratId;

    public ClientEntity(int id_client, String libelle, int contrat) {
        this.idClient = id_client;
        this.libelle = libelle;
        this.contratId = contrat;
    }

    @Id
    @Column(name = "id_client")
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
    @Column(name = "contrat_id")
    public Integer getContratId() {
        return contratId;
    }

    public void setContratId(Integer contratId) {
        this.contratId = contratId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (idClient != that.idClient) return false;
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) return false;
        if (contratId != null ? !contratId.equals(that.contratId) : that.contratId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (contratId != null ? contratId.hashCode() : 0);
        return result;
    }
}
