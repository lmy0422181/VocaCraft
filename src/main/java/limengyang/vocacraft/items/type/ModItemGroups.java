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
                        .icon(() -> new ItemStack(ModItems.SCALLION))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.SCALLION);
                            entries.add(ModItems.MANDARIN);
                            entries.add(ModItems.FRENCH_BREAD);
                            entries.add(ModItems.SCALLION_SEED);
                            entries.add(ModItems.MANDARIN_SEED);
                            entries.add(ModItems.SCALLION_SWORD);
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
                        })
                        .build());
    }
}