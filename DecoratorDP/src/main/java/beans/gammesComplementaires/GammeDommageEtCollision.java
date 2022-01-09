package main.java.beans.gammesComplementaires;

import main.java.beans.Assurance;
import main.java.beans.GammesBaseAbstrait;
import main.java.beans.GammesComplementairesAbstrait;

public class GammeDommageEtCollision extends GammesComplementairesAbstrait {


    public GammeDommageEtCollision(GammesBaseAbstrait assurance) {
        super(assurance);
        super.nomDeGamme="GammeInondation";
    }


}
