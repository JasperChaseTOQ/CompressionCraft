package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.implementation.machines.CcCompressor;
import me.jasperchasetoq.compressioncraft.implementation.machines.CcDecompressor;
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

        //Compressed Materials
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_COBBLESTONE_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_STONE_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_FLINT_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_GRAVEL_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_CLAY_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_COAL_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_COAL_BLOCK_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_IRON_NUGGET_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_IRON_INGOT_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_IRON_BLOCk_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_GOLD_NUGGET_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_GOLD_INGOT_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_GOLD_BLOCK_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_REDSTONE_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_REDSTONE_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_LAPIS_LAZULI_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_LAPIS_BLOCK_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_DIAMOND_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_DIAMOND_BLOCK_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_EMERALD_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_EMERALD_BLOCK_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
}
}
