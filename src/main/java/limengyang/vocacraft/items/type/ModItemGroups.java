package limengyang.vocacraft.items.type;

import limengyang.vocacraft.VocaCraft;
import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //添加物品栏Key
    public static final RegistryKey<ItemGroup> VOCACRAFT_ITEMS = register("vocacraft_items");
    public static final RegistryKey<ItemGroup> VOCACRAFT_BLOCKS = register("vocacraft_blocks");


    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(VocaCraft.MOD_ID, id));
    }

//添加物品栏
    public static void VocacraftItemsGroup() {
        Registry.register(
                Registries.ITEM_GROUP,
                VOCACRAFT_ITEMS,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.vocacraft_items"))
                        .icon(() -> new ItemStack(ModItems.LEEK))
                        .entries((displayContext, entries) -> {
							entries.add(ModItems.VOCA_DUST);
							entries.add(ModItems.VOCA_CRYSTAL);
                            entries.add(ModItems.LEEK);
                            entries.add(ModItems.MANDARIN);
                            entries.add(ModItems.BAGUETTE);
                            entries.add(ModItems.LEEK_SEED);
                            entries.add(ModItems.MANDARIN_SEED);
                            entries.add(ModItems.LEEK_SWORD);
							entries.add(ModItems.STAR_WAND);
                            entries.add(ModItems.BLANK_DISC);
                        })
                        .build());
    }
    public static void VocacraftBlocksGroup(){
        Registry.register(
                Registries.ITEM_GROUP,
                VOCACRAFT_BLOCKS,
                ItemGroup.create(ItemGroup.Row.TOP, 8)
                        .displayName(Text.translatable("itemGroup.vocacraft_blocks"))
                        .icon(() -> new ItemStack(ModBlocks.MIKU_DOLL))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.DISC_STACK);
                            entries.add(ModBlocks.DEFAULT_DOLL);
                            entries.add(ModBlocks.MIKU_DOLL);
                            entries.add(ModBlocks.TETO_DOLL);
                            entries.add(ModBlocks.RIN_DOLL);
							entries.add(ModBlocks.VOCA_CRYSTAL_BLOCK);
							entries.add(ModBlocks.BUDDING_VOCA_CRYSTAL);
							entries.add(ModBlocks.VOCA_CRYSTAL_CLUSTER);
							entries.add(ModBlocks.LARGE_VOCA_CRYSTAL_BUD);
							entries.add(ModBlocks.MEDIUM_VOCA_CRYSTAL_BUD);
							entries.add(ModBlocks.SMALL_VOCA_CRYSTAL_BUD);
                        })
                        .build());
    }
}