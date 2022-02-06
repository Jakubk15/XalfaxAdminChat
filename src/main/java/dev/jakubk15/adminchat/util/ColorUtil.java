package dev.jakubk15.adminchat.util;

import org.bukkit.ChatColor;

import javax.annotation.Nullable;

public class ColorUtil {

	public static String color(@Nullable final String text) {
		return ChatColor.translateAlternateColorCodes('&', text);
	}
}
