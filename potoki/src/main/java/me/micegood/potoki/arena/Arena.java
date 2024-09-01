package me.micegood.potoki.arena;

import me.micegood.potoki.Plugin;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    public static final Arena instance = new Arena();

    public List<Player> playersOnArena = new ArrayList<>();

    public void join(Player player){
        playersOnArena.add(player);
        player.sendMessage("Вы присоединились к арене");

        if (playersOnArena.size() >= 2){
            startGame();
        }
    }

    public void startGame(){

        new BukkitRunnable(){
            int counter = 10;
            public void run(){
                for (Player player: playersOnArena){
                    player.sendTitle("До начала игры осталось " + counter + " секунд", "Приготовься", 10,10,10);
                }

                counter -= 1;

                if (counter == 0){
                    cancel();
                }
            }

        }.runTaskTimer(Plugin.instance, 0L,20L);
    }
}
