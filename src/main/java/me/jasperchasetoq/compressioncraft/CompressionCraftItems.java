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
    public static final SubItemGroup CC_MATERIALS = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_MATERIALS"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressed Materials"));
    public static final SubItemGroup CC_MACHINES = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_MACHINES"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bMachines"));


    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&bCompressionCraft"));


    //machines
    public static final SlimefunItemStack CC_COMPRESSOR = new SlimefunItemStack("CC_COMPRESSOR",
            Material.PISTON,
            "&dCompressor",
            "",
            "&fCompresses blocks",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(25)
    );
    public static final SlimefunItemStack CC_DECOMPRESSOR = new SlimefunItemStack("CC_DECOMPRESSOR",
            Material.PISTON,
            "&dDecompressor",
            "",
            "&fDecompresses blocks",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(25)
    );
    public static final SlimefunItemStack CC_ELECTRIC_SF_COMPRESSOR = new SlimefunItemStack("CC_ELECTRIC_SF_COMPRESSOR",
            Material.PISTON,
            "&dElectric Slimefun Compressor",
            "",
            "&fCompresses items",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(150)
            );
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
}
