package gestion;

public  abstract class Employe {

	private String nom ;
	private  double salaireBase;
	 
	 public Employe(String nom , double salaireBase) {
		 this.nom = nom;
		 this.salaireBase= salaireBase;
		
	}
	 public String getnom() {
		 return nom;
	 }
	 public double getsalaire() {
		 return salaireBase;
	 }
	 
	 public abstract void  calculerSalaire() ;

	 
	 }
