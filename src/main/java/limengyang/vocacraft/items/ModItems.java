package limengyang.vocacraft.items;

import limengyang.vocacraft.VocaCraft;
import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.custom.LeekSwordItem;
import limengyang.vocacraft.items.custom.StarWandItem;
import limengyang.vocacraft.items.type.ModFoodComponents;
import limengyang.vocacraft.items.type.ModToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //物品添加注册↓
    public static final Item LEEK = register("leek",
            new Item(new Item.Settings().food(ModFoodComponents.LEEK)));
    public static final Item MANDARIN = register("mandarin",
            new Item(new Item.Settings().food(ModFoodComponents.MANDARIN)));
    public static final Item BAGUETTE = register("baguette",
            new Item(new Item.Settings().food(ModFoodComponents.BAGUETTE)));
    public static final Item LEEK_SEED = register("leek_seed",
            new AliasedBlockItem(ModBlocks.LEEK_CROP, new Item.Settings()));
    public static final Item MANDARIN_SEED = register("mandarin_seed",
            new AliasedBlockItem(ModBlocks.MANDARIN_CROP, new Item.Settings()));
    public static final Item LEEK_SWORD = register("leek_sword",
            new LeekSwordItem(ModToolMaterial.LEEK, 3, -2.4F, new Item.Settings()));
	public static final Item STAR_WAND = register("star_wand",
			new StarWandItem(ModToolMaterial.VOCA_CRYSTAL, 5, -2.9F, new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item BLANK_DISC = register("blank_disc",
            new Item(new Item.Settings()));
	public static final Item VOCA_CRYSTAL = register("voca_crystal",
			new Item(new Item.Settings().rarity(Rarity.RARE)));
	public static final Item VOCA_DUST = register("voca_dust",
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
