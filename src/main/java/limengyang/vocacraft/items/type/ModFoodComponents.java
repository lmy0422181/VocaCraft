package limengyang.vocacraft.items.type;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    //添加食物
    public static final FoodComponent FRENCH_BREAD = new FoodComponent.Builder().hunger(8).saturationModifier(1.2F).build();
    public static final FoodComponent SCALLION = new FoodComponent.Builder().hunger(3).saturationModifier(0.6F).snack().build();
    public static final FoodComponent MANDARIN = new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).snack().build();
}
