package dev.jakubk15.adminchat;

import dev.jakubk15.adminchat.command.AdminChatCommand;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class AdminChat extends SimplePlugin {


	@Override
	protected void onPluginStart() {
		registerCommand(new AdminChatCommand());
		Common.setLogPrefix("[AdminChat]");
	}


	public static AdminChat getInstance() {
		return (AdminChat) SimplePlugin.getInstance();
	}
}
