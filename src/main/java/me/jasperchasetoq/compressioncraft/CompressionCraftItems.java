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
    public static final NestedItemGroup CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_GENERAL"), new CustomItemStack(Material.PISTON, "&bCompressionCraft"));
    public static final SubItemGroup CC_BLOCKS = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_BLOCKS"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressionCraft Blocks"));
    public static final SubItemGroup CC_MACHINES = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_MACHINES"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressionCraft Machines"));


    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&bCompressionCraft"));

    public static final SlimefunItemStack CC_COMPRESSOR = new SlimefunItemStack("CC_COMPRESSOR",
            Material.PISTON,
            "&dCompressor",
            "",
            "&fCompresses blocks",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(32)
    );
}
