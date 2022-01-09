package handler;

import departement.Demande;

public class Service_Compt extends handler{
    public Service_Compt() {
    }

    public void TraiterCommande(Demande demande) {
        Long budg = demande.getDep().getBudg().getBudget_global();
        if (demande.getMontant() < budg) {
            demande.setEtat("traite");
            this.nextHandler.TraiterCommande(demande);
        } else {
            demande.setEtat("nonTraite");
        }


    }}
