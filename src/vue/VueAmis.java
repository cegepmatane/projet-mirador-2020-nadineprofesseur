package vue;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurAmis;

public class VueAmis extends Vue {
	
	protected ControleurAmis controleur;
	
	protected static VueAmis instance = null; 
	public static VueAmis getInstance()  { if(null==instance) instance = new VueAmis(); return VueAmis.instance;}; 
	
	private VueAmis()  {
		super("amis.fxml");
		Logger.logMsg(Logger.INFO, "new VueAmis()");
		super.controleur = this.controleur = new ControleurAmis();
	}
	
}
