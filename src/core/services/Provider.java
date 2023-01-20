package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface Provider {

    int order(ConcreteStore store, Object item, int qty) throws UnknownItemException;

    double getPrice(Object item) throws UnknownItemException;
}
