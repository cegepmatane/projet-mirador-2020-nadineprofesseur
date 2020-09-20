package modele;

import java.util.ArrayList;
import java.util.List;

public class StationSpatiale {
	
	protected List<String> astronautes;
	protected float longitude;
	protected float latitude;
	protected List<String> passages;
	
	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public StationSpatiale()
	{
		this.astronautes = new ArrayList<String>();
		this.passages = new ArrayList<String>();
	}
	
	public void ajouterAstronaute(String astronaute)
	{
		this.astronautes.add(astronaute);
	}

	public List<String> getAstronautes() {
		return astronautes;
	}
	
	public void ajouterPassage(String passage)
	{
		this.passages.add(passage);
	}

	public List<String> getPassages() {
		return passages;
	}

}
