package controleur;

import vue.*;

public class Controleur {

	public enum ActionNavigation { RETOUR, CALCULATRICE, CALCULATRICE_HYPOTHEQUE, CALCULATRICE_BINAIRE, CALCULATRICE_RESEAU, 
		CALCULATRICE_ECOLOGIE, CALCULATRICE_RECETTE};

	// le controleur decide de l'action selon evenement
	public void notifierEvenement(ActionNavigation action)
	{
		switch(action)
		{
			case RETOUR:
				Navigateur.getInstance().afficherVue(VueMirador.getInstance());
			break;
			case CALCULATRICE:
				Navigateur.getInstance().afficherVue(VueMessages.getInstance());
			break;
			case CALCULATRICE_HYPOTHEQUE:
				Navigateur.getInstance().afficherVue(VueNouvelles.getInstance());
			break;
			case CALCULATRICE_BINAIRE:
				Navigateur.getInstance().afficherVue(VueAmis.getInstance());				
			break;
			case CALCULATRICE_RESEAU:
				Navigateur.getInstance().afficherVue(VueCommentaires.getInstance());
			break;
			case CALCULATRICE_ECOLOGIE:
				Navigateur.getInstance().afficherVue(VueNumerique.getInstance());
			break;
			case CALCULATRICE_RECETTE:
				Navigateur.getInstance().afficherVue(VueMonnaies.getInstance());
			break;
		}		
	}

	public static Vue selectionnerVuePrincipale() {
		return VueMirador.getInstance();
	}
		
}
