package me.micegood.potoki.xxx;

import me.micegood.potoki.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtil {

    public static String prefix = "&b[Вечерок] >>> ";

    public static void sendMessage(Player player, String msg){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + msg));
    }

    public static void sendTitle(Player player, String msg, String subMsg, int fadeIn, int stay, int fadeOut){
        player.sendTitle(
                ChatColor.translateAlternateColorCodes('&', msg),
                ChatColor.translateAlternateColorCodes('&', subMsg),
                fadeIn,
                stay,
                fadeOut
                );
    }
    public static void sendTitle(Player player, String msg, String subMsg){
    player.sendTitle(
            ChatColor.translateAlternateColorCodes('&', msg),
            ChatColor.translateAlternateColorCodes('&', subMsg),
    10,
    20,
    10
    );

    }
    public static void broadcastMessage(String message){
        for(Player player: Plugin.instance.getServer().getOnlinePlayers()){
            sendMessage(player, message);
        }
    }

    public static void broadcastTitle(String msg, String subMsg, int fadeIn, int stay, int fadeOut){
        for (Player player: Plugin.instance.getServer().getOnlinePlayers()){
            sendTitle(player, msg, subMsg, fadeIn, stay, fadeOut);
        }

    }

    public static void broadcastTitle(String msg, String subMsg){
        for (Player player: Plugin.instance.getServer().getOnlinePlayers()){
            sendTitle(player, msg, subMsg);
        }

    }
}
