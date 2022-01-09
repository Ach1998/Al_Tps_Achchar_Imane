package departement;
import java.util.*;

@SuppressWarnings("deprecation")
public class Demande extends Observable {
	private long montant ;
	private String etat;
	private Departement dep;
	public Demande(long montant, String etat) {
		super();
		this.montant = montant;
		this.etat = etat;
	}
	
	
	public long getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
		this.notifyObservateurs();
	}
	public Demande(long montant, String etat, Departement dep) {
		super();
		this.montant = montant;
		this.etat = etat;
		this.dep = dep;
	}


	public String getEtat() {
		return etat;
	}
	private void notifyObservateurs() {
		// TODO Auto-generated method stub
		this.setChanged();
		this.notifyObservers();
		
	}

	public void setEtat(String etat) {
		this.etat = etat;
		notifyObservateurs();
		}


	public Departement getDep() {
		return dep;
	}


	public void setDep(Departement dep) {
		this.dep = dep;
	}
	

}
