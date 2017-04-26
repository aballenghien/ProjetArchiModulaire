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
		lstValeurs.add(c.getAdresse());
		lstValeurs.add(c.getNumeroTel());
		/*
		lstValeurs.put("identifiant", String.valueOf(c.getId()));
		lstValeurs.put("nom", c.getNom());
		lstValeurs.put("adresse", c.getAdresse());
		lstValeurs.put("numéro de téléphone", c.getNumeroTel());
		*/
		return lstValeurs;
	}

	@Override
	public ArrayList<String> afficherEntete(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
