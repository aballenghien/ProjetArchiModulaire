package appli.data;

import java.util.Date;

public class Operation {

    private Compte compte;
    private Date dateEffective;
    private Date dateReel;
    private int numeroOperation;
    private float soldeCompte;
    private float credit;
    private float debit;

    public Operation(Compte compte, Date dateEffectif, Date dateReel, int numeroOperation, float solde) {
        super();
        this.compte = compte;
        this.dateEffective = dateEffectif;
        this.dateReel = dateReel;
        this.numeroOperation = numeroOperation;
        this.soldeCompte = solde;
        this.credit = 0;
        this.debit = 0;
    }

    public Date getDateEffective() {
        return dateEffective;
    }

    public void setDateEffective(Date dateEffective) {
        this.dateEffective = dateEffective;
    }

    public Date getDateReel() {
        return dateReel;
    }

    public void setDateReel(Date dateReel) {
        this.dateReel = dateReel;
    }

    public int getNumeroOperation() {
        return numeroOperation;
    }

    public void setNumeroOperation(int numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public float getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

}
