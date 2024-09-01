package me.micegood.potoki.command;

import me.micegood.potoki.xxx.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test1CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        ChatUtil.sendTitle(player, "&5Привет калбек, как сао?", "&7Будь человеком закинь на дк",10,50,10);
        return true;
    }
}
