package xyz.Cazcez.Camper;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor 
{
	
	private Main main;
	
	Commands(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("Camper"))
		{
			sender.sendMessage(ChatColor.DARK_PURPLE + "TreeTwerk: " + ChatColor.DARK_RED + "There's nothing for now");
	
		}	
		return false;
	}
}