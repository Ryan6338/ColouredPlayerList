package me.Ryan6338.ColouredPlayerList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PermsLookup {
	public PermsLookup perms;
	private ColouredPlayerList plugin;

	public PermsLookup(ColouredPlayerList instance) {
		plugin = instance;
	}

	public void colour(final Player p) {
		plugin.getServer().getScheduler()
				.scheduleSyncDelayedTask(plugin, new Runnable() {
					public void run() {
						ChatColor c;
						c = ChatColor.WHITE;
						if (p.hasPermission("cpl.dark_blue")) {
							c = ChatColor.DARK_BLUE;
						} else if (p.hasPermission("cpl.dark_green")) {
							c = ChatColor.DARK_GREEN;
						} else if (p.hasPermission("cpl.dark_aqua")) {
							c = ChatColor.DARK_AQUA;
						} else if (p.hasPermission("cpl.dark_red")) {
							c = ChatColor.DARK_RED;
						} else if (p.hasPermission("cpl.dark_purple")) {
							c = ChatColor.DARK_PURPLE;
						} else if (p.hasPermission("cpl.gold")) {
							c = ChatColor.GOLD;
						} else if (p.hasPermission("cpl.gray")) {
							c = ChatColor.GRAY;
						} else if (p.hasPermission("cpl.dark_gray")) {
							c = ChatColor.DARK_GRAY;
						} else if (p.hasPermission("cpl.blue")) {
							c = ChatColor.BLUE;
						} else if (p.hasPermission("cpl.green")) {
							c = ChatColor.GREEN;
						} else if (p.hasPermission("cpl.aqua")) {
							c = ChatColor.AQUA;
						} else if (p.hasPermission("cpl.red")) {
							c = ChatColor.RED;
						} else if (p.hasPermission("cpl.purple")) {
							c = ChatColor.LIGHT_PURPLE;
						} else if (p.hasPermission("cpl.yellow")) {
							c = ChatColor.YELLOW;
						} else if (p.hasPermission("cpl.white")) {
							c = ChatColor.WHITE;
						} else {
							c = ChatColor.YELLOW;
						}
						String pname = ChatColor.RESET + p.getDisplayName();
						if (p.getDisplayName().length() > 14) {
							pname = ChatColor.RESET
									+ p.getDisplayName().substring(0, 14);
						}
						p.setPlayerListName(c + pname);
					}
				}, 4L);
	}
}