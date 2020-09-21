package donnee;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import modele.Nouvelle;

public class NouvelleDAO {
	
	public List<Nouvelle> listerNouvelles()
	{
		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		
		String URL_LISTE_NOUVELLES = "https://www.space.com/feeds/all";
		String derniereBalise = "</rss>";

		String xml = "";
		try {
			URL url = new URL( URL_LISTE_NOUVELLES );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			xml = lecteur.next() + derniereBalise;
			xml = new String(xml.getBytes("UTF-8"), "ISO-8859-1");
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(xml);
		
		try {
			DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = parseur.parse(new StringBufferInputStream(xml));
			
			NodeList noeudsItems = document.getElementsByTagName("item");
			
			for(int position = 0; position < noeudsItems.getLength(); position++)
			{
				Element item = (Element)noeudsItems.item(position);
				System.out.println(item);
				String lien = item.getElementsByTagName("link").item(0).getTextContent();
				String titre = item.getElementsByTagName("title").item(0).getTextContent();
				String description = item.getElementsByTagName("description").item(0).getTextContent();
				String date = item.getElementsByTagName("pubDate").item(0).getTextContent();
				//System.out.println(titre);
				
				Nouvelle nouvelle = new Nouvelle(lien, titre, description, date);
				//System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
				nouvelles.add(nouvelle);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return nouvelles;
	}
	

}
