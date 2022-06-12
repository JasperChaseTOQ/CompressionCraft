package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.implementation.machines.CcDecompressor;
import me.jasperchasetoq.compressioncraft.implementation.machines.CcElectricSfCompressor;
import me.jasperchasetoq.compressioncraft.implementation.machines.compressors.CcGemCompressor;
import me.jasperchasetoq.compressioncraft.implementation.machines.compressors.main.*;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItemsSetup {
    private CompressionCraftItemsSetup() {}

    public static void setup(@Nonnull CompressionCraft plugin) {


        //machines
        new BasicCcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                    SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                    SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_PRESS, SlimefunItems.ELECTRIC_MOTOR,
                    SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
            }).register(plugin);
        new AverageCcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).register(plugin);
        new MediumCcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).register(plugin);
        new GoodCcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.BIG_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).register(plugin);
        new AdvancedCcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).register(plugin);
        new EndgameCcCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_COMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).register(plugin);
        new CcGemCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_GEM_COMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_6, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).register(plugin);

        //machines decompressor
        new CcDecompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_DECOMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).register(plugin);
        new CcElectricSfCompressor(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_ELECTRIC_SF_COMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        null , SlimefunItems.CARBONADO_EDGED_CAPACITOR, null,
                        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_PRESS, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_PRESS, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_PRESS,
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
        new SlimefunItem(CompressionCraftItems.CC_MATERIALS, CompressionCraftItems.CC_REDSTONE_BLOCK_1, RecipeType.ENHANCED_CRAFTING_TABLE,
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
