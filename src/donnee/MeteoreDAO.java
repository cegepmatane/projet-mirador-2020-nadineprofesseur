package donnee;
import java.io.InputStream;
import java.io.StringBufferInputStream;
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

import modele.Meteore;;
public class MeteoreDAO {
	
	public List<Meteore> listerGrosMeteores()
	{
		String URL_GROS_METEORES = "https://data.nasa.gov/resource/gh4g-9sfh.xml?$where=mass%20%3E%2010000000";
		String derniereBalise = "</response>";
		
		List<Meteore> meteores = new ArrayList<Meteore>();
		
		String xml = "";
		try {
			URL url = new URL( URL_GROS_METEORES );
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
			NodeList noeudsMeteores = document.getElementsByTagName("row");
			
			for(int position = 0; position < noeudsMeteores.getLength(); position++)
			{
				Element noeudMeteore = (Element)noeudsMeteores.item(position);
				String nom = noeudMeteore.getElementsByTagName("name").item(0).getTextContent();
				String id = noeudMeteore.getElementsByTagName("id").item(0).getTextContent();
				String date = noeudMeteore.getElementsByTagName("year").item(0).getTextContent();
				String masse = noeudMeteore.getElementsByTagName("mass").item(0).getTextContent();
				String latitude = noeudMeteore.getElementsByTagName("reclat").item(0).getTextContent();
				String longitude = noeudMeteore.getElementsByTagName("reclong").item(0).getTextContent();
				//System.out.println(nom);
				Meteore meteore = new Meteore();
				meteore.setNom(nom);
				meteore.setDate(date);
				meteore.setMasse(Integer.parseInt(masse));
				meteore.setLatitude(Float.parseFloat(latitude));
				meteore.setLongitude(Float.parseFloat(longitude));
				
				meteores.add(meteore);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		return meteores;
	}

}
