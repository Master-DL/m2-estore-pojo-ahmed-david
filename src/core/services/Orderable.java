package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface Orderable {

    int order(Store store, Object item, int qty) throws UnknownItemException;

    double getPrice(Object item) throws UnknownItemException;
}
