package controleur;

import java.util.List;

import donnee.ExoplaneteDAO;
import donnee.MeteoreDAO;
import donnee.NouvelleDAO;
import donnee.StationSpatialeDAO;
import vue.*;
import modele.Exoplanete;
import modele.Meteore;
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
		/*
		StationSpatialeDAO stationDAO = new StationSpatialeDAO();
		StationSpatiale station = stationDAO.detaillerStationSpatiale();
		VueStationSpatiale.getInstance().afficherStationSpatiale(station);
		return VueStationSpatiale.getInstance();
		*/
		/*MeteoreDAO meteoreDAO = new MeteoreDAO();
		List<Meteore> meteores = meteoreDAO.listerGrosMeteores();
		VueMeteores.getInstance().afficherGrosMeteores(meteores);
		return VueMeteores.getInstance();*/
		
		ExoplaneteDAO exoplanetesDAO = new ExoplaneteDAO();
		List<Exoplanete> exoplanetes = exoplanetesDAO.listerExplanete();
		VueExoplanetes.getInstance().afficherExoplanetes(exoplanetes);
		
		
		float moyenne = 0;
		float minimum = exoplanetes.get(0).getEccentricite();
		float maximum = exoplanetes.get(0).getEccentricite();
		float nombre = 0;
		for(Exoplanete exoplanete:exoplanetes)
		{
			System.out.println("On a recupere " + exoplanete.getNom());
			moyenne += exoplanete.getEccentricite();
			if(exoplanete.getEccentricite() > maximum) maximum = exoplanete.getEccentricite();
			if(exoplanete.getEccentricite() < minimum) minimum = exoplanete.getEccentricite();
			nombre++;
		}
		moyenne = moyenne / nombre;
		VueExoplanetes.getInstance().afficherMoyenne(moyenne);
		VueExoplanetes.getInstance().afficherMaximum(maximum);
		VueExoplanetes.getInstance().afficherMinimum(minimum);
		
		return VueExoplanetes.getInstance();
		//return VueMirador.getInstance();
	}
		
}
