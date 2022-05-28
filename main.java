package io.github.JoltMuz.KillMessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin
{
	 @Override
	    public void onEnable()
	    {
	        this.getCommand("killmessage").setExecutor(new killmessage());
	        getServer().getPluginManager().registerEvents(new kill(), this);
	       
	    }
	    public void onDisable()
	    {

	    }

}
