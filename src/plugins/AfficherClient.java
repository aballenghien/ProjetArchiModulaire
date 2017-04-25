/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import appli.data.Client;
import appli.data.Compte;
import appli.data.IAfficheur;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Audrey
 */
public class AfficherClient implements IAfficheur{

    @Override
    public HashMap<String, String> afficher(Object o) {
        Client c = (Client) o;
        HashMap<String,String> lstValeurs = new HashMap<>();
        lstValeurs.put("identifiant",String.valueOf(c.getId()));
        lstValeurs.put("", value)
    }

    
    
}
