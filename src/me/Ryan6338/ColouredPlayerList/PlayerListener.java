package me.Ryan6338.ColouredPlayerList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
	public PlayerListener listener;
	private ColouredPlayerList plugin;
	
	public PlayerListener(ColouredPlayerList instance) {
		plugin = instance;
	}
	
	//Performs when a player joins the game
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		final Player p = event.getPlayer();
		
		final ChatColor c = plugin.getPermissions().getColour(p);

		//Delays the task to check for the player display name to give display names time to load
		
		plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
			public void run() {
				String pname = p.getDisplayName();
				
				//Checks to see if the nickname is too long
				
				if (p.getDisplayName().length() > 14) {
					pname = p.getDisplayName().substring(0, 14);
				}
				plugin.Log("Player name: " + pname);
				p.setPlayerListName(c + pname);
			}
		}, 2L);
	}
}