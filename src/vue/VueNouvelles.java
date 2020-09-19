package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurNouvelles;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
		if(nouvelles.size() >= 1) 
		{
			nouvelle = nouvelles.get(0);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
			Pane panneauNouvelle = (Pane)lookup("#nouvelle-1");
			panneauNouvelle.getChildren().clear();
			VBox etagere = new VBox();
			panneauNouvelle.getChildren().add(etagere);
			
			
			Label titreNouvelle = new Label(nouvelle.getTitre());
			titreNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(titreNouvelle);
			Label dateNouvelle = new Label(nouvelle.getDate());
			dateNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(dateNouvelle);
		}
		
		if(nouvelles.size() >= 2) 
		{
			nouvelle = nouvelles.get(1);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
			Pane panneauNouvelle = (Pane)lookup("#nouvelle-2");
			panneauNouvelle.getChildren().clear();
			VBox etagere = new VBox();
			panneauNouvelle.getChildren().add(etagere);
			
			Label titreNouvelle = new Label(nouvelle.getTitre());
			titreNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(titreNouvelle);
			Label dateNouvelle = new Label(nouvelle.getDate());
			dateNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(dateNouvelle);
		}
		
		
		if(nouvelles.size() >= 3) 
		{
			nouvelle = nouvelles.get(2);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
			Pane panneauNouvelle = (Pane)lookup("#nouvelle-3");
			panneauNouvelle.getChildren().clear();
			VBox etagere = new VBox();
			panneauNouvelle.getChildren().add(etagere);
			
			Label titreNouvelle = new Label(nouvelle.getTitre());
			titreNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(titreNouvelle);
			Label dateNouvelle = new Label(nouvelle.getDate());
			dateNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(dateNouvelle);
		}
		
		if(nouvelles.size() >= 4) 
		{
			nouvelle = nouvelles.get(3);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
			Pane panneauNouvelle = (Pane)lookup("#nouvelle-4");
			panneauNouvelle.getChildren().clear();
			VBox etagere = new VBox();
			panneauNouvelle.getChildren().add(etagere);
			
			Label titreNouvelle = new Label(nouvelle.getTitre());
			titreNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(titreNouvelle);
			Label dateNouvelle = new Label(nouvelle.getDate());
			dateNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(dateNouvelle);
		}
		
		if(nouvelles.size() >= 5) 
		{
			nouvelle = nouvelles.get(4);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
			Pane panneauNouvelle = (Pane)lookup("#nouvelle-5");
			panneauNouvelle.getChildren().clear();
			VBox etagere = new VBox();
			panneauNouvelle.getChildren().add(etagere);
			
			Label titreNouvelle = new Label(nouvelle.getTitre());
			titreNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(titreNouvelle);
			Label dateNouvelle = new Label(nouvelle.getDate());
			dateNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(dateNouvelle);
		}
		
		if(nouvelles.size() >= 6) 
		{
			nouvelle = nouvelles.get(5);
			System.out.println(nouvelle.getTitre() + " " + nouvelle.getLien());
			Pane panneauNouvelle = (Pane)lookup("#nouvelle-6");
			panneauNouvelle.getChildren().clear();
			VBox etagere = new VBox();
			panneauNouvelle.getChildren().add(etagere);
			
			Label titreNouvelle = new Label(nouvelle.getTitre());
			titreNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(titreNouvelle);
			Label dateNouvelle = new Label(nouvelle.getDate());
			dateNouvelle.setStyle("-fx-text-fill:white");
			etagere.getChildren().add(dateNouvelle);
		}
	}
	

}
