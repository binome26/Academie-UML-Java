package academie_systeme;

import java.util.Date;

public class Enseignant_habilite extends Enseignant{

	private Laboratoire laboratoire;
	
	
	public Enseignant_habilite(float salaire, Date date_entree) {
		super(salaire, date_entree);
		// TODO Auto-generated constructor stub
	}

	public Enseignant_habilite(int id, String nom, String tel, String email, float salaire, Date date_entree) {
		super(id, nom, tel, email, salaire, date_entree);
		// TODO Auto-generated constructor stub
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}
	

}
