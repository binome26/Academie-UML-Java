package academie_systeme;

import java.util.Date;

public class EnseignantAssisstance extends Enseignant {
	private Date date_fin_fonction;

	public EnseignantAssisstance(float salaire, Date date_entree) {
		super(salaire, date_entree);
		// TODO Auto-generated constructor stub
	}

	public EnseignantAssisstance(int id, String nom, String tel, String email, float salaire, Date date_entree,
			Date date_fin_fonction) {
		super(id, nom, tel, email, salaire, date_entree);
		this.date_fin_fonction = date_fin_fonction;
	}

	public Date getDate_fin_fonction() {
		return date_fin_fonction;
	}

	public void setDate_fin_fonction(Date date_fin_fonction) {
		this.date_fin_fonction = date_fin_fonction;
	}

}
