

import java.util.List;

import donnee.ExoplaneteDAO;
import modele.Exoplanete;
import vue.Fenetre;
//import donnee.StationSpatialeDAO;
//import modele.StationSpatiale;
//import java.util.List;
//import donnee.NouvelleDAO;
//import modele.Nouvelle;
//import donnee.MeteoreDAO;
//import modele.Meteore;

public class App {

	public static void main(String[] parametres) {
		
		/*NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
		for(Nouvelle nouvelle : nouvelles)
		{
			System.out.println(nouvelle.getTitre());
		}*/
		
		/*StationSpatialeDAO stationDAO = new StationSpatialeDAO();
		StationSpatiale station = stationDAO.detaillerStationSpatiale();
		System.out.println(station.getLatitude() + " " + station.getLongitude());
		*/
		
		/*MeteoreDAO meteoreDAO = new MeteoreDAO();
		List<Meteore> meteores = meteoreDAO.listerGrosMeteores();
		for(Meteore meteore: meteores)
		{
			System.out.println(meteore.getNom() + " " + meteore.getDate());
		}*/
		
		ExoplaneteDAO exoplanetesDAO = new ExoplaneteDAO();
		List<Exoplanete> exoplanetes = exoplanetesDAO.listerExplanete();
		for(Exoplanete exoplanete:exoplanetes)
		{
			System.out.println("On a recupere " + exoplanete.getNom());
		}
		
		//Fenetre.launch(Fenetre.class, parametres);	
	}

}
