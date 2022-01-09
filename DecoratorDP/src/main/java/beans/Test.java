package main.java.beans;

import main.java.beans.gammesComplementaires.GammeInondation;
import main.java.beans.gammesComplementaires.GammeVol;
import main.java.beans.gammesDeBase.GammeResponsabiliteCivil;

public class Test {
    public static void main(String[] args) {
        Assurance assurance=new AssuranceImp();
        assurance=new GammeInondation(new GammeVol(new GammeResponsabiliteCivil(assurance)));
        assurance.info();

    }
}
