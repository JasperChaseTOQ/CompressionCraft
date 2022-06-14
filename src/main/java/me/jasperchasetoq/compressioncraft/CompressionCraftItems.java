package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class CompressionCraftItems {

    private CompressionCraftItems() {}

    //groups
    public static final NestedItemGroup CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_GENERAL"), new CustomItemStack(Material.PISTON, "&bCompressionCraft"));
    public static final SubItemGroup CC_COMPRESSED_ITEMS = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_COMPRESSED_ITEMS"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressed Items"));
    public static final SubItemGroup CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_ITEM_COMPRESSION"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressors & Decompressors"));
    public static final SubItemGroup CC_MISC = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_MISC"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bMisc"));
    public static final SubItemGroup CC_INFO = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_INFO"), CC_GENERAL, new CustomItemStack(Material.BOOK, "&bAddon Info"));

    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&bCompressionCraft"));



    //machines Compressors
    //main
    public static final SlimefunItemStack CC_COMPRESSOR_1 = new SlimefunItemStack("CC_COMPRESSOR_1", Material.PISTON, "&eBasic CC Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CC_COMPRESSOR_2 = new SlimefunItemStack("CC_COMPRESSOR_2", Material.PISTON, "&6Average CC Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(100));
    public static final SlimefunItemStack CC_COMPRESSOR_3 = new SlimefunItemStack("CC_COMPRESSOR_3", Material.PISTON, "&aMedium CC Compressor", "&fCompresses blocks",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(150));
    public static final SlimefunItemStack CC_COMPRESSOR_4 = new SlimefunItemStack("CC_COMPRESSOR_4", Material.PISTON, "&2Good CC Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(200));
    public static final SlimefunItemStack CC_COMPRESSOR_5 = new SlimefunItemStack("CC_COMPRESSOR_5", Material.PISTON, "&6Advanced CC Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(250));
    public static final SlimefunItemStack CC_COMPRESSOR_6 = new SlimefunItemStack("CC_COMPRESSOR_6", Material.PISTON, "&4End-Game CC Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerPerSecond(300));
    //Machines Decompressors
    public static final SlimefunItemStack CC_DECOMPRESSOR_1 = new SlimefunItemStack("CC_DECOMPRESSOR_1", Material.PISTON, "&eBasic CC Decompressor", "&fDecompresses blocks", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CC_DECOMPRESSOR_2 = new SlimefunItemStack("CC_DECOMPRESSOR_2", Material.PISTON, "&6Average CC Decompressor", "&fDecompresses blocks", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(100));
    public static final SlimefunItemStack CC_DECOMPRESSOR_3 = new SlimefunItemStack("CC_DECOMPRESSOR_3", Material.PISTON, "&aMedium CC Decompressor", "&fDecompresses blocks", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(150));
    public static final SlimefunItemStack CC_DECOMPRESSOR_4 = new SlimefunItemStack("CC_DECOMPRESSOR_4", Material.PISTON, "&2Good CC Decompressor", "&fDecompresses blocks", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(200));
    public static final SlimefunItemStack CC_DECOMPRESSOR_5 = new SlimefunItemStack("CC_DECOMPRESSOR_5", Material.PISTON, "&6Advanced CC Decompressor", "&fDecompresses blocks", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(250));
    public static final SlimefunItemStack CC_DECOMPRESSOR_6 = new SlimefunItemStack("CC_DECOMPRESSOR_6", Material.PISTON, "&4End-Game CC Decompressor", "&fDecompresses blocks", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerPerSecond(300));
    //Specialty Compressors
    public static final SlimefunItemStack CC_GEM_COMPRESSOR = new SlimefunItemStack("CC_GEM_COMPRESSOR", Material.AMETHYST_BLOCK, "&4CompressionCraft's Gem Compressor", "&fCompresses Gem Items", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(25), LoreBuilder.powerPerSecond(500), LoreBuilder.powerBuffer(25000));
    public static final SlimefunItemStack CC_GEM_DECOMPRESSOR = new SlimefunItemStack("CC_GEM_DECOMPRESSOR", Material.AMETHYST_BLOCK, "&4CompressionCraft's Gem Decompressor", "&fDecompresses Gem Items", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(25), LoreBuilder.powerPerSecond(500), LoreBuilder.powerBuffer(25000));

    //misc
    public static final SlimefunItemStack CC_ELECTRIC_SF_COMPRESSOR = new SlimefunItemStack("CC_ELECTRIC_SF_COMPRESSOR", Material.PISTON, "&dElectric Slimefun Compressor", "&fCompresses items", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(150));

  
    //blocks

    public static final SlimefunItemStack CC_COBBLESTONE_1 = new SlimefunItemStack("CC_COBBLESTONE_1", Material.COBBLESTONE, "&dCompressed Cobblestone", "", "&f8 Cobblestone", "");
    public static final SlimefunItemStack CC_STONE_1 = new SlimefunItemStack("CC_STONE_1", Material.STONE, "&dCompressed Stone", "", "&f8 Stone", "");
    public static final SlimefunItemStack CC_FLINT_1 = new SlimefunItemStack("CC_FLINT_1", Material.FLINT, "&dCompressed Flint", "", "&f8 Flint", "");
    public static final SlimefunItemStack CC_GRAVEL_1 = new SlimefunItemStack("CC_GRAVEL_1", Material.GRAVEL, "&dCompressed Gravel", "", "&f8 Gravel", "");
    public static final SlimefunItemStack CC_CLAY_1 = new SlimefunItemStack("CC_CLAY_1", Material.CLAY, "&dCompressed Clay", "", "&f8 Clay", "");
    public static final SlimefunItemStack CC_COAL_1 = new SlimefunItemStack("CC_COAL_1", Material.COAL, "&dCompressed Coal", "", "&f8 Coal", "");
    public static final SlimefunItemStack CC_COAL_BLOCK_1 = new SlimefunItemStack("CC_COAL_BLOCK_1", Material.COAL_BLOCK, "&dCompressed Coal Block", "", "&f8 Coal Block", "");
    public static final SlimefunItemStack CC_IRON_NUGGET_1 = new SlimefunItemStack("CC_IRON_NUGGET_1", Material.IRON_NUGGET, "&dCompressed Iron Nugget", "", "&f8 Iron Nugget", "");
    public static final SlimefunItemStack CC_IRON_INGOT_1 = new SlimefunItemStack("CC_IRON_INGOT_1", Material.IRON_INGOT, "&dCompressed Iron Ingot", "", "&f8 Iron Ingot", "");
    public static final SlimefunItemStack CC_IRON_BLOCk_1 = new SlimefunItemStack("CC_IRON_BLOCK_1", Material.IRON_BLOCK, "&dCompressed Iron Block", "", "&f8 Iron Block", "");
    public static final SlimefunItemStack CC_GOLD_NUGGET_1 = new SlimefunItemStack("CC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&dCompressed Gold Nugget", "", "&f8 Gold Nugget", "");
    public static final SlimefunItemStack CC_GOLD_INGOT_1 = new SlimefunItemStack("CC_GOLD_INGOT_1", Material.GOLD_INGOT, "&dCompressed Gold Ingot", "", "&f8 Gold Ingot", "");
    public static final SlimefunItemStack CC_GOLD_BLOCK_1 = new SlimefunItemStack("CC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&dCompressed Gold Block", "", "&f8 Gold Block", "");
    public static final SlimefunItemStack CC_REDSTONE_1 = new SlimefunItemStack("CC_REDSTONE_1", Material.REDSTONE, "&dCompressed Redstone", "", "&f8 Redstone", "");
    public static final SlimefunItemStack CC_REDSTONE_BLOCK_1 = new SlimefunItemStack("CC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&dCompressed Redstone Block", "", "&f8 Redstone Block", "");
    public static final SlimefunItemStack CC_LAPIS_LAZULI_1 = new SlimefunItemStack("CC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&dCompressed Lapis Lazuli", "", "&f8 Lapis Lazuli", "");
    public static final SlimefunItemStack CC_LAPIS_BLOCK_1 = new SlimefunItemStack("CC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&dCompressed Lapis Block", "", "&f8 Lapis Block", "");
    public static final SlimefunItemStack CC_DIAMOND_1 = new SlimefunItemStack("CC_DIAMOND_1", Material.DIAMOND, "&dCompressed Diamond", "", "&f8 Diamond", "");
    public static final SlimefunItemStack CC_DIAMOND_BLOCK_1 = new SlimefunItemStack("CC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&dCompressed Diamond Block", "", "&f8 Diamond Block", "");
    public static final SlimefunItemStack CC_EMERALD_1 = new SlimefunItemStack("CC_EMERALD_1", Material.EMERALD, "&dCompressed Emerald", "", "&f8 Emerald", "");
    public static final SlimefunItemStack CC_EMERALD_BLOCK_1 = new SlimefunItemStack("CC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&dCompressed Emerald Block", "", "&f8 Emerald Block", "");
    public static final SlimefunItemStack CC_AMETHYST_SHARD_1 = new SlimefunItemStack("CC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&dCompressed Amethyst Shard", "", "&f8 Amethyst Shard", "");
    public static final SlimefunItemStack CC_AMETHYST_BLOCK_1 = new SlimefunItemStack("CC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&dCompressed Amethyst Block", "", "&f8 Amethyst Block", "");
    public static final SlimefunItemStack CC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("CC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&dCompressed Small Amethyst Bud", "", "&f8 Small Amethyst Bud", "");
    public static final SlimefunItemStack CC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("CC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&dCompressed Medium Amethyst Bud", "", "&f8 Medium Amethyst Bud", "");
    public static final SlimefunItemStack CC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("CC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&dCompressed Large Amethyst Bud", "", "&f8 Large Amethyst Bud", "");
    public static final SlimefunItemStack CC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("CC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&dCompressed Amethyst Cluster", "", "&f8 Amethyst Cluster", "");
}
