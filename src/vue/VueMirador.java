package vue;
import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurMirador;
public class VueMirador extends Vue {

	protected ControleurMirador controleur;
	protected static VueMirador instance = null; 
	public static VueMirador getInstance() {if(null==instance)instance = new VueMirador();return VueMirador.instance;}; 
	
	private VueMirador() 
	{
		super("mirador.fxml");
		super.controleur = this.controleur = new ControleurMirador();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		/*
		Button actionCalculatrice = (Button) lookup("#action-calculatrice");
		actionCalculatrice.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Calculatrice activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE);
            }
        });
		Button actionHypotheque = (Button) lookup("#action-hypotheque");
		actionHypotheque.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Hypotheque activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE_HYPOTHEQUE);
            }
        });
		Button actionBinaire = (Button) lookup("#action-binaire");
		actionBinaire.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Binaire activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE_BINAIRE);
            }
        });
		Button actionReseau = (Button) lookup("#action-reseautique");
		actionReseau.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Reseau activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE_RESEAU);
            }
        });
		Button actionEcologie = (Button) lookup("#action-ecologie");
		actionEcologie.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Ecologie activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE_ECOLOGIE);
            }
        });
		Button actionRecette = (Button) lookup("#action-recette");
		actionRecette.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Recette activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE_RECETTE);
            }
        });
        */

	}
}
