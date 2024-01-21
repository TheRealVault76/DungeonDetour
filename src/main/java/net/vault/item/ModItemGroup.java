package net.vault.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.vault.dungeondetour.DungeonDetour;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vault.dungeondetour.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup SPACE_NEEDLE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DungeonDetour.MOD_ID, "space_needle"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.space_needle"))
                    .icon(() -> new ItemStack(ModItems.SPACE_NEEDLE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SPACE_NEEDLE);
                        entries.add(ModBlocks.TRUE_DARK_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        DungeonDetour.LOGGER.info("Registering Item Groups for " + DungeonDetour.MOD_ID);
    }
}
