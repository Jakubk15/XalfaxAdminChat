package dev.jakubk15.adminchat.command;

import dev.jakubk15.adminchat.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.settings.Lang;

import java.util.concurrent.TimeUnit;

public class AdminChatCommand extends SimpleCommand {

	public AdminChatCommand() {
		super("adminchat|ac");
		setPermission("xalfax.adminchat");
		setMinArguments(1);
		setDescription("Basic adminchat command.");
		setCooldown(1, TimeUnit.SECONDS);
		setUsage("<message>");
	}

	@Override
	protected void onCommand() {
		checkArgs(1, Lang.of("InvalidMessage"));
		final Player p = (Player) sender;
		final String senderName = p.getDisplayName();
		for (final Player adm : Bukkit.getOnlinePlayers()) {
			if (adm.hasPermission("xalfax.adminchat")) {
				adm.sendMessage(Settings.PLUGIN_PREFIX + " " + ChatColor.RED + senderName + ChatColor.GRAY + ": " + ChatColor.WHITE + args[0]);
			}
		}
	}
}
