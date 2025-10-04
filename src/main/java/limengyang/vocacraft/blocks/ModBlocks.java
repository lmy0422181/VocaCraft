package limengyang.vocacraft.blocks;

import limengyang.vocacraft.VocaCraft;
import limengyang.vocacraft.blocks.custom.DiscStack;
import limengyang.vocacraft.blocks.custom.DollBlock;
import limengyang.vocacraft.blocks.custom.ModCrops.MandarinBush;
import limengyang.vocacraft.blocks.custom.ModCrops.ScallionCrops;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //注册方块以及方块物品↓
    public static final Block DISC_STACK = register("disc_stack",
            new DiscStack(AbstractBlock.Settings.copy(Blocks.STONE).nonOpaque()));
    public static final Block DEFAULT_DOLL = register("default_doll",
            new DollBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block MIKU_DOLL = register("miku_doll",
            new DollBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).nonOpaque()));
    public static final Block TETO_DOLL = register("teto_doll",
            new DollBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).nonOpaque()));
    public static final Block RIN_DOLL = register("rin_doll",
            new DollBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).nonOpaque()));
    public static final Block SCALLION_CROP = Registry.register(Registries.BLOCK, new Identifier(VocaCraft.MOD_ID, "scallion_crop"),
            new ScallionCrops(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Block MANDARIN_CROP = Registry.register(Registries.BLOCK, new Identifier(VocaCraft.MOD_ID, "mandarin_crop"),
            new MandarinBush(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    //注册方法↓
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(VocaCraft.MOD_ID, id), block);
    }
    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(VocaCraft.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){

    }
}