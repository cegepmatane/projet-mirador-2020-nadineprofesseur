package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;
import controleur.ControleurStationSpatiale;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import modele.StationSpatiale;

public class VueStationSpatiale extends Vue {
	
	protected ControleurStationSpatiale controleur = null;
	protected static VueStationSpatiale instance = null; 
	public static VueStationSpatiale getInstance() {if(null==instance)instance = new VueStationSpatiale();return VueStationSpatiale.instance;}; 
	
	private VueStationSpatiale()  {
		super("stationspatiale.fxml");
		Logger.logMsg(Logger.INFO, "new VueStationSpatiale()");
		super.controleur = this.controleur = new ControleurStationSpatiale();
	}
	
	public void afficherStationSpatiale(StationSpatiale station)
	{
		System.out.println("VueStationSpatiale.afficherStationSpatiale()");
		System.out.println(station.getAstronautes().get(0));
		
		VBox vueListeAstronautes = (VBox)lookup("#liste-astronautes");
		List<String> astronautes = station.getAstronautes();
		for(String astronaute : astronautes)
		{
			vueListeAstronautes.getChildren().add(new Label(astronaute));			
		}
		
		VBox vueListePassages = (VBox)lookup("#liste-passages");
		List<String> passages = station.getPassages();
		for(String passage: passages)
		{
			vueListePassages.getChildren().add(new Label(passage));
		}
		
		Label vueLatitude = (Label)lookup("#latitude");
		vueLatitude.setText("Latitude\n" + station.getLatitude());
		Label vueLongitude = (Label)lookup("#longitude");
		vueLongitude.setText("Longitude\n" + station.getLongitude());
	}
	
}
