package limengyang.vocacraft.villager;

import limengyang.vocacraft.VocaCraft;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;

public class ModPointOfInterestTypes {
    //村民兴趣点
    public static final RegistryKey<PointOfInterestType> DISC_POI = of("disc_poi");
    private static RegistryKey<PointOfInterestType> of(String id) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(VocaCraft.MOD_ID, id));
    }
}
