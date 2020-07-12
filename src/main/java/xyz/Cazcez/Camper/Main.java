package xyz.Cazcez.Camper;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        createConfig();
        Metrics metrics = new Metrics(this , 8170);
        getCommand("Camper").setExecutor(new Commands(this));
        getServer().getPluginManager().registerEvents(new EventListener(this),this);
    }

    private void createConfig() {
        saveDefaultConfig();
    }
}