package academie_systeme;

import java.util.ArrayList;
import java.util.Date;

public class Etudient extends Personne {

	private String filere;
	private double moyenne;
	private Date annee_entree;
	ArrayList<Note> notes = new ArrayList<Note>();

	public Etudient(int id, String nom, String tel, String email, String filere, double moyenne, Date annee_entree) {
		super(id, nom, tel, email);
		this.filere = filere;
		this.moyenne = moyenne;
		this.annee_entree = annee_entree;
	}

	public String getFilere() {
		return filere;
	}

	public void setFilere(String filere) {
		this.filere = filere;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public Date getAnnee_entree() {
		return annee_entree;
	}

	public void setAnnee_entree(Date annee_entree) {
		this.annee_entree = annee_entree;
	}

	@Override
	public String afficher_infos() {
		// TODO Auto-generated method stub
		return super.afficher_infos() + "\nfilere " + filere + "\nmoyenne " + annee_entree;
	}

	public double calculer_moyenne() {
		double sum=0;
		for(Note note :notes) {
			sum+=note.getNotecontrole();
		}
		moyenne=sum/notes.size();
		return moyenne;
	}

	public void ajouter_note(Note note) {
		notes.add(note);
	}

}
