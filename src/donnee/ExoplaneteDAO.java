package donnee;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		
		return exoplanetes;
		
	}

}

/*
 * Explications champs https://ssd.jpl.nasa.gov/sbdb_query.cgi
 * 
 */