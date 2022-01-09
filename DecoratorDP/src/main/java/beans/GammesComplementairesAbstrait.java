package main.java.beans;

public abstract class GammesComplementairesAbstrait extends GammesBaseAbstrait {
    GammesBaseAbstrait gammesBaseAbstrait;


    public GammesComplementairesAbstrait(GammesBaseAbstrait gammesBaseAbstrait) {
        super(gammesBaseAbstrait);
        this.gammesBaseAbstrait=gammesBaseAbstrait;
    }
    @Override
    public void info() {
        gammesBaseAbstrait.info();
        System.out.print("+ "+this.nomDeGamme);
    }
}
