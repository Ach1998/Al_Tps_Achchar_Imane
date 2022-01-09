package main.java.beans.gammesComplementaires;

import main.java.beans.Assurance;
import main.java.beans.GammesBaseAbstrait;
import main.java.beans.GammesComplementairesAbstrait;

public class GammeInondation extends GammesComplementairesAbstrait {

    public GammeInondation(GammesBaseAbstrait gammesBase) {
        super(gammesBase);
        super.nomDeGamme="GammeInondation";
    }

}
