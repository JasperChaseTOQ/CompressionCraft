package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import me.jasperchasetoq.compressioncraft.setup.CompressionCraftItemsSetup;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;

public class CompressionCraft extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        CompressionCraftItemsSetup.setup(this);
    }
    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static CompressionCraft instance;

  public CompressionCraft() {
            instance = this;
        }

        public static CompressionCraft getInstance() {
            return instance;
        }
    }

