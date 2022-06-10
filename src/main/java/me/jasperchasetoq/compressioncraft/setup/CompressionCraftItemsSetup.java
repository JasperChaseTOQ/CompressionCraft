package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItemsSetup {
    private CompressionCraftItemsSetup() {}

    public static void setup(@Nonnull CompressionCraft plugin) {
        new SlimefunItem(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                    new ItemStack(Material.IRON_INGOT), SlimefunItems.IRON_DUST, SlimefunItems.ZINC_DUST,
                    null, null, null,
                    null, null, null,
            }).register(plugin);
}
}
