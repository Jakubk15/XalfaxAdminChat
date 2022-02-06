package dev.jakubk15.adminchat.command;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.concurrent.TimeUnit;

public class AdminChatCommand extends SimpleCommand {

	public AdminChatCommand() {
		super("adminchat|ac|modchat|staffchat|sc");
		setPermission("xalfax.adminchat");
		setMinArguments(1);
		setDescription("Basic adminchat command.");
		setCooldown(1, TimeUnit.SECONDS);
		setUsage("<message>");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		checkArgs(1, "&cPodaj wiadomość!");
		final Player p = getPlayer();
		final String senderName = p.getDisplayName();
		for (final Player adm : Bukkit.getOnlinePlayers()) {
			if (adm.hasPermission("xalfax.adminchat")) {
				Common.tell(adm, "&3┃ &9&lADMINCHAT &3┃ &6" + senderName + " &8» &3" + args[0]);
			}
		}
	}
}
