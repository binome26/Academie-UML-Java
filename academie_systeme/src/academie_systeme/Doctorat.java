package academie_systeme;

public class Doctorat {
	private int numero_doctorat;
	private String libelle;

	public Doctorat(int numero_doctorat, String libelle) {
		this.numero_doctorat = numero_doctorat;
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumero_doctorat() {
		return numero_doctorat;
	}

	public void setNumero_doctorat(int numero_doctorat) {
		this.numero_doctorat = numero_doctorat;
	}
}
