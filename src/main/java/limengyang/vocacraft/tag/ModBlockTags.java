package limengyang.vocacraft.tag;

import limengyang.vocacraft.VocaCraft;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(VocaCraft.MOD_ID, id));
    }
}
