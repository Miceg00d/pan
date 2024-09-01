package me.micegood.potoki.command;

import me.micegood.potoki.Plugin;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class SpawnFireworkCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        new BukkitRunnable() {

            @Override
            public void run() {

                Firework firework = player.launchProjectile(Firework.class);

                FireworkMeta fireworkMeta = firework.getFireworkMeta();
                fireworkMeta.addEffect(FireworkEffect.builder().withColor(Color.AQUA).build());

                firework.setFireworkMeta(fireworkMeta);
            }
        }.runTaskLater(Plugin.instance, 100L);

         Firework firework = player.launchProjectile(Firework.class);

        return true;

    }
}
