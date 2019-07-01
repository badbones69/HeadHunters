package me.ryder;

import org.bukkit.plugin.java.JavaPlugin;

public final class HeadHunters extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("=== HeadHunters Start ===");
    }

    @Override
    public void onDisable() {
        getLogger().info("=== HeadHunters Stop ===");
    }
}
