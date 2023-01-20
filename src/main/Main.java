package main;

import core.data.Client;
import core.services.*;

public class Main {

    public static void main(String[] args) {
        Provider prov = new ConcreteProvider();
        Bank bank = new ConcreteBank();
        Store store = new ConcreteStore(prov, bank);
        Client cl = new Client(store);

        cl.run();

    }

}
