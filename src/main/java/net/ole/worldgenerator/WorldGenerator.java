package net.ole.worldgenerator;

import net.ole.worldgenerator.generator.FunMapGenerator;
import org.bukkit.Bukkit;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldGenerator extends JavaPlugin {

    private WorldGenerator instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§aCustom Map Generator loaded");
        Bukkit.getConsoleSender().sendMessage(" §7developed by §aJavaInterface");
        Bukkit.getConsoleSender().sendMessage("  ");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new FunMapGenerator();
    }
}
