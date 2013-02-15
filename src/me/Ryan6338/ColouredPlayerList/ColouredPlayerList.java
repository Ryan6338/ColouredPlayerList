package me.Ryan6338.ColouredPlayerList;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ColouredPlayerList extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	public PlayerListener listener;
	private Permissions permissions = new Permissions(this);

	//Performs on Disable
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		logger.info(pdfFile.getName() + " has been disabled!");
	}

	//Performs on Enable if the version is correct
	
	@Override
	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		
		//Registers events in the PlayerListener class
		
		pm.registerEvents(new PlayerListener(this), this);
	}
	
	//Allows Permissions to have an instance of ColouredPlayerList
	
	public Permissions getPermissions() {
		return permissions;
	}
	
	//Logs in the console messages from the plugin
	
	public void Log(String text) {
		logger.info("[ColouredPlayerList] " + text);
	}
}