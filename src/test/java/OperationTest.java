import com.dto.Client;
import com.dto.Contrat;
import com.dto.Piece;
import models.ClientEntity;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class OperationTest<Mapper> {

    @Test
    public void evaluate() {
        Operation operation = new Operation();
        Contrat contrat = new Contrat(1, "contratTest", (float) 0.10);
        Client client = new Client(1,"max", contrat);
        Piece piece = new Piece(1, "vitre", "avant", 50);
        double result = operation.getResultat(client,piece);

        Assert.assertEquals(52.5, result, 0);

    }


}
