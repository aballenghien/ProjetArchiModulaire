package plugins;

import java.util.HashMap;

import appli.data.IAfficheur;
import appli.data.Operation;
import java.util.ArrayList;

public class AfficherOperation implements IAfficheur {

    @Override
    public ArrayList<String> afficher(Object o) {
        // TODO Auto-generated method stub
        Operation operation = (Operation) o;

        ArrayList lstValeurs = new ArrayList();
        lstValeurs.add(operation.getNumeroOperation());
        lstValeurs.add(operation.getDateEffectif().toString());
        lstValeurs.add(operation.getDateReel().toString());

        return lstValeurs;
    }

    @Override
    public ArrayList<String> afficherEntete() {
        ArrayList lstEntete = new ArrayList();
        lstEntete.add("Numéro_Operation");
        lstEntete.add("Date_effectif");
        lstEntete.add("Date_Reel");
        return lstEntete;

}
}