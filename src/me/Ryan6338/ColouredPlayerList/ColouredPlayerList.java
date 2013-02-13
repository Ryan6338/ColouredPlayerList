package me.Ryan6338.ColouredPlayerList;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ColouredPlayerList extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static ColouredPlayerList plugin;
	public PermsLookup perms = null;
	public PlayerListener listener;

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been disabled!");
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger
				.info(pdfFile.getName() + " Version " + " has been enabled!");
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PlayerListener(), this);
	}
}