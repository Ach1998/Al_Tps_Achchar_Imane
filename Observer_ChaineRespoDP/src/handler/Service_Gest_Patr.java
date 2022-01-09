package handler;

import departement.Demande;

public class Service_Gest_Patr extends handler {
    public Service_Gest_Patr() {
    }

    public void TraiterCommande(Demande demande) {
        Long budg = demande.getDep().getBudg().getBudget_global();
        if (demande.getEtat() == "traited") {
            budg -= demande.getMontant();
            demande.setEtat("Terminer");
            System.out.println("terminer");
        } else if (demande.getEtat() == "nonTraited") {
            System.out.println("le montant demandee depasse le budget ");
        }

    }
}
