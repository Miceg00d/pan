package me.micegood.potoki.command;

import me.micegood.potoki.xxx.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        ChatUtil.sendMessage(player, "&5Райман, правило 1 что говорит майс - закон!");
        return true;
    }
}
