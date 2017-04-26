package plugins;

import appli.data.Compte;
import appli.data.Operation;
import appli.data.IModifCompte;
import java.util.Date;

public class DebiterCompte implements IModifCompte {

    @Override
    public boolean modifier(Compte compte, float montant) {
        float solde = compte.getSolde();
        int dernierNumeroOperation = 0;
        if (compte.getOperations().size() > 0) {
            dernierNumeroOperation = compte.getOperations()
                    .get(compte.getOperations().size() - 1)
                    .getNumeroOperation();
        }
        if (solde > montant) {
            compte.setSolde(compte.getSolde() - montant);
            if (compte.getSolde() <= solde) {
                Operation op = new Operation(compte, new Date(), new Date(), dernierNumeroOperation + 1, compte.getSolde());
                op.setDebit(montant);
                compte.getOperations().add(op);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
