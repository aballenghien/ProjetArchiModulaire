/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli.data;

/**
 *
 * @author Audrey
 */
public interface IDescription {
        
    public String getNom();
    public String getDescContrainte();
    public String getDescClasse();
    public Class<?> getContrainte();
    public Class<?> getClasse();
    public void setContrainte(Class<?> contrainte);
    public void setClasse(Class<?> classe);
}
