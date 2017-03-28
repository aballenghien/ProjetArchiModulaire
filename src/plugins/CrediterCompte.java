package plugins;

import appli.data.Compte;
import appli.data.Operation;
import appli.data.IModifCompte;
import java.util.Date;

public  class CrediterCompte implements IModifCompte{
	
	/* (non-Javadoc)
	 * @see Plugins.IModifCompte#modifier(Plugins.Compte, float)
	 */
	@Override
	public  Boolean modifier(Compte compte, float montant) {

		compte.setSolde(compte.getSolde() + montant);
		if (compte.getSolde() >= montant) {
			Operation op = new Operation(compte, new Date(), new Date(), compte.getOperation().get(compte.getOperation().size()-1).getNumeroOperation()+1);
			compte.getOperation().add(op);
			return true;
		}

		else {
			return false;
		}

	}

	


}
