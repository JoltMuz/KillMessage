package io.github.JoltMuz.KillMessage;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class kill implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onKill(PlayerDeathEvent e)
	{
		Bukkit.broadcastMessage("Kill Debug -> Death is working");
		if (killmessage.enabled)
		{
			if (e.getEntity() != null && e.getEntity().getKiller() != null)
			{
				String killed = e.getEntity().getName();
				String killer = e.getEntity().getKiller().getName();
				Bukkit.broadcastMessage((ChatColor.DARK_RED + killed + " " + ChatColor.RED + killmessage.setMessages.get(new Random().nextInt(0,killmessage.setMessages.size()))+ ChatColor.DARK_RED + killer));
			}
		}
	}

}
