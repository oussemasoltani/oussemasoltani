public class Compte{
	double solde;
	public Compte(double solde)
	{
		this.solde=solde;
	}
	public double getSolde()
	{
		return solde;
	}
	public double retirer(double montant)
	{
		if (montant <=this.solde)
			return this.solde-=montant;
		else
		{
			System.out.println("Retrait impossible, solde insuffisant");
			return this.solde;
		}
	}
	public double deposer(double m_ajout)
	{
		return solde+=m_ajout;
	}
	public void virer_vers(double m_virement, Compte C2)
	{
		if (m_virement <= this.solde)
		{
			this.solde-=m_virement;
			C2.solde+=m_virement;
		}
		else
			System.out.println("virement impossible, solde insuffisant");
	}
	public static void main(String[] args)
	{
		Compte C1 = new Compte(650);
		Compte C2 = new Compte(0);
		System.out.println("le compte C1 contient" +C1.getSolde());
		C1.retirer(250);
		C1.deposer(100);
		C1.virer_vers(200, C2);
		System.out.println("le compte C1 contient" +C1.getSolde());
		System.out.println("le compte C2 contient" +C2.getSolde());
		
		
		Compte[] table = new Compte[8];
		for(int i=0; i<table.length;i++){
			Compte table[i] = new Compte(0);
			table[i].deposer(350 + i*50);
		}
		
		for(int i=0; i<table.length;i++){
			if (i==table.length-1) break;
			else
			
				for(int j=i+1; j<table.length;j++)
					table[i].virer_vers(30, table[j]);
							
		}
		
		for(int i=0; i<table.length;i++){
			System.out.println("Le compte numero" +i+ " contient "+ table[i].getSolde());
			
		}
		
		
		
		
		
		
		
		
	
		
	}
	
}