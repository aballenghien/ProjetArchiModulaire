/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli.data;

import java.util.ArrayList;

/**
 *
 * @author Audrey
 */
public interface IAfficheur {

	public ArrayList<String> afficher(Object o);

	public ArrayList<String> afficherEntete(Object o);

}
