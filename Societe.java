package exercicee3;

import java.util.ArrayList;

public class Societe {
private long id;
private String raison_social;
ArrayList<Impots> impots = new ArrayList<>();
public Societe(long id,String rs) {
	this.id=id;
	raison_social = rs;
}
public Impots getImpots(int annee) {
	Impots a = null ;
	for(int i=0;i<impots.size();i++) {
		if(impots.get(i).getAnne()==annee)
			a=impots.get(i);
	}
return a;	
}
public void add(Impots imp) {
	impots.add(imp);
}
@Override
	public String toString() {
		String detail = "Societe:"+id +" - "+raison_social;
		return detail;
	}

}
