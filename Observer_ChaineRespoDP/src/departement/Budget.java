package departement;
import java.util.*;

public class Budget implements Observer {
	long budget_global;
	long blocked ;
	public long getBudget_global() {
		return budget_global;
	}
	public void setBudget_global(long budget_global) {
		this.budget_global = budget_global;
	}
	public long getBlocked() {
		return blocked;
	}
	public void setBlocked(long blocked) {
		this.blocked = blocked;
	}
	public Budget(long budget_global, long blocked) {
		super();
		this.budget_global = budget_global;
		this.blocked = blocked;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof Demande ) {
            Demande d = (Demande)o;
            if (d.getEtat() == "traited") {
                this.blocked = d.getMontant();
            } else if (d.getEtat() == "Terminer") {
                this.blocked = 0L;
            }

            this.affiche(this.blocked);
		}
		}
	    private Long affiche(Long blocked) {
	        return blocked;
	    }

		
	}
	
	


