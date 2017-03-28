package plugins;

import appli.data.Compte;
import appli.data.Operation;
import appli.data.IModifCompte;
import java.util.Date;

public class DebiterCompte implements IModifCompte {

    @Override
    public Boolean modifier(Compte compte, float montant) {
        float solde = compte.getSolde();
        if (solde > montant) {
            compte.setSolde(compte.getSolde() - montant);
            if (compte.getSolde() <= solde) {
                Operation op = new Operation(compte, new Date(), new Date(), compte.getOperation().get(compte.getOperation().size() - 1).getNumeroOperation() + 1);
                compte.getOperation().add(op);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
