import com.dto.Client;
import com.dto.Piece;
import models.ClientEntity;
import models.PieceEntity;

public class Operation {
    public Operation() {
    }

    public double getResultat(Client client, Piece piece){
        double taux = 0;
        double prixPiece;
        double prixFinal;
        switch (client.getContrat().getId_contrat()){
            case 1:
                taux=0.05;
                break;

            case 2:
                taux=0.10;
                break;

            case 3:
                taux=0.15;
                break;

            case 4:
                taux=0.20;
                break;

            case 5:
                taux=0.25;
                break;
        }

        prixPiece = piece.getPrix_production();
        prixFinal = prixPiece + (prixPiece*taux);
        return prixFinal;
    }

}
