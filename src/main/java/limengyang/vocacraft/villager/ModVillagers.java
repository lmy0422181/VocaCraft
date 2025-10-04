package limengyang.vocacraft.villager;

import com.google.common.collect.ImmutableSet;
import limengyang.vocacraft.VocaCraft;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Nullable;

public class ModVillagers {
    //添加村民
    public static final VillagerProfession DISC_MERCHANT = register("disc_merchant",
            ModPointOfInterestTypes.DISC_POI, SoundEvents.UI_STONECUTTER_TAKE_RESULT);
    public static final PointOfInterestType DISC_POI = registerPoints("disc_poi", Blocks.JUKEBOX);

    public static VillagerProfession register(String id, RegistryKey<PointOfInterestType> heldWorkstation, @Nullable SoundEvent workSound) {
        return Registry.register(Registries.VILLAGER_PROFESSION ,new Identifier(VocaCraft.MOD_ID, id),
                new VillagerProfession(id, entry -> entry.matchesKey(heldWorkstation), entry -> entry.matchesKey(heldWorkstation),
                        ImmutableSet.of(), ImmutableSet.of(), workSound));
    }

    public static PointOfInterestType registerPoints(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(VocaCraft.MOD_ID, name), 1, 1, block);
    }
    public static void ModVillages() {

    }
}
