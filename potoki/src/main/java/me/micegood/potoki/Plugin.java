package me.micegood.potoki;

import me.micegood.potoki.Events.ChatFormanEvents;
import me.micegood.potoki.command.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    public static org.bukkit.plugin.Plugin instance;



    @Override
    public void onEnable() {
        instance = this;

        getCommand("join").setExecutor(new JoinCMD());

        getCommand("firework").setExecutor(new SpawnFireworkCMD());
        getCommand("test").setExecutor(new TestCMD());
        getCommand("test1").setExecutor(new Test1CMD());
        getCommand("test2").setExecutor(new Test2CMD());
        getServer().getPluginManager().registerEvents(new ChatFormanEvents(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
