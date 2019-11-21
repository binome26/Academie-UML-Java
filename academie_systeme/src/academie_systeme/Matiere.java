package academie_systeme;

import java.util.ArrayList;

public class Matiere {
	private int numero_cour;
	private String libelle_cour;
	private Salle salle;
	private Enseignant enseignants;
	ArrayList<Note> notes = new ArrayList<Note>();

	public Matiere(int numero_cour, String libelle_cour, Salle salle, Enseignant enseignants) {
		this.numero_cour = numero_cour;
		this.libelle_cour = libelle_cour;
		this.salle = salle;
		this.enseignants = enseignants;
	}

	public int getNumero_cour() {
		return numero_cour;
	}

	public void setNumero_cour(int numero_cour) {
		this.numero_cour = numero_cour;
	}

	public String getLibelle_cour() {
		return libelle_cour;
	}

	public void setLibelle_cour(String libelle_cour) {
		this.libelle_cour = libelle_cour;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Enseignant getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(Enseignant enseignants) {
		this.enseignants = enseignants;
	}

	public double calculer_moyenne() {
		double sum = 0;
		for (Note note : notes) {
			sum += note.getNotecontrole();
		}

		return sum / notes.size();

	}

	public void ajouter_note(Note note) {
		notes.add(note);
	}
}
