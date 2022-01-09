package Test;

import departement.Budget;
import departement.Demande;
import departement.Departement;
import handler.Service_Compt;
import handler.Service_Gest_Patr;
import handler.handler;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Budget budget = new Budget(2000L, 0L);
        Departement departement = new Departement(budget);
        Demande demande = new Demande(1500L, "traite",departement);
        handler serviceComptable = new Service_Compt();
        handler serviceGestionPatrimoine = new Service_Gest_Patr();
        serviceComptable.setNextHandler(serviceGestionPatrimoine);
        serviceComptable.TraiterCommande(demande);

	}

}
