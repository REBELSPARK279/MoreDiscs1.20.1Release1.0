package net.rebelspark.more_discs_rebelspark.event;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.villager.ModVillagers;

import java.util.List;

@Mod.EventBusSubscriber(modid = MoreDiscs.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if(event.getType() == ModVillagers.DISC_JOCKEY.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.FLINT, 9), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.FLINT, 7), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.FLINT, 9), 16, 1, 0.02f));


            //COMMON

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.EXCUSE_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.EXCUSE_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.EXCUSE_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.EXCUSE_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.EXCUSE_DISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 20, 0.07f));

            //UNCOMMON

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.ALPHA_MUSIC_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.ALPHA_MUSIC_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.ALPHA_MUSIC_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.ALPHA_MUSIC_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.DOORDISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.DOORDISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.DOORDISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.DOORDISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 22),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 25, 0.07f));

            //RARE

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(ModItems.BEGINNING2_DISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 26),
                    new ItemStack(ModItems.BEGINNING2_DISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 21),
                    new ItemStack(ModItems.BEGINNING2_DISC.get(), 1), 10, 30, 0.07f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(ModItems.CHRISDISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 26),
                    new ItemStack(ModItems.CHRISDISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 21),
                    new ItemStack(ModItems.CHRISDISC.get(), 1), 10, 30, 0.07f));


            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(ModItems.SUBWOOFER_LULLABY_DISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 26),
                    new ItemStack(ModItems.SUBWOOFER_LULLABY_DISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 21),
                    new ItemStack(ModItems.SUBWOOFER_LULLABY_DISC.get(), 1), 10, 30, 0.07f));


            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(ModItems.WET_HANDS_DISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 26),
                    new ItemStack(ModItems.WET_HANDS_DISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 21),
                    new ItemStack(ModItems.WET_HANDS_DISC.get(), 1), 10, 30, 0.07f));

            //DISC JOCKEY EXCLUSIVE

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.BACK_ON_DASH_DISC.get(), 1), 10, 28, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 40),
                    new ItemStack(ModItems.BACK_ON_DASH_DISC.get(), 1), 10, 35, 0.07f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.DEATHDISC.get(), 1), 10, 28, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 40),
                    new ItemStack(ModItems.DEATHDISC.get(), 1), 10, 35, 0.07f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.EXECUTIONER_DISC.get(), 1), 10, 28, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 40),
                    new ItemStack(ModItems.EXECUTIONER_DISC.get(), 1), 10, 35, 0.07f));

            //EPIC

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 52),
                    new ItemStack(ModItems.BIOME_FEST_DISC.get(), 1), 10, 40, 0.07f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 52),
                    new ItemStack(ModItems.HAGGSTROMDISC.get(), 1), 10, 40, 0.07f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 52),
                    new ItemStack(ModItems.MICE_ON_VENUS_DISC.get(), 1), 10, 40, 0.07f));

        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                new ItemStack(Items.FLINT, 8), 8, 4, 0.15f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.DREITONDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.HEADBUGDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.KIDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 3, 4, 0.25f));

        //UNCOMMON

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.ALPHA_MUSIC_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.DOORDISC.get(), 1), 3,4,0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 14),
                new ItemStack(ModItems.MUTATIONDISC.get(), 1), 3, 4, 0.25f));

        //EXCLUSIVE

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 52),
                new ItemStack(ModItems.CASTLEMANIA2DISC.get(), 1), 3, 4, 0.25f));

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 52),
                new ItemStack(ModItems.HARDCOREMINECRAFTDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 46),
                new ItemStack(ModItems.BEGINNING_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 46),
                new ItemStack(ModItems.CASTLEMANIADISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 46),
                new ItemStack(ModItems.INVINCIBLEDISC.get(), 1), 3, 4, 0.25f));

    }
}
