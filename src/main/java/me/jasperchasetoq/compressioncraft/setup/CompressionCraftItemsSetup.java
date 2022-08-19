package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftRecipeTypes;
import me.jasperchasetoq.compressioncraft.implementation.items.machines.CcItemCompressor;
import me.jasperchasetoq.compressioncraft.implementation.items.machines.CcItemDecompressor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItemsSetup {
    private CompressionCraftItemsSetup() {}

    public static void setup(@Nonnull CompressionCraft plugin) {
    
        //Machines
        //Compressors

        new CcItemCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.PISTON), SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                }).setCapacity(250)
                .setEnergyConsumption(25)
                .setProcessingSpeed(1)
                .register(plugin);
        new CcItemCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).setCapacity(500)
                .setEnergyConsumption(50)
                .setProcessingSpeed(2)
                .register(plugin);
        new CcItemCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.BIG_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).setCapacity(750)
                .setEnergyConsumption(75)
                .setProcessingSpeed(3)
                .register(plugin);
        new CcItemCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).setCapacity(1000)
                .setEnergyConsumption(100)
                .setProcessingSpeed(4)
                .register(plugin);
        new CcItemCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).setCapacity(1250)
                .setEnergyConsumption(125)
                .setProcessingSpeed(5)
                .register(plugin);
        new CcItemCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).setCapacity(1500)
                .setEnergyConsumption(150)
                .setProcessingSpeed(6)
                .register(plugin);
        //Decompressors
        new CcItemDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.PISTON), SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                }).setCapacity(250)
                .setEnergyConsumption(25)
                .setProcessingSpeed(1)
                .register(plugin);
        new CcItemDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).setCapacity(500)
                .setEnergyConsumption(50)
                .setProcessingSpeed(2)
                .register(plugin);
        new CcItemDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.BIG_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).setCapacity(750)
                .setEnergyConsumption(75)
                .setProcessingSpeed(3)
                .register(plugin);
        new CcItemDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).setCapacity(1000)
                .setEnergyConsumption(100)
                .setProcessingSpeed(4)
                .register(plugin);
        new CcItemDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).setCapacity(1250)
                .setEnergyConsumption(125)
                .setProcessingSpeed(5)
                .register(plugin);
        new CcItemDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).setCapacity(1500)
                .setEnergyConsumption(150)
                .setProcessingSpeed(6)
                .register(plugin);
        //Compressed Items
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CHARCOAL_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CHARCOAL_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CHARCOAL_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CHARCOAL_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CHARCOAL_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CHARCOAL_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_1, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_2, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_3, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_4, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_5, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_6, CompressionCraftRecipeTypes.ItemCompression, new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
}
}
