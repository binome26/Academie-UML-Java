package academie_systeme;

public class Note {

	private float notecontrole;
	private Etudient etudient;
	private Matiere matiere;

	public Note(float notecontrole, Etudient etudient, Matiere matiere) {
		this.notecontrole = notecontrole;
		this.etudient = etudient;
		this.matiere = matiere;
		this.matiere.ajouter_note(this);
		this.etudient.ajouter_note(this);
		
	}

	public float getNotecontrole() {
		return notecontrole;
	}

	public void setNotecontrole(float notecontrole) {
		this.notecontrole = notecontrole;
	}

	public Etudient getEtudient() {
		return etudient;
	}

	public void setEtudient(Etudient etudient) {
		this.etudient = etudient;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
}
