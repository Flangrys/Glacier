package com.flangrys.glacier;

import com.flangrys.glacier.commands.HelloWorld;
import org.bukkit.plugin.java.JavaPlugin;

public final class Glacier extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("hwrld").setExecutor(new HelloWorld());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
