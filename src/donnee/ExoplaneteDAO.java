package donnee;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import modele.Exoplanete;

public class ExoplaneteDAO {
	
	public List<Exoplanete> listerExplanete()
	{
		List<Exoplanete> exoplanetes = new ArrayList<Exoplanete>();
		String json = "";
		String URL_LISTE_EXOPLANETES = "http://www.asterank.com/api/mpc?limit=20";
		try {
			String derniereBalise = "}]";
			URL url = new URL( URL_LISTE_EXOPLANETES );
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
		
		JSONArray objExoplanetes = new JSONArray(json);
		for(int position = 0; position < objExoplanetes.length(); position++)
		{
			JSONObject objExoplanete = objExoplanetes.getJSONObject(position);
			String nom = objExoplanete.getString("readable_des");
			float eccentricite = objExoplanete.getFloat("e");
			float inclinaison = objExoplanete.getFloat("i");
			
			System.out.println(nom);
			
			Exoplanete planete = new Exoplanete();
			planete.setNom(nom);
			planete.setEccentricite(eccentricite);
			planete.setInclinaison(inclinaison);
			exoplanetes.add(planete);
		}
		
		return exoplanetes;
		
	}

}

/*
 * Explications champs https://ssd.jpl.nasa.gov/sbdb_query.cgi
 * 
 */