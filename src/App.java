

import donnee.StationSpatialeDAO;
import vue.Fenetre;
//import java.util.List;
//import donnee.NouvelleDAO;
//import modele.Nouvelle;

public class App {

	public static void main(String[] parametres) {
		
		/*NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
		for(Nouvelle nouvelle : nouvelles)
		{
			System.out.println(nouvelle.getTitre());
		}*/
		
		StationSpatialeDAO stationDAO = new StationSpatialeDAO();
		stationDAO.detaillerStationSpatiale();
		
		//Fenetre.launch(Fenetre.class, parametres);	
	}

}
