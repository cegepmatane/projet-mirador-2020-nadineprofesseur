package modele;

public class Nouvelle {
	
	protected String lien;
	protected String titre;
	protected String description;
	protected String date;	
	
	public Nouvelle(String lien, String titre) {
		super();
		this.lien = lien;
		this.titre = titre;
	}
	
	
	public Nouvelle(String lien, String titre, String description) {
		super();
		this.lien = lien;
		this.titre = titre;
		this.description = description;
	}

	

	public Nouvelle(String lien, String titre, String description, String date) {
		super();
		this.lien = lien;
		this.titre = titre;
		this.description = description;
		this.date = date;
	}


	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
