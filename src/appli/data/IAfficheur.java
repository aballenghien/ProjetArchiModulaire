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

    /**
     * Affiche la liste des valeurs des attributs de l'objet
     *
     * @param o Object
     * @return ArrayList String
     */
    ArrayList<String> afficher(Object o);

    /**
     * Affiche la liste des attributs de l'objet sous forme de titre
     *
     * @return ArrayList String
     */
    ArrayList<String> afficherEntete();

}
