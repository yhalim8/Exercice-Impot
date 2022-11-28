package exercicee3;

public class DossierVehicule extends Dossier {
private int nbChevaux;
private char categorie;
	public DossierVehicule(long id,int nbc , char cat) {
		super(id);
		nbChevaux=nbc;
		categorie=cat;
		calculerMontant();
	}

	@Override
	public void calculerMontant() {
		if(nbChevaux<8 ) {
			if(categorie=='E') { montant=350;}
			else if(categorie=='G'){montant=700;}
		}	
		else if (nbChevaux>=8 && nbChevaux<=10 ) {
			if(categorie=='E') {
				montant=650;
			}else if(categorie=='G') { montant=1500;}	
		}	
		else if (nbChevaux>=11 && nbChevaux<=14 ) {
			if(categorie=='E') { montant=3000;}
			else if(categorie=='G') { montant=6000;}
		}	
		else if (nbChevaux>=15 ) {
			if(categorie=='E') { montant=8000;}
			else if(categorie=='G') {montant=20000;}
		}
		
	}
	@Override
		public String toString() {
		
			String detail="Vehicule  "+categorie+" "+nbChevaux+"CH, "+"montant:" +montant+"\n";
			
			return detail;
		}

}
