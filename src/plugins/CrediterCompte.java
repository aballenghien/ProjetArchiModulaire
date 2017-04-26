package plugins;

import appli.data.Compte;
import appli.data.Operation;
import appli.data.IModifCompte;
import java.util.Date;

public class CrediterCompte implements IModifCompte {

    /* (non-Javadoc)
	 * @see Plugins.IModifCompte#modifier(Plugins.Compte, float)
     */
    @Override
    public boolean modifier(Compte compte, float montant) {
        compte.setSolde(compte.getSolde() + montant);
        int dernierNumeroOperation = 0;
        if (compte.getOperations().size() > 0) {
            dernierNumeroOperation = compte.getOperations()
                    .get(compte.getOperations().size() - 1)
                    .getNumeroOperation();
        }
        if (compte.getSolde() >= montant) {
            Operation op = new Operation(compte, new Date(), new Date(), dernierNumeroOperation + 1, compte.getSolde());
            op.setCredit(montant);
            compte.getOperations().add(op);
            return true;
        } else {
            return false;
        }

    }

}
