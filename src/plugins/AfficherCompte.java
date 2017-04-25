/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import appli.data.Compte;
import appli.data.IAfficheur;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Audrey
 */
public class AfficherCompte implements IAfficheur{

    @Override
    public HashMap<String,String> afficher(Object o) {
        Compte c = (Compte) o;
        HashMap<String,String> lstValeurs = new HashMap<>();
        lstValeurs.put("Numéro de Compte", String.valueOf(c.getNumeroCompte()));
        lstValeurs.put("Solde", String.valueOf(c.getSolde()));
        return lstValeurs;
        
    }
}
