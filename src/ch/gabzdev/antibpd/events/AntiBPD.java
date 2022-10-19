package ch.gabzdev.antibpd.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class AntiBPD implements Listener {
	  @EventHandler
	  public void onBlockBreakEvent(BlockBreakEvent event) {
	    if (!event.getPlayer().hasPermission("break.bypass")) {
	      event.setCancelled(true);
	      Player player = event.getPlayer();
	      player.sendMessage(ChatColor.RED + "[!] " + ChatColor.WHITE + "Vous ne pouvez pas casser ce bloc.");
	    } 
	  }
	  
	  @EventHandler
	  public void onBlockPlaceEvent(BlockPlaceEvent event) {
	    if (!event.getPlayer().hasPermission("place.bypass")) {
	      event.setCancelled(true);
	      Player player = event.getPlayer();
	      player.sendMessage(ChatColor.RED + "[!] " + ChatColor.WHITE + "Vous ne pouvez pas placer de bloc.");
	    } 
	  }
	  
	  @EventHandler
	  public void PlayerDropItemEvent(PlayerDropItemEvent event) {
	    if (!event.getPlayer().hasPermission("drop.bypass")) {
	      event.setCancelled(true);
	      Player player = event.getPlayer();
	      player.sendMessage(ChatColor.RED + "[!] " + ChatColor.WHITE + "Vous ne pouvez pas drop des items.");
	    } 
	  }
	  
	  
}
