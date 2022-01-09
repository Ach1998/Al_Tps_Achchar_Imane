package main.java.beans.gammesDeBase;

import main.java.beans.Assurance;
import main.java.beans.GammesBaseAbstrait;

public class GammeResponsabiliteCivil extends GammesBaseAbstrait {
    public GammeResponsabiliteCivil(Assurance assurance) {
        super(assurance);
        super.nomDeGamme="Gamme Responsabilité Civil";
    }
}
