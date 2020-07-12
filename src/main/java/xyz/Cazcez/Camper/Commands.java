package xyz.Cazcez.Camper;

import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardReader;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Commands implements CommandExecutor 
{
	
	private Main main;
	
	Commands(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		File file = new File(main.getDataFolder()+ File.separator+"test.schematic");
		ClipboardFormat format = ClipboardFormats.findByFile(file);
		try {
			try (ClipboardReader reader = format.getReader(new FileInputStream(file))) {
				Clipboard clipboard = reader.read();
			}
		} catch (IOException ignored) {
			sender.sendMessage("Error");
			//e.printStackTrace();
		}

		return true;
	}
}