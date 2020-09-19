package donnee;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modele.Nouvelle;

public class NouvelleDAO {
	
	public List<Nouvelle> listerNouvelles()
	{
		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		
		String URL_LISTE_NOUVELLES = "https://www.space.com/feeds/all";
		String derniereBalise = "</rss>";

		String xml = "";
		try {
			URL urlListePensees;
			urlListePensees = new URL( URL_LISTE_NOUVELLES );
			InputStream flux = urlListePensees.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			xml = lecteur.next() + derniereBalise;
			xml = new String(xml.getBytes("UTF-8"), "ISO-8859-1");
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(xml);
		
		return nouvelles;
	}
	

}
