package vue;

import com.sun.media.jfxmedia.logging.Logger;
import controleur.ControleurStationSpatiale;
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
		
	}
	
}
