package exercicee3;

abstract class Dossier {
Impots impo;
private long id;
protected double montant;
public Dossier(Long id) {
	this.id=id;
}
public abstract void calculerMontant();
public long getId() {
	return id;
}



}
