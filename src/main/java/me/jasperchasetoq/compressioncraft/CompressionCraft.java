package me.jasperchasetoq.compressioncraft;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.jasperchasetoq.compressioncraft.setup.CompressionCraftItemsSetup;

import java.io.File;

public class CompressionCraft extends AbstractAddon {

    private static CompressionCraft instance;

    public CompressionCraft() {
        super("JasperChaseTOQ", "CompressionCraft", "master", "options.auto-update");
    }
    @Override
    public void enable() {

        instance = this;

        Metrics metrics = new Metrics(this, 15648);

        Config cfg = new Config(this);

        CompressionCraftItemsSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        }

    @Override
    public void disable() {
        instance = null;
    }




        public static CompressionCraft getInstance() {
            return instance;
        }
    public static String getVersion() {
        return instance.getDescription().getVersion();
    }
    }

