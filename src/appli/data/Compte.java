package appli.data;

import java.util.ArrayList;

public class Compte {

    private Client client;
    private ArrayList<Operation> operations;
    private int numeroCompte;
    private float solde;

    public Compte(Client client, int numeroCompte, float solde) {
        super();
        this.client = client;
        this.operations = new ArrayList<Operation>();
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operation) {
        this.operations = operation;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return String.valueOf(this.numeroCompte);
    }

}
