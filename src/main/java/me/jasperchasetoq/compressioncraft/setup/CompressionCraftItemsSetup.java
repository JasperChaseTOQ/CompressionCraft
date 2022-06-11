package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.implementation.machines.CcCompressor;
import me.jasperchasetoq.compressioncraft.implementation.machines.CcDecompressor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItemsSetup {
    private CompressionCraftItemsSetup() {}

    public static void setup(@Nonnull CompressionCraft plugin) {


        //machines
        new CcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                    SlimefunItems.CARBONADO, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.CARBONADO,
                    SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_PRESS, SlimefunItems.ELECTRIC_MOTOR,
                    SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
            }).register(plugin);

        new CcDecompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_DECOMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_COBBLESTONE_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                       null, null, null, null, null, null,
                        null, null, null,
                }).register(plugin);
}
}
