package handler;

import departement.Demande;

public abstract class handler {
    protected handler nextHandler;

    public handler() {
    }

    public abstract void TraiterCommande(Demande var1);

    public handler getNextHandler() {
        return this.nextHandler;
    }

    public void setNextHandler(handler nextHandler) {
        this.nextHandler = nextHandler;

}}
