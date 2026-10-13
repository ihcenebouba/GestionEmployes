package gestion;

public class EmployePermanent  extends Employe implements Prime{

	private double prime;

	public EmployePermanent(String nom, double salaireBase) {
		super(nom, salaireBase);
		this.prime = 0;
	}

	@Override
	public void calculerSalaire() {
		double salaire = getsalaire() + prime;
		System.out.println("Salaire aprés la prome fixe est " + salaire);
	}

	@Override
	public void appliquerPrime(double montant) {
		this.prime +=montant ;
		
	}

}
