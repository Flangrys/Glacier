package com.flangrys.glacier.commands;

import com.flangrys.glacier.Glacier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HelloWorld implements CommandExecutor, TabExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String param, @NotNull String[] args) {
        if (!(commandSender instanceof Player)) return false;

        final TextComponent embed = Component.text()
                .content("Hello World :)")
                .color(NamedTextColor.GOLD)
                .decorate(TextDecoration.BOLD)
                .decorate(TextDecoration.ITALIC)
                .build();

        commandSender.sendMessage(embed);
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return List.of("");
    }
}
