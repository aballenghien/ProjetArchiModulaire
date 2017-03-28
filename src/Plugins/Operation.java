package Plugins;

import java.util.Date;

public class Operation {
	private Compte compte;
	private Date dateEffectif;
	private Date dateReel;
	private int numeroOperation;

	public Operation(Compte compte, Date dateEffectif, Date dateReel, int numeroOperation) {
		super();
		this.compte = compte;
		this.dateEffectif = dateEffectif;
		this.dateReel = dateReel;
		this.numeroOperation = numeroOperation;
	}

	public Date getDateEffectif() {
		return dateEffectif;
	}

	public void setDateEffectif(Date dateEffectif) {
		this.dateEffectif = dateEffectif;
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

	
}
