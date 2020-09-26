package net.dodogang.crumbs.init;

import net.dodogang.crumbs.Crumbs;
import net.dodogang.crumbs.block.*;
import net.dodogang.crumbs.block.vanilla.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CrumbsBlocks {

    // BUNDLED LOGS

    public static final Block OAK_BUNDLED_LOG = registerPillarBlock("oak_bundled_log", Blocks.OAK_LOG);
    public static final Block BIRCH_BUNDLED_LOG = registerPillarBlock("birch_bundled_log", Blocks.BIRCH_LOG);
    public static final Block SPRUCE_BUNDLED_LOG = registerPillarBlock("spruce_bundled_log", Blocks.SPRUCE_LOG);
    public static final Block JUNGLE_BUNDLED_LOG = registerPillarBlock("jungle_bundled_log", Blocks.JUNGLE_LOG);
    public static final Block ACACIA_BUNDLED_LOG = registerPillarBlock("acacia_bundled_log", Blocks.ACACIA_LOG);
    public static final Block DARK_OAK_BUNDLED_LOG = registerPillarBlock("dark_oak_bundled_log", Blocks.DARK_OAK_LOG);
    public static final Block CRIMSON_BUNDLED_STEM = registerPillarBlock("crimson_bundled_stem", Blocks.CRIMSON_STEM);
    public static final Block WARPED_BUNDLED_STEM = registerPillarBlock("warped_bundled_stem", Blocks.WARPED_STEM);

    public static final Block STRIPPED_OAK_BUNDLED_LOG = registerPillarBlock("stripped_oak_bundled_log", Blocks.STRIPPED_OAK_LOG);
    public static final Block STRIPPED_BIRCH_BUNDLED_LOG = registerPillarBlock("stripped_birch_bundled_log", Blocks.STRIPPED_BIRCH_LOG);
    public static final Block STRIPPED_SPRUCE_BUNDLED_LOG = registerPillarBlock("stripped_spruce_bundled_log", Blocks.STRIPPED_SPRUCE_LOG);
    public static final Block STRIPPED_JUNGLE_BUNDLED_LOG = registerPillarBlock("stripped_jungle_bundled_log", Blocks.STRIPPED_JUNGLE_LOG);
    public static final Block STRIPPED_ACACIA_BUNDLED_LOG = registerPillarBlock("stripped_acacia_bundled_log", Blocks.STRIPPED_ACACIA_LOG);
    public static final Block STRIPPED_DARK_OAK_BUNDLED_LOG = registerPillarBlock("stripped_dark_oak_bundled_log", Blocks.STRIPPED_DARK_OAK_LOG);
    public static final Block STRIPPED_CRIMSON_BUNDLED_STEM = registerPillarBlock("stripped_crimson_bundled_stem", Blocks.STRIPPED_CRIMSON_STEM);
    public static final Block STRIPPED_WARPED_BUNDLED_STEM = registerPillarBlock("stripped_warped_bundled_stem", Blocks.STRIPPED_WARPED_STEM);

    // WOODEN BLOCKS

    public static final Block OAK_TILE = registerCopy("oak_tile", Blocks.OAK_PLANKS);
    public static final Block SPRUCE_TILE = registerCopy("spruce_tile", Blocks.SPRUCE_PLANKS);
    public static final Block BIRCH_TILE = registerCopy("birch_tile", Blocks.BIRCH_PLANKS);
    public static final Block JUNGLE_TILE = registerCopy("jungle_tile", Blocks.JUNGLE_PLANKS);
    public static final Block ACACIA_TILE = registerCopy("acacia_tile", Blocks.ACACIA_PLANKS);
    public static final Block DARK_OAK_TILE = registerCopy("dark_oak_tile", Blocks.DARK_OAK_PLANKS);
    public static final Block CRIMSON_TILE = registerCopy("crimson_tile", Blocks.WARPED_PLANKS);
    public static final Block WARPED_TILE = registerCopy("warped_tile", Blocks.WARPED_PLANKS);

    public static final Block OAK_TILE_SLAB = registerSlab(OAK_TILE);
    public static final Block SPRUCE_TILE_SLAB = registerSlab(SPRUCE_TILE);
    public static final Block BIRCH_TILE_SLAB = registerSlab(BIRCH_TILE);
    public static final Block JUNGLE_TILE_SLAB = registerSlab(JUNGLE_TILE);
    public static final Block ACACIA_TILE_SLAB = registerSlab(ACACIA_TILE);
    public static final Block DARK_OAK_TILE_SLAB = registerSlab(DARK_OAK_TILE);
    public static final Block CRIMSON_TILE_SLAB = registerSlab(CRIMSON_TILE);
    public static final Block WARPED_TILE_SLAB = registerSlab(WARPED_TILE);

    public static final Block RIDGED_OAK_PLANKS = registerCopy("ridged_oak_planks", Blocks.OAK_PLANKS);
    public static final Block RIDGED_SPRUCE_PLANKS = registerCopy("ridged_spruce_planks", Blocks.SPRUCE_PLANKS);
    public static final Block RIDGED_BIRCH_PLANKS = registerCopy("ridged_birch_planks", Blocks.BIRCH_PLANKS);
    public static final Block RIDGED_JUNGLE_PLANKS = registerCopy("ridged_jungle_planks", Blocks.JUNGLE_PLANKS);
    public static final Block RIDGED_ACACIA_PLANKS = registerCopy("ridged_acacia_planks", Blocks.ACACIA_PLANKS);
    public static final Block RIDGED_DARK_OAK_PLANKS = registerCopy("ridged_dark_oak_planks", Blocks.DARK_OAK_PLANKS);
    public static final Block RIDGED_CRIMSON_PLANKS = registerCopy("ridged_crimson_planks", Blocks.WARPED_PLANKS);
    public static final Block RIDGED_WARPED_PLANKS = registerCopy("ridged_warped_planks", Blocks.WARPED_PLANKS);

    public static final Block RIDGED_OAK_SLAB = registerSlab("ridged_oak", RIDGED_OAK_PLANKS);
    public static final Block RIDGED_SPRUCE_SLAB = registerSlab("ridged_spruce", RIDGED_SPRUCE_PLANKS);
    public static final Block RIDGED_BIRCH_SLAB = registerSlab("ridged_birch", RIDGED_BIRCH_PLANKS);
    public static final Block RIDGED_JUNGLE_SLAB = registerSlab("ridged_jungle", RIDGED_JUNGLE_PLANKS);
    public static final Block RIDGED_ACACIA_SLAB = registerSlab("ridged_acacia", RIDGED_ACACIA_PLANKS);
    public static final Block RIDGED_DARK_OAK_SLAB = registerSlab("ridged_dark_oak", RIDGED_DARK_OAK_PLANKS);
    public static final Block RIDGED_CRIMSON_SLAB = registerSlab("ridged_crimson", RIDGED_CRIMSON_PLANKS);
    public static final Block RIDGED_WARPED_SLAB = registerSlab("ridged_warped", RIDGED_WARPED_PLANKS);

    public static final Block SPRUCE_CRAFTING_TABLE = registerCraftingTable("spruce", Blocks.SPRUCE_PLANKS);
    public static final Block BIRCH_CRAFTING_TABLE = registerCraftingTable("birch", Blocks.BIRCH_PLANKS);
    public static final Block JUNGLE_CRAFTING_TABLE = registerCraftingTable("jungle", Blocks.JUNGLE_PLANKS);
    public static final Block ACACIA_CRAFTING_TABLE = registerCraftingTable("acacia", Blocks.ACACIA_PLANKS);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerCraftingTable("dark_oak", Blocks.DARK_OAK_PLANKS);
    public static final Block CRIMSON_CRAFTING_TABLE = registerCraftingTable("crimson", Blocks.CRIMSON_PLANKS);
    public static final Block WARPED_CRAFTING_TABLE = registerCraftingTable("warped", Blocks.WARPED_PLANKS);

    public static final Block OAK_BARREL = registerBarrel("oak", Blocks.OAK_PLANKS);
    public static final Block BIRCH_BARREL = registerBarrel("birch", Blocks.BIRCH_PLANKS);
    public static final Block JUNGLE_BARREL = registerBarrel("jungle", Blocks.JUNGLE_PLANKS);
    public static final Block ACACIA_BARREL = registerBarrel("acacia", Blocks.ACACIA_PLANKS);
    public static final Block DARK_OAK_BARREL = registerBarrel("dark_oak", Blocks.DARK_OAK_PLANKS);
    public static final Block CRIMSON_BARREL = registerBarrel("crimson", Blocks.CRIMSON_PLANKS);
    public static final Block WARPED_BARREL = registerBarrel("warped", Blocks.WARPED_PLANKS);

    // STONE BLOCKS

    public static final Block GLOWING_GRANITE = registerLight15("glowing_granite", Blocks.GRANITE);
    public static final Block COBBLED_GRANITE = registerCopy("cobbled_granite", Blocks.GRANITE);
    public static final Block CHISELED_GRANITE = registerCopy("chiseled_granite", Blocks.GRANITE);
    public static final Block BORDERED_GRANITE = registerCopy("bordered_granite", Blocks.GRANITE);
    public static final Block CRACKED_GRANITE = registerCopy("cracked_granite", Blocks.GRANITE);

    public static final Block GLOWING_DIORITE = registerLight15("glowing_diorite", Blocks.DIORITE);
    public static final Block COBBLED_DIORITE = registerCopy("cobbled_diorite", Blocks.DIORITE);
    public static final Block CHISELED_DIORITE = registerCopy("chiseled_diorite", Blocks.DIORITE);
    public static final Block BORDERED_DIORITE = registerCopy("bordered_diorite", Blocks.DIORITE);
    public static final Block CRACKED_DIORITE = registerCopy("cracked_diorite", Blocks.DIORITE);

    public static final Block GLOWING_ANDESITE = registerLight15("glowing_andesite", Blocks.ANDESITE);
    public static final Block COBBLED_ANDESITE = registerCopy("cobbled_andesite", Blocks.ANDESITE);
    public static final Block CHISELED_ANDESITE = registerCopy("chiseled_andesite", Blocks.ANDESITE);
    public static final Block BORDERED_ANDESITE = registerCopy("bordered_andesite", Blocks.ANDESITE);
    public static final Block CRACKED_ANDESITE = registerCopy("cracked_andesite", Blocks.ANDESITE);

    public static final Block GLOWING_BASALT = registerLight15("glowing_basalt", Blocks.BASALT);
    public static final Block COBBLED_BASALT = registerCopy("cobbled_basalt", Blocks.BASALT);
    public static final Block POLISHED_BASALT = registerCopy("polished_basalt", Blocks.BASALT);
    public static final Block CHISELED_BASALT = registerCopy("chiseled_basalt", Blocks.BASALT);
    public static final Block BORDERED_BASALT = registerCopy("bordered_basalt", Blocks.BASALT);
    public static final Block CRACKED_BASALT = registerCopy("cracked_basalt", Blocks.BASALT);

    public static final Block POLISHED_BASALT_SLAB = registerSlab(POLISHED_BASALT);
    public static final Block POLISHED_BASALT_STAIRS = registerStairs(POLISHED_BASALT);

    public static final Block COBBLED_GRANITE_WALL = registerWall(COBBLED_GRANITE);
    public static final Block COBBLED_DIORITE_WALL = registerWall(COBBLED_DIORITE);
    public static final Block COBBLED_ANDESITE_WALL = registerWall(COBBLED_ANDESITE);
    public static final Block COBBLED_BASALT_WALL = registerWall(COBBLED_BASALT);

    public static final Block COBBLED_GRANITE_SLAB = registerSlab(COBBLED_GRANITE);
    public static final Block COBBLED_DIORITE_SLAB = registerSlab(COBBLED_DIORITE);
    public static final Block COBBLED_ANDESITE_SLAB = registerSlab(COBBLED_ANDESITE);
    public static final Block COBBLED_BASALT_SLAB = registerSlab(COBBLED_BASALT);

    public static final Block COBBLED_GRANITE_STAIRS = registerStairs(COBBLED_GRANITE);
    public static final Block COBBLED_DIORITE_STAIRS = registerStairs(COBBLED_DIORITE);
    public static final Block COBBLED_ANDESITE_STAIRS = registerStairs(COBBLED_ANDESITE);
    public static final Block COBBLED_BASALT_STAIRS = registerStairs(COBBLED_BASALT);

    public static final Block CRACKED_GRANITE_WALL = registerWall(CRACKED_GRANITE);
    public static final Block CRACKED_DIORITE_WALL = registerWall(CRACKED_DIORITE);
    public static final Block CRACKED_ANDESITE_WALL = registerWall(CRACKED_ANDESITE);
    public static final Block CRACKED_BASALT_WALL = registerWall(CRACKED_BASALT);

    public static final Block CRACKED_GRANITE_SLAB = registerSlab(CRACKED_GRANITE);
    public static final Block CRACKED_DIORITE_SLAB = registerSlab(CRACKED_DIORITE);
    public static final Block CRACKED_ANDESITE_SLAB = registerSlab(CRACKED_ANDESITE);
    public static final Block CRACKED_BASALT_SLAB = registerSlab(CRACKED_BASALT);

    public static final Block CRACKED_GRANITE_STAIRS = registerStairs(CRACKED_GRANITE);
    public static final Block CRACKED_DIORITE_STAIRS = registerStairs(CRACKED_DIORITE);
    public static final Block CRACKED_ANDESITE_STAIRS = registerStairs(CRACKED_ANDESITE);
    public static final Block CRACKED_BASALT_STAIRS = registerStairs(CRACKED_BASALT);

    // PEBBLES BLOCKS

    public static final Block GRANITE_PEBBLES = registerPebble(Blocks.GRANITE);
    public static final Block DIORITE_PEBBLES = registerPebble(Blocks.DIORITE);
    public static final Block ANDESITE_PEBBLES = registerPebble(Blocks.ANDESITE);
    public static final Block BASALT_PEBBLES = registerPebble(Blocks.BASALT);

    // SAND BLOCKS

    public static final Block GLOWING_SAND = registerLight15("glowing_sand", Blocks.SAND);
    public static final Block SANDSTONE_TILE = registerCopy("sandstone_tile", Blocks.SANDSTONE);
    public static final Block LARGE_SANDSTONE_TILE = registerCopy("large_sandstone_tile", Blocks.SANDSTONE);

    public static final Block GLOWING_RED_SAND = registerLight15("glowing_red_sand", Blocks.RED_SAND);
    public static final Block RED_SANDSTONE_TILE = registerCopy("red_sandstone_tile", Blocks.RED_SANDSTONE);
    public static final Block LARGE_RED_SANDSTONE_TILE = registerCopy("large_red_sandstone_tile", Blocks.RED_SANDSTONE);

    public static final Block SANDSTONE_TILE_WALL = registerWall(SANDSTONE_TILE);
    public static final Block SANDSTONE_RED_TILE_WALL = registerWall(RED_SANDSTONE_TILE);

    public static final Block SANDSTONE_TILE_SLAB = registerSlab(SANDSTONE_TILE);
    public static final Block RED_SANDSTONE_TILE_SLAB = registerSlab(RED_SANDSTONE_TILE);

    public static final Block SANDSTONE_TILE_STAIRS = registerStairs(SANDSTONE_TILE);
    public static final Block RED_SANDSTONE_TILE_STAIRS = registerStairs(RED_SANDSTONE_TILE);

    public CrumbsBlocks() {
        // TODO barrel point of interests
    }

    private static Block registerCopy(String id, Block base) {
        return register(id, new Block(FabricBlockSettings.copy(base)));
    }
    private static Block registerPillarBlock(String id, Block base) {
        return register(id, new PillarBlock(FabricBlockSettings.copy(base)));
    }

    private static Block registerSlab(String id, Block base) {
        return register(id + "_slab", new SlabBlock(FabricBlockSettings.copy(base)));
    }
    private static Block registerSlab(Block base) {
        return registerSlab(Registry.BLOCK.getId(base).getPath(), base);
    }

    private static Block registerStairs(String id, Block base) {
        return register(id + "_stairs", new PublicStairsBlock(base.getDefaultState(), FabricBlockSettings.copy(base)));
    }
    private static Block registerStairs(Block base) {
        return registerStairs(Registry.BLOCK.getId(base).getPath(), base);
    }

    private static Block registerWall(String id, Block base) {
        return register(id + "_wall", new WallBlock(FabricBlockSettings.copy(base)));
    }
    private static Block registerWall(Block base) {
        return registerWall(Registry.BLOCK.getId(base).getPath(), base);
    }

    private static Block registerPebble(String id, Block base) {
        return register(id + "_pebbles", new PebblesBlock(FabricBlockSettings.copy(base)));
    }
    private static Block registerPebble(Block base) {
        return registerPebble(Registry.BLOCK.getId(base).getPath(), base);
    }

    private static Block registerCraftingTable(String id, Block base) {
        return register(id + "_crafting_table", new PublicCraftingTableBlock(FabricBlockSettings.copy(base)));
    }
    private static Block registerBarrel(String id, Block base) {
        return register(id + "_barrel", new BarrelBlock(FabricBlockSettings.copy(base)));
    }
    private static Block registerLight15(String id, Block base) {
        return register(id, new Block(FabricBlockSettings.copy(base).luminance((state) -> {
            return 15;
        })));
    }

    public static Block register(String id, Block block, boolean registerItem) {
        Identifier identifier = new Identifier(Crumbs.MOD_ID, id);

        Block registeredBlock = Registry.register(Registry.BLOCK, identifier, block);
        if (registerItem) {
            int maxCount = 64;
            if (block instanceof SignBlock) maxCount = 16;

            Registry.register(Registry.ITEM, identifier, new BlockItem(registeredBlock, new Item.Settings().maxCount(maxCount).group(Crumbs.ITEM_GROUP)));
        }

        return registeredBlock;
    }
    public static Block register(String id, Block block) {
        return register(id, block, true);
    }
}
