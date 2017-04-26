package plugins;

import java.util.HashMap;

import com.sun.org.apache.xpath.internal.operations.Operation;

import appli.data.IAfficheur;

public class AfficherOperation implements IAfficheur {

	@Override
	public HashMap<String, String> afficher(Object o) {
		// TODO Auto-generated method stub
		Operation operation = (Operation)o;
		HashMap<String, String> lstValeurs = new HashMap<>();
		lstValeurs.put(operation.ge, value)
		return null;
	}

}
