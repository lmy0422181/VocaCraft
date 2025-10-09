package limengyang.vocacraft.blocks;

import limengyang.vocacraft.VocaCraft;
import limengyang.vocacraft.blocks.custom.BuddingVocaCrystalBlock;
import limengyang.vocacraft.blocks.custom.DiscStack;
import limengyang.vocacraft.blocks.custom.DollBlock;
import limengyang.vocacraft.blocks.custom.ModCrops.MandarinBush;
import limengyang.vocacraft.blocks.custom.ModCrops.LeekCrops;
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
    public static final Block LEEK_CROP = Registry.register(Registries.BLOCK, new Identifier(VocaCraft.MOD_ID, "leek_crop"),
            new LeekCrops(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Block MANDARIN_CROP = Registry.register(Registries.BLOCK, new Identifier(VocaCraft.MOD_ID, "mandarin_crop"),
            new MandarinBush(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

	public static final Block VOCA_CRYSTAL_BLOCK = register("voca_crystal_block",
			new AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
	public static final Block BUDDING_VOCA_CRYSTAL = register("budding_voca_crystal",
			new BuddingVocaCrystalBlock(AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST)));
	public static final Block VOCA_CRYSTAL_CLUSTER = register("voca_crystal_cluster",
			new AmethystClusterBlock(7, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER)));
	public static final Block LARGE_VOCA_CRYSTAL_BUD = register("large_voca_crystal_bud",
			new AmethystClusterBlock(5,3, AbstractBlock.Settings.copy(Blocks.LARGE_AMETHYST_BUD)));
	public static final Block MEDIUM_VOCA_CRYSTAL_BUD = register("medium_voca_crystal_bud",
			new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.MEDIUM_AMETHYST_BUD)));
	public static final Block SMALL_VOCA_CRYSTAL_BUD = register("small_voca_crystal_bud",
			new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.SMALL_AMETHYST_BUD)));

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