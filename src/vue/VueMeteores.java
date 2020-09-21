package vue;

import java.util.List;
import modele.Meteore;

import com.sun.media.jfxmedia.logging.Logger;
import controleur.ControleurMeteores;
import javafx.scene.layout.VBox;

public class VueMeteores extends Vue {
	
	protected ControleurMeteores controleur = null;
	protected static VueMeteores instance = null; 
	public static VueMeteores getInstance() {if(null==instance)instance = new VueMeteores();return VueMeteores.instance;}; 
	
	private VueMeteores()  {
		super("meteores.fxml");
		Logger.logMsg(Logger.INFO, "new VueMeteores()");
		super.controleur = this.controleur = new ControleurMeteores();
	}
	
	public void afficherGrosMeteores(List<Meteore> meteores)
	{
		System.out.println("VueMeteores.afficherGrosMeteores()");
		VBox vueListe = (VBox)lookup("#liste-gros-meteores");
		vueListe.getChildren().clear();
		for(Meteore meteore:meteores)
		{
			System.out.println(meteore.getNom());
		}
	}
	
}
