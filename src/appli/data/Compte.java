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

		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Operation> getOperation() {
		return operations;
	}

	public void setOperation(ArrayList<Operation> operation) {
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

}
