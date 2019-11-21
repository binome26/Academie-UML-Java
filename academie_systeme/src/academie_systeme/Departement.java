package academie_systeme;

import java.util.ArrayList;

public class Departement {

	private int code_departement;
	private String name_departement;
	private ArrayList<Etudient> etudients;
	private Enseignant_habilite responsable;
	private Universite universite;
	private ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
	private ArrayList<Laboratoire> laboratoires = new ArrayList<Laboratoire>();

	public Departement(int code_departement, String name_departement, Enseignant_habilite responsable) {
		this.code_departement = code_departement;
		this.name_departement = name_departement;
		this.responsable = responsable;
	}

	public int getCode_departement() {
		return code_departement;
	}

	public void setCode_departement(int code_departement) {
		this.code_departement = code_departement;
	}

	public String getName_departement() {
		return name_departement;
	}

	public void setName_departement(String name_departement) {
		this.name_departement = name_departement;
	}

	public ArrayList<Etudient> getEtudients() {
		return etudients;
	}

	public void setEtudients(ArrayList<Etudient> etudients) {
		this.etudients = etudients;
	}

	public ArrayList<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(ArrayList<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public ArrayList<Laboratoire> getLaboratoires() {
		return laboratoires;
	}

	public void setLaboratoires(ArrayList<Laboratoire> laboratoires) {
		this.laboratoires = laboratoires;
	}

	public Enseignant_habilite getResponsable() {
		return responsable;
	}

	public void setResponsable(Enseignant_habilite responsable) {
		this.responsable = responsable;
	}

	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}

	public double calculer_moyenne() {
		double sum = 0;
		for (Etudient etudient : etudients) {
			sum += etudient.getMoyenne();
		}
		return sum / etudients.size();
	}

	public void ajouter_etudients(Etudient etudient) {
		etudients.add(etudient);
	}

}
