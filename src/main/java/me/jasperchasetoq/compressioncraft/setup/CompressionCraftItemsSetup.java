package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.implementation.machines.compressors.*;
import me.jasperchasetoq.compressioncraft.implementation.machines.decompressors.*;
import me.jasperchasetoq.compressioncraft.implementation.machines.misc.LoreRefresher;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItemsSetup {
    private CompressionCraftItemsSetup() {}

    public static void setup(@Nonnull CompressionCraft plugin) {


        //machines
        //compressors
        new BasicCcCompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                    SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                    SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_PRESS, SlimefunItems.ELECTRIC_MOTOR,
                    SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
            }).register(plugin);
        new AverageCcCompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).register(plugin);
        new MediumCcCompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.BIG_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).register(plugin);
        new GoodCcCompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_COMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).register(plugin);
        new AdvancedCcCompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_COMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).register(plugin);
        new EndgameCcCompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_COMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).register(plugin);


        //machines decompressors
        new BasicCcDecompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_DECOMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                }).register(plugin);
        new AverageCcDecompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_DECOMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_DECOMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).register(plugin);
        new MediumCcDecompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_DECOMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.BIG_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_DECOMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).register(plugin);
        new GoodCcDecompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_DECOMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_DECOMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).register(plugin);
        new AdvancedCcDecompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_DECOMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_DECOMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).register(plugin);
        new EndgameCcDecompressor(CompressionCraftItems.CC_ITEM_COMPRESSION, CompressionCraftItems.CC_DECOMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.CC_DECOMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).register(plugin);
        //Machines Misc
        new LoreRefresher(CompressionCraftItems.CC_MACHINES, CompressionCraftItems.CC_LORE_REFRESHER, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        CompressionCraftItems.CC_COBBLESTONE_1, CompressionCraftItems.CC_COBBLESTONE_1, CompressionCraftItems.CC_COBBLESTONE_1,
                        CompressionCraftItems.CC_COBBLESTONE_1, new ItemStack(Material.LECTERN), CompressionCraftItems.CC_COBBLESTONE_1,
                        CompressionCraftItems.CC_COBBLESTONE_1, CompressionCraftItems.CC_COBBLESTONE_1, CompressionCraftItems.CC_COBBLESTONE_1,
                }).register(plugin);
        //Compressed Materials
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLESTONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLESTONE_2, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLESTONE_3, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLESTONE_4, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLESTONE_5, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLESTONE_6, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_STONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_ANDESITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_DIORITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_GRANITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COBBLED_DEEPSLATE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_DEEPSLATE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_FLINT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_GRAVEL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_DIRT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_CLAY_BALL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_CLAY_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COAL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_COAL_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_IRON_NUGGET_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_IRON_INGOT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_IRON_BLOCk_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_GOLD_NUGGET_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_GOLD_INGOT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_GOLD_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_REDSTONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_REDSTONE_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_LAPIS_LAZULI_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_LAPIS_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_DIAMOND_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_DIAMOND_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_EMERALD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_EMERALD_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_AMETHYST_SHARD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_AMETHYST_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_SMALL_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_MEDIUM_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_LARGE_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_COMPRESSED_ITEMS, CompressionCraftItems.CC_AMETHYST_CLUSTER_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        //addon info
        new SlimefunItem(CompressionCraftItems.CC_INFO, CompressionCraftItems.CC_MC_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_INFO, CompressionCraftItems.CC_JAVA_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_INFO, CompressionCraftItems.CC_SF_BUILD, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_INFO, CompressionCraftItems.CC_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);

}
}
