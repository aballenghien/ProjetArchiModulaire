package appli.data;

import java.util.ArrayList;

public final class Banque {

    private ArrayList<Client> clients;

    public Banque() {
        super();
        this.clients = new ArrayList<>();
        chargerBanque();
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    /**
     * Charge des données fictives pour la banque
     */
    public void chargerBanque() {
        Client client1 = new Client("alae", 1, "Nantes", "066666666");

        Compte compteClient1 = new Compte(client1, 2, 1000000);
        client1.getComptes().add(compteClient1);
        this.clients.add(client1);
    }

    /**
     * Recherche un client dans la liste des clients de la banque à partir de
     * son id
     *
     * @param id int
     * @return Client
     */
    public Client chercherClient(int id) {
        Client client = null;
        for (Client list : clients) {
            if (list.getId() == id) {
                client = list;
            }
        }
        return client;
    }

}
