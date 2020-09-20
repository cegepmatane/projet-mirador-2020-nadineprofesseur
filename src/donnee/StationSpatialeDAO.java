package donnee;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import modele.StationSpatiale;

public class StationSpatialeDAO {

	
	public StationSpatiale detaillerStationSpatiale()
	{
		String json = "";
		StationSpatiale station = new StationSpatiale();
		
		String URL_LISTE_ASTRONAUTES = "http://api.open-notify.org/astros.json";
		try {
			String derniereBalise = "\"success\"}";
			URL url = new URL( URL_LISTE_ASTRONAUTES );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			json = lecteur.next() + derniereBalise;
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(json);
		JSONObject objAstronautes = new JSONObject(json);
		JSONArray listeAstronautes = objAstronautes.getJSONArray("people");
		for(int position = 0; position < listeAstronautes.length(); position++)
		{
			JSONObject astronaute = listeAstronautes.getJSONObject(position);
			String nom = astronaute.getString("name");
			//System.out.println(nom);
			station.ajouterAstronaute(nom);
		}

		String URL_POSITION_ACTUELLE = "http://api.open-notify.org/iss-now.json";
		try {
			String derniereBalise = "\"success\"}";
			URL url = new URL( URL_POSITION_ACTUELLE );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			json = lecteur.next() + derniereBalise;
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(json);
		JSONObject objPositionActuelle = new JSONObject(json);
		float longitude = Float.parseFloat(objPositionActuelle.getJSONObject("iss_position").getString("longitude"));
		float latitude = Float.parseFloat(objPositionActuelle.getJSONObject("iss_position").getString("latitude"));
		System.out.println("La station spatiale est a " + latitude + "," + longitude);
		station.setLatitude(latitude);
		station.setLongitude(longitude);

		String URL_PASSAGE_STATION = "http://api.open-notify.org/iss-pass.json?lat=48.84&lon=68&alt=20&n=5";
		try {
			String derniereBalise = "  ]\n}";
			URL url = new URL( URL_PASSAGE_STATION );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			json = lecteur.next() + derniereBalise;
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(json);
		JSONObject objPassages = new JSONObject(json);
		JSONArray listePassages = objPassages.getJSONArray("response");
		for(int position = 0; position < listePassages.length(); position++)
		{
			JSONObject passage = listePassages.getJSONObject(position);
			int tempsPassage = passage.getInt("risetime");
			System.out.println("Temps passage : " + tempsPassage);
			station.ajouterPassage(tempsPassage + "");
		}
		
		return station;
	}
	
}
