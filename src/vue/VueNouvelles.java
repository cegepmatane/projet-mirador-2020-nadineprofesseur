package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurNouvelles;
import javafx.scene.layout.Pane;
import modele.Nouvelle;

public class VueNouvelles extends Vue {

	protected ControleurNouvelles controleur = null;
	protected static VueNouvelles instance = null; 
	public static VueNouvelles getInstance() {if(null==instance)instance = new VueNouvelles();return VueNouvelles.instance;}; 

	private VueNouvelles() {
		super("nouvelles.fxml");
		Logger.logMsg(Logger.INFO, "new VueNouvelles()");
		super.controleur = this.controleur = new ControleurNouvelles();
	}

	public void afficherListeNouvelles(List<Nouvelle> nouvelles)
	{
		System.out.println("VueNouvelle.afficherListeNouvelles()");
		
		Nouvelle nouvelle;
		if(nouvelles.size() > 1) 
		{
			nouvelle = nouvelles.get(0);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
		}
		
		Pane panneauNouvelle1 = (Pane)lookup("#nouvelle-1");
		panneauNouvelle1.getChildren().clear();
		
		
		
	}
	

}
