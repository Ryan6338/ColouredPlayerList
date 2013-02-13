package me.Ryan6338.ColouredPlayerList;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
	public PlayerListener listener;
	PermsLookup perms = new PermsLookup();

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		perms.colour(event.getPlayer());
	}
}