package me.jasperchasetoq.compressioncraft.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class CcXtremeCarbonPress extends AContainer implements RecipeDisplayItem {

    public CcXtremeCarbonPress(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }
    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(150, new ItemStack[] {new ItemStack(Material.CHARCOAL, 32)},new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON, 1)});
        registerRecipe(300, new ItemStack[] {new ItemStack(Material.COAL, 32)},new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, 1)});
        registerRecipe(300, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON, 32)},new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 1)});
        registerRecipe(60, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, 8)},new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 1)});
        registerRecipe(210, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 2)},new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBONADO,1 )});
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {return new ItemStack(SlimefunItems.ELECTRIC_PRESS);}
    @Override public String getInventoryTitle() {return "&4CC Xtreme Carbon Press";}
    @Override
    public String getMachineIdentifier() {return "CC_XTREME_CARBON_PRESS";}
    @Override
    public int getCapacity() {return 25000;}
    @Override
    public int getEnergyConsumption() {return 250;}
    @Override
    public int getSpeed() {
        return 10;
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
