package controleur;

import java.util.List;

import donnee.NouvelleDAO;
import donnee.StationSpatialeDAO;
import vue.*;
import modele.Nouvelle;
import modele.StationSpatiale;

public class Controleur {

	public enum ActionNavigation { RETOUR };

	// le controleur decide de l'action selon evenement
	public void notifierEvenement(ActionNavigation action)
	{
		switch(action)
		{
			case RETOUR:
				Navigateur.getInstance().afficherVue(VueMirador.getInstance());
			break;
		}		
	}

	public static Vue selectionnerVuePrincipale() {
		/*NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
		VueNouvelles.getInstance().afficherListeNouvelles(nouvelles);
		return VueNouvelles.getInstance();
		*/
		
		StationSpatialeDAO stationDAO = new StationSpatialeDAO();
		StationSpatiale station = stationDAO.detaillerStationSpatiale();
		VueStationSpatiale.getInstance().afficherStationSpatiale(station);
		return VueStationSpatiale.getInstance();
		//return VueMirador.getInstance();
	}
		
}
