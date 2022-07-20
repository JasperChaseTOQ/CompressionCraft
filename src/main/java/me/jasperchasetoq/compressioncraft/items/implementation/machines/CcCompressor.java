package me.jasperchasetoq.compressioncraft.items.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
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

public class CcCompressor extends AContainer implements RecipeDisplayItem {


 public CcCompressor(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
            super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }
        @Override
        protected void registerDefaultRecipes() {

            registerRecipe(8, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.STONE, 8)}, new ItemStack[] {CompressionCraftItems.JC_STONE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_STONE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_STONE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_STONE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_STONE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_STONE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_STONE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_STONE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_STONE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_STONE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_STONE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.ANDESITE, 8)}, new ItemStack[] {CompressionCraftItems.JC_ANDESITE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_ANDESITE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_ANDESITE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_ANDESITE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_ANDESITE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_ANDESITE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_ANDESITE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_ANDESITE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_ANDESITE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_ANDESITE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_ANDESITE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.DIORITE, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIORITE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIORITE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIORITE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIORITE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIORITE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIORITE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIORITE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIORITE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIORITE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIORITE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIORITE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.GRANITE, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRANITE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRANITE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRANITE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRANITE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRANITE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRANITE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRANITE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRANITE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRANITE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRANITE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRANITE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.COBBLED_DEEPSLATE, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLED_DEEPSLATE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLED_DEEPSLATE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLED_DEEPSLATE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLED_DEEPSLATE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLED_DEEPSLATE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLED_DEEPSLATE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLED_DEEPSLATE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLED_DEEPSLATE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLED_DEEPSLATE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLED_DEEPSLATE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLED_DEEPSLATE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.DEEPSLATE, 8)}, new ItemStack[] {CompressionCraftItems.JC_DEEPSLATE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DEEPSLATE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_DEEPSLATE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DEEPSLATE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_DEEPSLATE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DEEPSLATE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_DEEPSLATE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DEEPSLATE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_DEEPSLATE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DEEPSLATE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_DEEPSLATE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.FLINT, 8)}, new ItemStack[] {CompressionCraftItems.JC_FLINT_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_FLINT_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_FLINT_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_FLINT_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_FLINT_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_FLINT_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_FLINT_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_FLINT_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_FLINT_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_FLINT_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_FLINT_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.GRAVEL, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRAVEL_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRAVEL_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRAVEL_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRAVEL_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRAVEL_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRAVEL_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRAVEL_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRAVEL_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRAVEL_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRAVEL_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_GRAVEL_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.DIRT, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIRT_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIRT_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIRT_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIRT_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIRT_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIRT_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIRT_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIRT_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIRT_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIRT_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIRT_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.CLAY_BALL, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_BALL_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_BALL_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_BALL_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_BALL_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_BALL_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_BALL_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_BALL_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_BALL_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_BALL_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_BALL_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_BALL_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.CLAY, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_CLAY_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.SNOWBALL, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BALL_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BALL_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BALL_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BALL_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BALL_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BALL_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BALL_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BALL_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BALL_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BALL_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BALL_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.SNOW_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BLOCK_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BLOCK_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BLOCK_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BLOCK_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BLOCK_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BLOCK_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BLOCK_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BLOCK_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BLOCK_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_SNOW_BLOCK_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.COAL, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.COAL_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.IRON_NUGGET, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_NUGGET_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_NUGGET_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_NUGGET_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_NUGGET_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_NUGGET_3});            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_COAL_BLOCK_6});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_NUGGET_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_NUGGET_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_NUGGET_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_NUGGET_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_NUGGET_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_NUGGET_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.IRON_INGOT, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_INGOT_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_INGOT_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_INGOT_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_INGOT_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_INGOT_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_INGOT_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_INGOT_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_INGOT_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_INGOT_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_INGOT_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_INGOT_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.IRON_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_BLOCk_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_BLOCk_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_BLOCk_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_BLOCk_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_BLOCk_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_BLOCk_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_BLOCk_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_BLOCk_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_BLOCk_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_BLOCk_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_IRON_BLOCk_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.GOLD_NUGGET, 8)}, new ItemStack[]{CompressionCraftItems.JC_GOLD_NUGGET_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_NUGGET_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_NUGGET_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_NUGGET_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_NUGGET_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_NUGGET_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_NUGGET_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_NUGGET_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_NUGGET_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_NUGGET_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_NUGGET_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.GOLD_INGOT, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_INGOT_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_INGOT_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_INGOT_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_INGOT_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_INGOT_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_INGOT_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_INGOT_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_INGOT_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_INGOT_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_INGOT_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_INGOT_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.GOLD_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_BLOCK_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_BLOCK_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_BLOCK_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_BLOCK_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_BLOCK_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_BLOCK_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_BLOCK_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_BLOCK_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_BLOCK_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_GOLD_BLOCK_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.REDSTONE, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.REDSTONE_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_BLOCK_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_BLOCK_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_BLOCK_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_BLOCK_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_BLOCK_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_BLOCK_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_BLOCK_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_BLOCK_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_BLOCK_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_REDSTONE_BLOCK_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.LAPIS_LAZULI, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_LAZULI_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_LAZULI_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_LAZULI_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_LAZULI_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_LAZULI_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_LAZULI_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_LAZULI_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_LAZULI_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_LAZULI_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_LAZULI_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_LAZULI_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.LAPIS_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_BLOCK_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_BLOCK_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_BLOCK_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_BLOCK_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_BLOCK_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_BLOCK_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_BLOCK_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_BLOCK_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_BLOCK_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_LAPIS_BLOCK_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.DIAMOND, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.DIAMOND_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_BLOCK_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_BLOCK_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_BLOCK_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_BLOCK_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_BLOCK_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_BLOCK_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_BLOCK_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_BLOCK_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_BLOCK_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_BLOCK_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_DIAMOND_BLOCK_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.EMERALD, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_1});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_2});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_3});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_4});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_5});
            registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_6});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.EMERALD_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_EMERALD_BLOCK_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.AMETHYST_SHARD, 8)}, new ItemStack[] {CompressionCraftItems.JC_AMETHYST_SHARD_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.AMETHYST_BLOCK, 8)}, new ItemStack[] {CompressionCraftItems.JC_AMETHYST_BLOCK_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.SMALL_AMETHYST_BUD, 8)}, new ItemStack[] {CompressionCraftItems.JC_SMALL_AMETHYST_BUD_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.MEDIUM_AMETHYST_BUD, 8)}, new ItemStack[] {CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.LARGE_AMETHYST_BUD, 8)}, new ItemStack[] {CompressionCraftItems.JC_LARGE_AMETHYST_BUD_1});
            registerRecipe(8, new ItemStack[] {new ItemStack(Material.AMETHYST_CLUSTER, 8)}, new ItemStack[] {CompressionCraftItems.JC_AMETHYST_CLUSTER_1});

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
        public ItemStack getProgressBar() {
            return new ItemStack(SlimefunItems.ELECTRIC_PRESS);
        }
        @Override
        public String getMachineIdentifier() {return "JC_COMPRESSOR";}

        @Override
        public String getInventoryTitle() {return "&0CompressionCraft's " + getItemName();}

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

