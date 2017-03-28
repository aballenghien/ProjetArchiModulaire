package Plugins;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Client {

	private ArrayList<Compte> comptes;

	private String nom;
	private int Id;
	private String adresse;
	private String numero;

	public Client(String nom, int id, String adresse, String numero) {
		super();
		this.comptes = new ArrayList<>();
		this.nom = nom;
		Id = id;
		this.adresse = adresse;
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}

}
