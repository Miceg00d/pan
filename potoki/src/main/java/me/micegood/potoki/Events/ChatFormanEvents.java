package me.micegood.potoki.Events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChatFormanEvents implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        event.setFormat(ChatColor.translateAlternateColorCodes(
                '&',
                "&6Великий &c&n" + event.getPlayer().getName() + "&r&6 написал - &a&l" + event.getMessage()
        ));
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
      if (event.getPlayer().isOp()) {
          event.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes(
                  '&',
                  "&cБог | &r" + event.getPlayer().getName()));
      }

           else {
               event.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes(
                       '&',
                       "&lИгрок | " + event.getPlayer().getName()));
      }
    }
}
