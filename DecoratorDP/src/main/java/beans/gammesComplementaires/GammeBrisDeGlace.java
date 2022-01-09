package main.java.beans.gammesComplementaires;

import main.java.beans.Assurance;
import main.java.beans.GammesBaseAbstrait;
import main.java.beans.GammesComplementairesAbstrait;

public class GammeBrisDeGlace extends GammesComplementairesAbstrait {

    public GammeBrisDeGlace(GammesBaseAbstrait assurance) {
        super(assurance);
        super.nomDeGamme="Gamme Bris De lace";
    }


}
