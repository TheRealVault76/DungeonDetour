package net.vault.dungeondetour.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.vault.dungeondetour.DungeonDetour;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TRUE_DARK_BLOCK = registerBlock("true_dark_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).strength(50.0f, 1200.0f).mapColor(MapColor.BLACK)));
    /*public static final Block TRUE_DARK_TRIGGER = registerBlock("true_dark_trigger",
            new TrueDarkTriggerBlock(FabricBlockSettings.copyOf(ModBlocks.TRUE_DARK_BLOCK).strength(50.0f, 1200.0f).requiresTool().mapColor(MapColor.BLACK)));
    public static final Block TRUE_DARK_COVER = registerBlock("true_dark_cover",
            new TrueDarkCoverBlock(FabricBlockSettings.copyOf(ModBlocks.TRUE_DARK_BLOCK).strength(50.0f, 1200.0f).requiresTool().mapColor(MapColor.BLACK)));
    public static final Block TRUE_DARK_INTERSECTION = registerBlock("true_dark_intersection",
            new TrueDarkIntersectionBlock(FabricBlockSettings.copyOf(ModBlocks.TRUE_DARK_BLOCK).strength(50.0f, 1200.0f).requiresTool().mapColor(MapColor.BLACK)));*/

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DungeonDetour.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DungeonDetour.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DungeonDetour.LOGGER.info("Registering ModBlocks for " + DungeonDetour.MOD_ID);
    }
}


