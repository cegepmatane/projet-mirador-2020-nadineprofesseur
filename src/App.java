

import java.util.List;

import donnee.MeteoreDAO;
import donnee.StationSpatialeDAO;
import modele.StationSpatiale;
import vue.Fenetre;
//import java.util.List;
//import donnee.NouvelleDAO;
//import modele.Nouvelle;
import modele.Meteore;

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
		
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
