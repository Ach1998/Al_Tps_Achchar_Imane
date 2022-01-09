package main.java.beans;

public abstract class GammesBaseAbstrait  extends AssuranceImp{
    protected  String nomDeGamme;
    protected Assurance assurance;

    public GammesBaseAbstrait(Assurance assurance) {
        this.assurance=assurance;
        this.nomDeGamme="";
    }
    @Override
    public void info() {
        assurance.info();
        System.out.print(this.nomDeGamme+" ");
    }
}
