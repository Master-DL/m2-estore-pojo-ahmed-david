package main;

import core.data.Client;
import core.services.*;

public class Main {

    public static void main(String[] args) {
        Orderable prov = new Provider();
        Transferable transferable = new Bank();
        OrdrePreparation ordrePreparation = new Store(prov, transferable);
        Client cl = new Client(ordrePreparation);

        cl.run();

    }

}
