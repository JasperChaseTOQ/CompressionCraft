package me.jasperchasetoq.compressioncraft.items.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class LoreRefresher extends AContainer implements RecipeDisplayItem {


    public LoreRefresher(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }
    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COMPRESSOR_1, 1)}, new ItemStack[] {CompressionCraftItems.CC_COMPRESSOR_1});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COMPRESSOR_2, 1)}, new ItemStack[] {CompressionCraftItems.CC_COMPRESSOR_2});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COMPRESSOR_3, 1)}, new ItemStack[] {CompressionCraftItems.CC_COMPRESSOR_3});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COMPRESSOR_4, 1)}, new ItemStack[] {CompressionCraftItems.CC_COMPRESSOR_4});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COMPRESSOR_5, 1)}, new ItemStack[] {CompressionCraftItems.CC_COMPRESSOR_5});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COMPRESSOR_6, 1)}, new ItemStack[] {CompressionCraftItems.CC_COMPRESSOR_6});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DECOMPRESSOR_1, 1)}, new ItemStack[] {CompressionCraftItems.CC_DECOMPRESSOR_1});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DECOMPRESSOR_2, 1)}, new ItemStack[] {CompressionCraftItems.CC_DECOMPRESSOR_2});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DECOMPRESSOR_3, 1)}, new ItemStack[] {CompressionCraftItems.CC_DECOMPRESSOR_3});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DECOMPRESSOR_4, 1)}, new ItemStack[] {CompressionCraftItems.CC_DECOMPRESSOR_4});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DECOMPRESSOR_5, 1)}, new ItemStack[] {CompressionCraftItems.CC_DECOMPRESSOR_5});
        registerRecipe(0, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DECOMPRESSOR_6, 1)}, new ItemStack[] {CompressionCraftItems.CC_DECOMPRESSOR_6});

    }
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(SlimefunItems.ELECTRIC_PRESS);
    }

    @Override
    public String getInventoryTitle() {

        return "&fLore Refresher";

    }

    @Override
    public String getMachineIdentifier() {
        return "CC_LORE_REFRESHER";
    }

    @Override
    public int getCapacity() {
        return 25;
    }

    @Override
    public int getEnergyConsumption() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }

}
