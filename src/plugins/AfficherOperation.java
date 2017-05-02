package plugins;

import java.util.HashMap;

import appli.data.IAfficheur;
import appli.data.Operation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AfficherOperation implements IAfficheur {

    @Override
    public ArrayList<String> afficher(Object o) {
        Operation operation = (Operation) o;
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList lstValeurs = new ArrayList();
        lstValeurs.add(operation.getNumeroOperation());
        lstValeurs.add(sf.format(operation.getDateEffective()));
        lstValeurs.add(sf.format(operation.getDateReel()));
        lstValeurs.add(String.valueOf(operation.getCredit()));
        lstValeurs.add(String.valueOf(operation.getDebit()));
        lstValeurs.add(String.valueOf(operation.getSoldeCompte()));
        return lstValeurs;
    }

    @Override
    public ArrayList<String> afficherEntete() {
        ArrayList lstEntete = new ArrayList();
        lstEntete.add("Numéro d'opération");
        lstEntete.add("Date effective");
        lstEntete.add("Date Réelle");
        lstEntete.add("Crédit");
        lstEntete.add("Débit");
        lstEntete.add("Solde du compte");
        return lstEntete;

    }
}
