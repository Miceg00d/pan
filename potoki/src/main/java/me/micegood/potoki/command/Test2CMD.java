package me.micegood.potoki.command;

import me.micegood.potoki.xxx.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test2CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        ChatUtil.broadcastMessage("Приветики братья");
        ChatUtil.broadcastTitle("Не меняй друзей на бабки", "Короче да братья");
        return true;
    }
}
