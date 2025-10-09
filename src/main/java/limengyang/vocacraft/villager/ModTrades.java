package limengyang.vocacraft.villager;

import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerTrades(){
        //添加村民交易
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories ->{
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.LEEK, 15, 20, 3));
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.MANDARIN, 15, 20, 3));
            factories.add(new TradeOffers.SellItemFactory(ModItems.LEEK_SEED.getDefaultStack(), 5, 20, 5, 5, 0.09F));
            factories.add(new TradeOffers.SellItemFactory(ModItems.MANDARIN_SEED.getDefaultStack(), 5, 20, 5, 5, 0.09F));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.BAGUETTE.getDefaultStack(), 5, 8, 5, 5, 0.03f));
            factories.add(new TradeOffers.ProcessItemFactory(Items.WHEAT, 10, 1, ModItems.BAGUETTE, 5, 8, 4));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_MERCHANT, 1, factories ->{
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(Blocks.GLASS.asItem(), 15, 4, 3));
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(Items.BLACK_DYE, 5, 7, 2));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_MERCHANT, 2, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLANK_DISC, 2, 5, 5));
			factories.add(new TradeOffers.SellItemFactory(ModItems.VOCA_DUST, 1, 5, 10));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_MERCHANT, 3, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLANK_DISC, 2, 5, 5));
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(Blocks.GLASS.asItem(), 15, 15, 3));
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(Items.BLACK_DYE, 5, 15, 2));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_13, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_CAT, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_FAR, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_BLOCKS, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_CHIRP, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_MALL, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_MELLOHI, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_OTHERSIDE, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_PIGSTEP, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_RELIC, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_STAL, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_STRAD, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_WAIT, 5, 1, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_WARD, 5, 1, 5));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_MERCHANT, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_13, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_CAT, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_FAR, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_BLOCKS, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_CHIRP, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_MALL, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_MELLOHI, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_OTHERSIDE, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_PIGSTEP, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_RELIC, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_STAL, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_STRAD, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_WAIT, 5, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Items.MUSIC_DISC_WARD, 5, 1, 10));
        });
    }
}
