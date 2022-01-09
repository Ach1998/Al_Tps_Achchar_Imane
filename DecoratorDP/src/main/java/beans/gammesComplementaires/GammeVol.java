package main.java.beans.gammesComplementaires;

import main.java.beans.Assurance;
import main.java.beans.GammesBaseAbstrait;
import main.java.beans.GammesComplementairesAbstrait;

public class GammeVol extends GammesComplementairesAbstrait {

    public GammeVol(GammesBaseAbstrait assurance) {
        super(assurance);
        super.nomDeGamme="Gamme Vol";
    }



}
