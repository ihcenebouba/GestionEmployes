package gestion;

public class EmployeFreelance  extends Employe{

	public EmployeFreelance(String nom, double salaireBase) {
		super(nom, salaireBase);
		
	}

	@Override
	public void calculerSalaire() {
		
		double salaire = getsalaire() * 1.10 ;
		System.out.println("Salaire aprés la prome fixe est " + salaire);
	
	}

}
