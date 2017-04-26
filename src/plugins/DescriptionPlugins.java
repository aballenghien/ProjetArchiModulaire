/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import appli.data.IDescription;

/**
 *
 * @author Audrey
 */
public class DescriptionPlugins implements IDescription {

    private String nom;
    private String descClasse;
    private String descContrainte;

    public DescriptionPlugins(String nom, String descClasse, String descContrainte) {
        this.nom = nom;
        this.descClasse = descClasse;
        this.descContrainte = descContrainte;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getDescContrainte() {
        return this.descContrainte;
    }

    @Override
    public String getDescClasse() {
        return this.descClasse;
    }

}
