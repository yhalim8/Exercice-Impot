package exercicee3;

public class DossierRevenu extends Dossier {
private double ca;
	public DossierRevenu(long id,double ca) {
		super(id);
		this.ca=ca;
		calculerMontant();
		
	}

	@Override
	public void calculerMontant() {
		 montant=(ca*15)/100;	
	}
	@Override
		public String toString() {
			String detail = "15% de revenus "+ca+" Montant:"+montant+"\n";
			return detail;
		}

}
