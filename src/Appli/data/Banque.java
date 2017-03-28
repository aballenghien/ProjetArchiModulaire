package appli.data;

import java.util.ArrayList;

public class Banque {
	private ArrayList<Client> clients;

	public Banque() {
		super();
		this.clients = new ArrayList<Client>();
		chargerBanque();
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public void chargerBanque() {
		Client client1 = new Client("alae", 1, "Nantes", "066666666");

		Compte compteClient1 = new Compte(client1, 2, 1000000);
		client1.getComptes().add(compteClient1);
		this.clients.add(client1);
	}

}
