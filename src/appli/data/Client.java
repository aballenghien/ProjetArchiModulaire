package appli.data;

import java.util.ArrayList;

public class Client {

	private ArrayList<Compte> comptes;
        private int Id;
	private String nom;
	private String numeroTel;
	private String adresse;
	

	public Client(String nom, int id, String adresse, String numero) {
		super();
		this.comptes = new ArrayList<>();
		this.nom = nom;
		Id = id;
		this.adresse = adresse;
		this.numeroTel = numero;
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

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numero) {
		this.numeroTel = numero;
	}

	public ArrayList<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}

}
