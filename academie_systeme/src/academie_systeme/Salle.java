package academie_systeme;

import java.util.ArrayList;

public class Salle {
	private int numero_salle;
	private String nom;
	private String capacite;
	ArrayList<Matiere> cours;

	public Salle(int numero_salle, String nom, String capacite) {
		this.numero_salle = numero_salle;
		this.nom = nom;
		this.capacite = capacite;
		cours=new ArrayList<Matiere>();
	}

	public int getNumero_salle() {
		return numero_salle;
	}

	public void setNumero_salle(int numero_salle) {
		this.numero_salle = numero_salle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}

	public ArrayList<Matiere> getCours() {
		return cours;
	}

	public void setCours(ArrayList<Matiere> cours) {
		this.cours = cours;
	}
	public void ajouterCour(Matiere c) {
		
		cours.add(c);
		
	}
	public String afficherSalle() {
		
		return this.toString();
	}

}
