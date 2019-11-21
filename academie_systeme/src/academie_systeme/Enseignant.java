package academie_systeme;

import java.util.ArrayList;
import java.util.Date;

public abstract class Enseignant extends Personne {

	private float salaire;
	private Date date_entree;
	private ArrayList<Cours> cours;
	private Departement departement;
	
	public Enseignant(float salaire, Date date_entree) {
 		this.salaire = salaire;
		this.date_entree = date_entree;
	}

	public Enseignant(int id, String nom, String tel, String email, float salaire, Date date_entree) {
		super(id, nom, tel, email);
		this.salaire = salaire;
		this.date_entree = date_entree;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public Date getDate_entree() {
		return date_entree;
	}

	public void setDate_entree(Date date_entree) {
		this.date_entree = date_entree;
	}
	public void cours_enseigner() {}

	public ArrayList<Cours> getCours() {
		return cours;
	}

	public void setCours(ArrayList<Cours> cours) {
		this.cours = cours;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
