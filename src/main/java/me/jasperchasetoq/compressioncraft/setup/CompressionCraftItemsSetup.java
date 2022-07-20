package me.jasperchasetoq.compressioncraft.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.items.implementation.machines.CcCompressor;
import me.jasperchasetoq.compressioncraft.items.implementation.machines.CcDecompressor;
import me.jasperchasetoq.compressioncraft.items.implementation.machines.LoreRefresher;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItemsSetup {
    private CompressionCraftItemsSetup() {}

    public static void setup(@Nonnull CompressionCraft plugin) {


        //machines Old
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COMPRESSOR_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
            }).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COMPRESSOR_2, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COMPRESSOR_3, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COMPRESSOR_4, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COMPRESSOR_5, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COMPRESSOR_6, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);


        //machines decompressors
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DECOMPRESSOR_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DECOMPRESSOR_2, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DECOMPRESSOR_3, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DECOMPRESSOR_4, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DECOMPRESSOR_5, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                })
                .register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DECOMPRESSOR_6, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,
                }).register(plugin);

        //Machines Misc
        new LoreRefresher(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.CC_JC_LORE_REFRESHER, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        CompressionCraftItems.JC_COBBLESTONE_1, CompressionCraftItems.JC_COBBLESTONE_1, CompressionCraftItems.JC_COBBLESTONE_1,
                        CompressionCraftItems.JC_COBBLESTONE_1, new ItemStack(Material.LECTERN), CompressionCraftItems.JC_COBBLESTONE_1,
                        CompressionCraftItems.JC_COBBLESTONE_1, CompressionCraftItems.JC_COBBLESTONE_1, CompressionCraftItems.JC_COBBLESTONE_1,
                }).register(plugin);
        //Compressed Items (old)
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLESTONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLESTONE_2, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLESTONE_3, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLESTONE_4, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLESTONE_5, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLESTONE_6, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_STONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_ANDESITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DIORITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_GRANITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COBBLED_DEEPSLATE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DEEPSLATE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_FLINT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_GRAVEL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DIRT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_CLAY_BALL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_CLAY_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COAL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_COAL_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_IRON_NUGGET_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_IRON_INGOT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_IRON_BLOCk_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_GOLD_NUGGET_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_GOLD_INGOT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_GOLD_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_REDSTONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_REDSTONE_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_LAPIS_LAZULI_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_LAPIS_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DIAMOND_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_DIAMOND_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_EMERALD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_EMERALD_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_AMETHYST_SHARD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_AMETHYST_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_SMALL_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_MEDIUM_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_LARGE_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_DISABLED, CompressionCraftItems.CC_AMETHYST_CLUSTER_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        //machines (new)
        //machines
        //compressors
        new CcCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_PRESS, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                }).setCapacity(250)
                .setEnergyConsumption(25)
                .setProcessingSpeed(1)
                .register(plugin);
        new CcCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).setCapacity(500)
                .setEnergyConsumption(50)
                .setProcessingSpeed(2)
                .register(plugin);
        new CcCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.BIG_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).setCapacity(750)
                .setEnergyConsumption(75)
                .setProcessingSpeed(3)
                .register(plugin);
        new CcCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).setCapacity(1000)
                .setEnergyConsumption(100)
                .setProcessingSpeed(4)
                .register(plugin);
        new CcCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).setCapacity(1250)
                .setEnergyConsumption(125)
                .setProcessingSpeed(5)
                .register(plugin);
        new CcCompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_COMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).setCapacity(1500)
                .setEnergyConsumption(150)
                .setProcessingSpeed(6)
                .register(plugin);


        //machines decompressors
        new CcDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_COMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                }).setCapacity(250)
                .setEnergyConsumption(25)
                .setProcessingSpeed(1)
                .register(plugin);
        new CcDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.COMPRESSED_CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_1, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.COMPRESSED_CARBON,
                }).setCapacity(500)
                .setEnergyConsumption(50)
                .setProcessingSpeed(2)
                .register(plugin);
        new CcDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.BIG_CAPACITOR, SlimefunItems.CARBON_CHUNK,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON_CHUNK, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON_CHUNK,
                }).setCapacity(750)
                .setEnergyConsumption(75)
                .setProcessingSpeed(3)
                .register(plugin);
        new CcDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.SYNTHETIC_DIAMOND,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_3, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.HEATING_COIL, SlimefunItems.SYNTHETIC_DIAMOND,
                }).setCapacity(1000)
                .setEnergyConsumption(100)
                .setProcessingSpeed(4)
                .register(plugin);
        new CcDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.RAW_CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_4, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.RAW_CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.RAW_CARBONADO,
                }).setCapacity(1250)
                .setEnergyConsumption(125)
                .setProcessingSpeed(5)
                .register(plugin);
        new CcDecompressor(CompressionCraftItems.JC_CC_MACHINES, CompressionCraftItems.JC_DECOMPRESSOR_6, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBONADO, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.CARBONADO,
                        SlimefunItems.ELECTRIC_MOTOR, CompressionCraftItems.JC_DECOMPRESSOR_5, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBONADO, SlimefunItems.HEATING_COIL, SlimefunItems.CARBONADO,
                }).setCapacity(1500)
                .setEnergyConsumption(150)
                .setProcessingSpeed(6)
                .register(plugin);
        //Compressed Items (New)
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_2, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_3, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_4, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_5, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLESTONE_6, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_STONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_ANDESITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIORITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRANITE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COBBLED_DEEPSLATE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DEEPSLATE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_FLINT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GRAVEL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIRT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_BALL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_CLAY_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BALL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SNOW_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_COAL_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_NUGGET_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_INGOT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_IRON_BLOCk_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_NUGGET_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_INGOT_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_GOLD_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_REDSTONE_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_LAZULI_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LAPIS_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_DIAMOND_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_EMERALD_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_SHARD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_BLOCK_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_SMALL_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_LARGE_AMETHYST_BUD_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new UnplaceableBlock(CompressionCraftItems.JC_CC_ITEM_COMPRESSION, CompressionCraftItems.JC_AMETHYST_CLUSTER_1, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);

        //addon info
        new SlimefunItem(CompressionCraftItems.JC_CC_INFO, CompressionCraftItems.JC_CC_MC_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.JC_CC_INFO, CompressionCraftItems.JC_CC_JAVA_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.JC_CC_INFO, CompressionCraftItems.JC_CC_SF_BUILD, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.JC_CC_INFO, CompressionCraftItems.JC_CC_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.JC_CC_INFO, CompressionCraftItems.JC_CC_PREFIX, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);


}
}
