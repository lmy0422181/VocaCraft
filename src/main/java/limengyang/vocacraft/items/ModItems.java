package limengyang.vocacraft.items;

import limengyang.vocacraft.VocaCraft;
import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.custom.ScallionSwordItem;
import limengyang.vocacraft.items.type.ModFoodComponents;
import limengyang.vocacraft.items.type.ModToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    //物品添加注册↓
    public static final Item SCALLION = register("scallion",
            new Item(new Item.Settings().food(ModFoodComponents.SCALLION)));
    public static final Item MANDARIN = register("mandarin",
            new Item(new Item.Settings().food(ModFoodComponents.MANDARIN)));
    public static final Item FRENCH_BREAD = register("french_bread",
            new Item(new Item.Settings().food(ModFoodComponents.FRENCH_BREAD)));
    public static final Item SCALLION_SEED = register("scallion_seed",
            new AliasedBlockItem(ModBlocks.SCALLION_CROP, new Item.Settings()));
    public static final Item MANDARIN_SEED = register("mandarin_seed",
            new AliasedBlockItem(ModBlocks.MANDARIN_CROP, new Item.Settings()));
    public static final Item SCALLION_SWORD = register("scallion_sword",
            new ScallionSwordItem(ModToolMaterial.SCALLION, 3, -2.4F, new Item.Settings()));
    public static final Item BLANK_DISC = register("blank_disc",
            new Item(new Item.Settings()));

    //注册方法↓
    public static Item register(String id, Item item) {
        return register(new Identifier(VocaCraft.MOD_ID, id), item);
    }
    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }
    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return (Item) Registry.register(Registries.ITEM, key, item);
    }
    public static void registerItems() {

    }
}
