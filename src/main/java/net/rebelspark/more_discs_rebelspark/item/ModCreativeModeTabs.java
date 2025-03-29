package net.rebelspark.more_discs_rebelspark.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDiscs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_DISCS_TAB = CREATIVE_MODE_TABS.register("mod_discs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALPHA_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.more_discs_rebelspark.mod_discs"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.EMPTY_DISC_CORE.get());

                        pOutput.accept(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ALPHA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ARIA_MATH_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BACK_ON_DASH_DISC.get());
                        pOutput.accept(ModItems.BEGINNING_DISC.get());
                        pOutput.accept(ModItems.BEGINNING2_DISC.get());
                        pOutput.accept(ModItems.BIOME_FEST_DISC.get());
                        pOutput.accept(ModItems.BLIND_SPOTS_DISC.get());
                        pOutput.accept(ModItems.CASTLEMANIADISC.get());
                        pOutput.accept(ModItems.CASTLEMANIA2DISC.get());
                        pOutput.accept(ModItems.CHRISDISC.get());
                        pOutput.accept(ModItems.CLARKDISC.get());
                        pOutput.accept(ModItems.DANNYDISC.get());
                        pOutput.accept(ModItems.DEATHDISC.get());
                        pOutput.accept(ModItems.DOGDISC.get());
                        pOutput.accept(ModItems.DOORDISC.get());
                        pOutput.accept(ModItems.DREITONDISC.get());
                        pOutput.accept(ModItems.DRYHANDSDISC.get());
                        pOutput.accept(ModItems.EXCUSE_DISC.get());
                        pOutput.accept(ModItems.EXECUTIONER_DISC.get());
                        pOutput.accept(ModItems.FLAKE_DISC.get());
                        pOutput.accept(ModItems.FLOATING_TREES_DISC.get());
                        pOutput.accept(ModItems.HAGGSTROMDISC.get());
                        pOutput.accept(ModItems.HARDCOREMINECRAFTDISC.get());
                        pOutput.accept(ModItems.HAUNT_MUSKIE_DISC.get());
                        pOutput.accept(ModItems.HEADBUGDISC.get());
                        pOutput.accept(ModItems.INVINCIBLEDISC.get());
                        pOutput.accept(ModItems.KEYDISC.get());
                        pOutput.accept(ModItems.KIDISC.get());
                        pOutput.accept(ModItems.LIVING_MICE_DISC.get());
                        pOutput.accept(ModItems.MICE_ON_VENUS_DISC.get());
                        pOutput.accept(ModItems.MINECRAFTDISC.get());
                        pOutput.accept(ModItems.MOOG_CITY_DISC.get());
                        pOutput.accept(ModItems.MOOG_CITY2_DISC.get());
                        pOutput.accept(ModItems.MUTATIONDISC.get());
                        pOutput.accept(ModItems.SUBWOOFER_LULLABY_DISC.get());
                        pOutput.accept(ModItems.SWEDEN_DISC.get());
                        pOutput.accept(ModItems.TASWELL_DISC.get());
                        pOutput.accept(ModItems.WET_HANDS_DISC.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MOD_DISC_FRAGMENT_TAB = CREATIVE_MODE_TABS.register("mod_disc_fragments_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOOG_CITY2_DISC_FRAGMENT.get()))
                    .title(Component.translatable("creativetab.more_discs_rebelspark.mod_disc_fragments"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.DOG_DISC_FRAGMENT.get());
                        pOutput.accept(ModItems.MINECRAFT_DISC_FRAGMENT.get());
                        pOutput.accept(ModItems.MOOG_CITY2_DISC_FRAGMENT.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
