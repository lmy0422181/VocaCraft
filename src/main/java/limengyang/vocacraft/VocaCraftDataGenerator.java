package limengyang.vocacraft;

import limengyang.vocacraft.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VocaCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagsProvider::new);//方块标签生成
        pack.addProvider(ModItemTagsProvider::new);//物品标签生成
        pack.addProvider(ModEnUsLangProvider::new);//英语语言文件生成
        pack.addProvider(ModZhCnLangProvider::new);//中文语言文件生成
        pack.addProvider(ModLootTableProvider::new);//掉落物生成
        pack.addProvider(ModModelsProvider::new);//模型生成
        pack.addProvider(ModRecipesProvider::new);//合成表生成
        pack.addProvider(ModPointTagsProvider::new);//村民兴趣点生成
	}
}
