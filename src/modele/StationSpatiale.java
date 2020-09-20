package modele;

import java.util.ArrayList;
import java.util.List;

public class StationSpatiale {
	
	protected List<String> astronautes;
	protected float longitude;
	protected float latitude;
	protected List<String> passages;
	
	public StationSpatiale()
	{
		this.astronautes = new ArrayList<String>();
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
