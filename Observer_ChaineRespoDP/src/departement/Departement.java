package departement;

public class Departement {
	long id ;
	Budget budg;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Budget getBudg() {
		return budg;
	}
	public void setBudg(Budget budg) {
		this.budg = budg;
	}
	public Departement(long id, Budget budg) {
		super();
		this.id = id;
		this.budg = budg;
	}
	public Departement(Budget budg) {
		super();
		this.budg = budg;
	}
	

}
