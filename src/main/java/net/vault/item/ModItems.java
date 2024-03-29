package net.vault.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.vault.dungeondetour.DungeonDetour;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPACE_NEEDLE = registerItem("space_needle",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DungeonDetour.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DungeonDetour.LOGGER.info("Registering Mod Items for " + DungeonDetour.MOD_ID);
    }
}
