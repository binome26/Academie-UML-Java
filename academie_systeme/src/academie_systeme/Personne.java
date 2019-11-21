package academie_systeme;

public abstract class Personne {

	private int id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;

	public Personne() {

	}

	public Personne(int id, String nom, String tel, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.tel = tel;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String afficher_infos() {

		return "id" + this.id + "\nnom " + this.nom + "\nprenom " + this.prenom + "\ntel " + this.tel + "\nemail"
				+ this.email;
	}

}
