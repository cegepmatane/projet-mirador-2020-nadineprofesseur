package modele;

public class Meteore {
	
	protected String nom;
	protected int id;
	protected int masse;
	protected String date;
	protected int year;
	protected float latitude;
	protected float longitude;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMasse() {
		return masse;
	}
	public void setMasse(int masse) {
		this.masse = masse;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	
}

/*
 * 
<name>Morito</name>
<id>16745</id>
<nametype>Valid</nametype>
<recclass>Iron, IIIAB</recclass>
<mass>10100000</mass>
<fall>Found</fall>
<year>1600-01-01T00:00:00</year>
<reclat>27.050000</reclat>
<reclong>-105.433330</reclong>
<geolocation latitude="27.05" longitude="-105.43333"/>
 */