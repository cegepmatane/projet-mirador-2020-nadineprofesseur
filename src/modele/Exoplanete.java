package modele;

public class Exoplanete {
	
	protected String nom;
	protected String type;
	protected float eccentricite;
	protected float inclinaison;
	protected float axeSemiMajeur;
	protected float distance;
	protected float masse;
	protected float largeur;
	
	public float getMasse() {
		return masse;
	}
	public void setMasse(float masse) {
		this.masse = masse;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getEccentricite() {
		return eccentricite;
	}
	public void setEccentricite(float eccentricite) {
		this.eccentricite = eccentricite;
	}
	public float getInclinaison() {
		return inclinaison;
	}
	public void setInclinaison(float inclinaison) {
		this.inclinaison = inclinaison;
	}
	public float getAxeSemiMajeur() {
		return axeSemiMajeur;
	}
	public void setAxeSemiMajeur(float axeSemiMajeur) {
		this.axeSemiMajeur = axeSemiMajeur;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}

	
	
}
