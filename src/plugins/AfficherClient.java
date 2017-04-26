/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import java.util.ArrayList;

import appli.data.Client;
import appli.data.IAfficheur;

/**
 *
 * @author Audrey
 */
public class AfficherClient implements IAfficheur {

    @Override
    public ArrayList<String> afficher(Object o) {
        Client c = (Client) o;
        ArrayList<String> lstValeurs = new ArrayList();
        lstValeurs.add(String.valueOf(c.getId()));
        lstValeurs.add(c.getNom());
        lstValeurs.add(c.getNumeroTel());
        lstValeurs.add(c.getAdresse());

        return lstValeurs;
    }

    @Override
    public ArrayList<String> afficherEntete() {

        ArrayList<String> lstEnteteCompte = new ArrayList();
        lstEnteteCompte.add("Code Client");
        lstEnteteCompte.add("Nom");
        lstEnteteCompte.add("Numéro de téléphone");
        lstEnteteCompte.add("Adresse");
        return lstEnteteCompte;
    }

}
