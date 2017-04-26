/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import java.util.ArrayList;

import appli.data.Compte;
import appli.data.IAfficheur;

/**
 *
 * @author Audrey
 */
public class AfficherCompte implements IAfficheur {

    @Override
    public ArrayList<String> afficher(Object o) {
        Compte c = (Compte) o;
        ArrayList lstValeurs = new ArrayList();
        lstValeurs.add(String.valueOf(c.getNumeroCompte()));
        lstValeurs.add(String.valueOf(c.getSolde()));
        /*suivis des autres attrivbuts */

        return lstValeurs;

    }

    @Override
    public ArrayList<String> afficherEntete() {

        ArrayList lstentetecompte = new ArrayList();
        lstentetecompte.add("Numéro Compte");
        lstentetecompte.add("Solde");

        return lstentetecompte;
    }

}
