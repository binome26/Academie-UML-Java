package academie_systeme;

import java.util.ArrayList;

public class Laboratoire {

	private int numero_laboratoire;
	private Enseignant_habilite responsable;
	private ArrayList<Enseignant_habilite> enseignantChercheurs;
	private ArrayList<Doctorat> doctorats;

	public Laboratoire(int numero_laboratoire, Enseignant_habilite responsable) {
		this.numero_laboratoire = numero_laboratoire;
		this.responsable = responsable;
	}

	public int getNumero_laboratoire() {
		return numero_laboratoire;
	}

	public void setNumero_laboratoire(int numero_laboratoire) {
		this.numero_laboratoire = numero_laboratoire;
	}

	public Enseignant_habilite getResponsable() {
		return responsable;
	}

	public void setResponsable(Enseignant_habilite responsable) {
		this.responsable = responsable;
	}

	public ArrayList<Doctorat> getDoctorats() {
		return doctorats;
	}

	public void setDoctorats(ArrayList<Doctorat> doctorats) {
		this.doctorats = doctorats;
	}

	public ArrayList<Enseignant_habilite> getEnseignantChercheurs() {
		return enseignantChercheurs;
	}

	public void setEnseignantChercheurs(ArrayList<Enseignant_habilite> enseignantChercheurs) {
		this.enseignantChercheurs = enseignantChercheurs;
	}

}
