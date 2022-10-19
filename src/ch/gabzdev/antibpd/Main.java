package ch.gabzdev.antibpd;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import ch.gabzdev.antibpd.events.AntiBPD;

public final class Main extends JavaPlugin implements Listener {
  public void onEnable() {
	Bukkit.getPluginManager().registerEvents(new AntiBPD(), this);
	getServer().getConsoleSender().sendMessage("§b=========================");
	getServer().getConsoleSender().sendMessage("§b==>>     §e§kAntiBPD§r§b     <<==");
	getServer().getConsoleSender().sendMessage("§b==>>      §e§k1.2.0§r§b      <<==");
	getServer().getConsoleSender().sendMessage("§b==>>     §e§kGabzDEV§r§b     <<==");
	getServer().getConsoleSender().sendMessage("§b=========================");
  }
	
  public void onDisable() {}
	/**
	 * Gabzdev.
	 * https://github.com/GabziDev
	 */
}
