package net.rebelspark.more_discs_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreDiscs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC);
        simpleItem(ModItems.ALPHA_MUSIC_DISC);
        simpleItem(ModItems.ARIA_MATH_MUSIC_DISC);
        simpleItem(ModItems.BACK_ON_DASH_DISC);
        simpleItem(ModItems.BEGINNING_DISC);
        simpleItem(ModItems.BEGINNING2_DISC);
        simpleItem(ModItems.BIOME_FEST_DISC);
        simpleItem(ModItems.BLIND_SPOTS_DISC);
        simpleItem(ModItems.CASTLEMANIADISC);
        simpleItem(ModItems.CASTLEMANIA2DISC);
        simpleItem(ModItems.CHRISDISC);
        simpleItem(ModItems.CLARKDISC);
        simpleItem(ModItems.DANNYDISC);
        simpleItem(ModItems.DEATHDISC);
        simpleItem(ModItems.DOGDISC);
        simpleItem(ModItems.DOORDISC);
        simpleItem(ModItems.DREITONDISC);
        simpleItem(ModItems.DRYHANDSDISC);
        simpleItem(ModItems.EXCUSE_DISC);
        simpleItem(ModItems.EXECUTIONER_DISC);
        simpleItem(ModItems.FLAKE_DISC);
        simpleItem(ModItems.FLOATING_TREES_DISC);
        simpleItem(ModItems.HAGGSTROMDISC);
        simpleItem(ModItems.HARDCOREMINECRAFTDISC);
        simpleItem(ModItems.HAUNT_MUSKIE_DISC);
        simpleItem(ModItems.HEADBUGDISC);
        simpleItem(ModItems.INVINCIBLEDISC);
        simpleItem(ModItems.KEYDISC);
        simpleItem(ModItems.KIDISC);
        simpleItem(ModItems.LIVING_MICE_DISC);
        simpleItem(ModItems.MICE_ON_VENUS_DISC);
        simpleItem(ModItems.MINECRAFTDISC);
        simpleItem(ModItems.MOOG_CITY_DISC);
        simpleItem(ModItems.MOOG_CITY2_DISC);
        simpleItem(ModItems.MUTATIONDISC);
        simpleItem(ModItems.SUBWOOFER_LULLABY_DISC);
        simpleItem(ModItems.SWEDEN_DISC);
        simpleItem(ModItems.TASWELL_DISC);
        simpleItem(ModItems.WET_HANDS_DISC);

        simpleItem(ModItems.DOG_DISC_FRAGMENT);
        simpleItem(ModItems.MINECRAFT_DISC_FRAGMENT);
        simpleItem(ModItems.MOOG_CITY2_DISC_FRAGMENT);

        simpleItem(ModItems.EMPTY_DISC_CORE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreDiscs.MOD_ID, "item/" + item.getId().getPath()));
    }
}
