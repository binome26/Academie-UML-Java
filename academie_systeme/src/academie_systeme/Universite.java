package academie_systeme;

import java.util.ArrayList;

public class Universite {

	private String nome_universite;
	private String site_adresse;
	private String localisation;
	private ArrayList<Departement> departements;

	public Universite(String nome_universite, String site_adresse, String localisation,
			ArrayList<Departement> departements) {

		this.nome_universite = nome_universite;
		this.site_adresse = site_adresse;
		this.localisation = localisation;
		this.departements = departements;
	}

	public String getNome_universite() {
		return nome_universite;
	}

	public void setNome_universite(String nome_universite) {
		this.nome_universite = nome_universite;
	}

	public String getSite_adresse() {
		return site_adresse;
	}

	public void setSite_adresse(String site_adresse) {
		this.site_adresse = site_adresse;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public ArrayList<Departement> getListDepartement() {
		return departements;
	}

	public void destroy() {
		if (departements != null)
			for (Departement d : departements) {
				departements.remove(d);
			}
	}

}
