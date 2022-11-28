package exercicee3;

import java.util.ArrayList;

public class Impots {
private int annee ;
Societe societe;
private double totalImpot=0;
ArrayList<Dossier> dossier= new ArrayList<>();
public  Impots(int annee) {
	this.annee=annee;
}
public int getAnne() {
	return annee;
}
public void add(Dossier d) {
	dossier.add(d);
	totalImpot+=d.montant;
}
@Override
	public String toString() {
		String detail="Liste des impots "+ annee+"\n";
		for(Dossier d:dossier){
			   detail+=d;
			}
			   detail+="total:"+totalImpot;
		return detail;
	}

}
