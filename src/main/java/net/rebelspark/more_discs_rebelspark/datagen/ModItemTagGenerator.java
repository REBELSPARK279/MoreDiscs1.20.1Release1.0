package net.rebelspark.more_discs_rebelspark.datagen;

import net.minecraft.tags.ItemTags;
import net.minecraftforge.fml.common.Mod;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MoreDiscs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(
                        ModItems.DREITONDISC.get(),
                        ModItems.DRYHANDSDISC.get(),
                        ModItems.EXCUSE_DISC.get(),
                        ModItems.FLOATING_TREES_DISC.get(),
                        ModItems.HAUNT_MUSKIE_DISC.get(),
                        ModItems.HEADBUGDISC.get(),
                        ModItems.KEYDISC.get(),
                        ModItems.KIDISC.get(),
                        ModItems.SWEDEN_DISC.get(),

                        ModItems.ALPHA_MUSIC_DISC.get(),
                        ModItems.BLIND_SPOTS_DISC.get(),
                        ModItems.DOORDISC.get(),
                        ModItems.LIVING_MICE_DISC.get(),
                        ModItems.MOOG_CITY_DISC.get(),
                        ModItems.MUTATIONDISC.get()
                );

        this.tag(ItemTags.MUSIC_DISCS)
                .add(
                        ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.get(),
                        ModItems.ALPHA_MUSIC_DISC.get(),
                        ModItems.ARIA_MATH_MUSIC_DISC.get(),
                        ModItems.BACK_ON_DASH_DISC.get(),
                        ModItems.BEGINNING_DISC.get(),
                        ModItems.BEGINNING2_DISC.get(),
                        ModItems.BIOME_FEST_DISC.get(),
                        ModItems.BLIND_SPOTS_DISC.get(),
                        ModItems.CASTLEMANIADISC.get(),
                        ModItems.CASTLEMANIA2DISC.get(),
                        ModItems.CHRISDISC.get(),
                        ModItems.CLARKDISC.get(),
                        ModItems.DANNYDISC.get(),
                        ModItems.DEATHDISC.get(),
                        ModItems.DOGDISC.get(),
                        ModItems.DOORDISC.get(),
                        ModItems.DREITONDISC.get(),
                        ModItems.DRYHANDSDISC.get(),
                        ModItems.EXCUSE_DISC.get(),
                        ModItems.EXECUTIONER_DISC.get(),
                        ModItems.FLAKE_DISC.get(),
                        ModItems.FLOATING_TREES_DISC.get(),
                        ModItems.HAGGSTROMDISC.get(),
                        ModItems.HARDCOREMINECRAFTDISC.get(),
                        ModItems.HAUNT_MUSKIE_DISC.get(),
                        ModItems.HEADBUGDISC.get(),
                        ModItems.INVINCIBLEDISC.get(),
                        ModItems.KEYDISC.get(),
                        ModItems.KIDISC.get(),
                        ModItems.LIVING_MICE_DISC.get(),
                        ModItems.MICE_ON_VENUS_DISC.get(),
                        ModItems.MINECRAFTDISC.get(),
                        ModItems.MOOG_CITY_DISC.get(),
                        ModItems.MOOG_CITY2_DISC.get(),
                        ModItems.MUTATIONDISC.get(),
                        ModItems.SUBWOOFER_LULLABY_DISC.get(),
                        ModItems.SWEDEN_DISC.get(),
                        ModItems.TASWELL_DISC.get(),
                        ModItems.WET_HANDS_DISC.get()
                );

    }
}
