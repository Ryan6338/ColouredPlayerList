package me.Ryan6338.ColouredPlayerList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PermsLookup {
	public PermsLookup perms;

	public void colour(Player p) {
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
			c = ChatColor.DARK_BLUE;
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
		String pname = p.getDisplayName();
		if(p.getName().length() > 14) {
			pname = p.getDisplayName().substring(0, 13);
		}
		p.setPlayerListName(c + pname);
	}
}
