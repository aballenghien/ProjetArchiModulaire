package appli.data;

public interface IModifCompte {

    /**
     * Apporte un modification au compte fournit en paramètre c'est à dire,
     * ajoute ou soustrait le montant. Il créé également une opération qui sera
     * associé à la liste des opérations du compte
     *
     * @param compte Compte
     * @param montant float
     * @return boolean
     */
    boolean modifier(Compte compte, float montant);

}
