package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurExoplanetes;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import modele.Exoplanete;

public class VueExoplanetes extends Vue {
	
	protected ControleurExoplanetes controleur;
	protected static VueExoplanetes instance = null; 
	public static VueExoplanetes getInstance() {if(null==instance)instance = new VueExoplanetes();return VueExoplanetes.instance;}; 
	
	private VueExoplanetes()  {
		super("exoplanetes.fxml");
		Logger.logMsg(Logger.INFO, "new VueExoplanetes()");
		super.controleur = this.controleur = new ControleurExoplanetes();
	}
	
	public void afficherExoplanetes(List<Exoplanete> exoplanetes)
	{
		System.out.println("VueExoplanete.afficherExoplanetes()");
		
		VBox vueExoplanetes = (VBox)lookup("#liste-exoplanetes");
		
		for(Exoplanete exoplanete:exoplanetes)
		{
			System.out.println("On affiche " + exoplanete.getNom());
			Label descriptionExoplanete = new Label(exoplanete.getNom());
			vueExoplanetes.getChildren().add(descriptionExoplanete);
		}

	}
	
	public void afficherMoyenne(float moyenne)
	{
		Label vueMoyenne = (Label)lookup("#valeur-moyenne");
		vueMoyenne.setText(moyenne + "");
	}
	public void afficherMinimum(float minimum)
	{
		Label vueMinimum = (Label)lookup("#valeur-minimum");
		vueMinimum.setText(minimum + "");
	}
	public void afficherMaximum(float maximum)
	{
		Label vueMaximum = (Label)lookup("#valeur-maximum");
		vueMaximum.setText(maximum + "");
	}
}
