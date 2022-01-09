package main.java.beans.gammesComplementaires;

import main.java.beans.Assurance;
import main.java.beans.GammesBaseAbstrait;
import main.java.beans.GammesComplementairesAbstrait;

public class GammeIncendie extends GammesComplementairesAbstrait {
    public GammeIncendie(GammesBaseAbstrait assurance) {
        super(assurance);
        super.nomDeGamme="GammeInondation";
    }


}
