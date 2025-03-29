package net.rebelspark.more_discs_rebelspark.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreDiscs.MOD_ID);


    //DISC FRAGS

    public static final RegistryObject<Item> DOG_DISC_FRAGMENT = ITEMS.register("dog_disc_fragment",
            () -> new Item(new Item.Properties().stacksTo(8)) {});

    public static final RegistryObject<Item> MOOG_CITY2_DISC_FRAGMENT = ITEMS.register("moog_city2_disc_fragment",
            () -> new Item(new Item.Properties().stacksTo(8)) {});

    public static final RegistryObject<Item> MINECRAFT_DISC_FRAGMENT = ITEMS.register("minecraft_disc_fragment",
            () -> new Item(new Item.Properties().stacksTo(8)) {});

    public static final RegistryObject<Item> EMPTY_DISC_CORE = ITEMS.register("empty_disc_core",
            () -> new Item(new Item.Properties().stacksTo(16)) {});

    //DISCS

    //A

    public static final RegistryObject<Item> A_FAMILIAR_ROOM_MUSIC_DISC = ITEMS.register("a_familiar_room_music_disc",
            () -> new RecordItem(7, ModSounds.A_FAMILIAR_ROOM,new Item.Properties().stacksTo(1), 4840) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });

    public static final RegistryObject<Item> ALPHA_MUSIC_DISC = ITEMS.register("alpha_music_disc",
            () -> new RecordItem(12, ModSounds.ALPHA,new Item.Properties().stacksTo(1), 3020) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });

    public static final RegistryObject<Item> ARIA_MATH_MUSIC_DISC = ITEMS.register("aria_math_music_disc",
            () -> new RecordItem(4, ModSounds.ARIA_MATH,new Item.Properties().stacksTo(1), 6220) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });

    public static final RegistryObject<Item> BACK_ON_DASH_DISC = ITEMS.register("back_on_dash_music_disc",
            () -> new RecordItem(6, ModSounds.BACK_ON_DASH, new Item.Properties().stacksTo(1), 3750) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.vill_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });

    public static final RegistryObject<Item> BEGINNING_DISC = ITEMS.register("beginning_music_disc",
            () -> new RecordItem(5, ModSounds.BEGINNING, new Item.Properties().stacksTo(1), 2080) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> BEGINNING2_DISC = ITEMS.register("beginning2_music_disc",
            () -> new RecordItem(2, ModSounds.BEGINNING2, new Item.Properties().stacksTo(1), 3560) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> BIOME_FEST_DISC = ITEMS.register("biome_fest_music_disc",
            () -> new RecordItem(13, ModSounds.BIOME_FEST, new Item.Properties().stacksTo(1), 7600) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> BLIND_SPOTS_DISC = ITEMS.register("blind_spots_music_disc",
            () -> new RecordItem(8, ModSounds.BLIND_SPOTS, new Item.Properties().stacksTo(1), 6660) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> CASTLEMANIADISC = ITEMS.register("castlemania_music_disc",
            () -> new RecordItem(1, ModSounds.CASTLEMANIA, new Item.Properties().stacksTo(1), 4100) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> CASTLEMANIA2DISC = ITEMS.register("castlemania2_music_disc",
            () -> new RecordItem(2, ModSounds.CASTLEMANIA2, new Item.Properties().stacksTo(1), 5920) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_wandy-t_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> CHRISDISC = ITEMS.register("chris_music_disc",
            () -> new RecordItem(8, ModSounds.CHRIS, new Item.Properties().stacksTo(1), 1760) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });


    public static final RegistryObject<Item> CLARKDISC = ITEMS.register("clark_music_disc",
            () -> new RecordItem(6, ModSounds.CLARK, new Item.Properties().stacksTo(1), 3860) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> DANNYDISC = ITEMS.register("danny_music_disc",
            () -> new RecordItem(13, ModSounds.DANNY, new Item.Properties().stacksTo(1), 5140) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> DEATHDISC = ITEMS.register("death_music_disc",
            () -> new RecordItem(15, ModSounds.DEATH, new Item.Properties().stacksTo(1), 860) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.vill_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> DOGDISC = ITEMS.register("dog_music_disc",
            () -> new RecordItem(11, ModSounds.DOG_, new Item.Properties().stacksTo(1), 2940) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> DOORDISC = ITEMS.register("door_music_disc",
            () -> new RecordItem(3, ModSounds.DOOR, new Item.Properties().stacksTo(1), 2220) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> DREITONDISC = ITEMS.register("dreiton_music_disc",
            () -> new RecordItem(12, ModSounds.DREITON, new Item.Properties().stacksTo(1), 9980) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> DRYHANDSDISC = ITEMS.register("dry_hands_music_disc",
            () -> new RecordItem(14, ModSounds.DRY_HANDS, new Item.Properties().stacksTo(1), 1400) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> EXCUSE_DISC = ITEMS.register("excuse_music_disc",
            () -> new RecordItem(4, ModSounds.EXCUSE, new Item.Properties().stacksTo(1), 2500) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> EXECUTIONER_DISC = ITEMS.register("executioner_music_disc",
            () -> new RecordItem(10, ModSounds.EXECUTIONER, new Item.Properties().stacksTo(1), 1820) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.vill_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> FLAKE_DISC = ITEMS.register("flake_music_disc",
        () -> new RecordItem(2, ModSounds.FLAKE, new Item.Properties().stacksTo(1), 3420) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> FLOATING_TREES_DISC = ITEMS.register("floating_trees_music_disc",
            () -> new RecordItem(7, ModSounds.FLOATING_TREES, new Item.Properties().stacksTo(1), 4920) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> HAGGSTROMDISC = ITEMS.register("haggstrom_music_disc",
            () -> new RecordItem(1, ModSounds.HAGGSTROM, new Item.Properties().stacksTo(1), 4120) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> HARDCOREMINECRAFTDISC = ITEMS.register("hardcoreminecraft_music_disc",
            () -> new RecordItem(3, ModSounds.HARDCODEMINECRAFT, new Item.Properties().stacksTo(1), 3860) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_wandy-t_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> HAUNT_MUSKIE_DISC = ITEMS.register("haunt_muskie_music_disc",
        () -> new RecordItem(10, ModSounds.HAUNT_MUSKIE, new Item.Properties().stacksTo(1), 7260) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> HEADBUGDISC = ITEMS.register("headbug_music_disc",
            () -> new RecordItem(5, ModSounds.HEADBUG, new Item.Properties().stacksTo(1), 6420) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> INVINCIBLEDISC = ITEMS.register("invincible_music_disc",
            () -> new RecordItem(7, ModSounds.INVINCIBLE, new Item.Properties().stacksTo(1), 5500) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> KEYDISC = ITEMS.register("key_music_disc",
            () -> new RecordItem(1, ModSounds.KEY_, new Item.Properties().stacksTo(1), 1340) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> KIDISC = ITEMS.register("ki_music_disc",
            () -> new RecordItem(6, ModSounds.KI__, new Item.Properties().stacksTo(1), 1860) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> LIVING_MICE_DISC = ITEMS.register("living_mice_music_disc",
            () -> new RecordItem(4, ModSounds.LIVING_MICE, new Item.Properties().stacksTo(1), 3580) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
    });

    public static final RegistryObject<Item> MICE_ON_VENUS_DISC = ITEMS.register("mice_on_venus_music_disc",
            () -> new RecordItem(11, ModSounds.MICE_ON_VENUS, new Item.Properties().stacksTo(1), 5660) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> MINECRAFTDISC = ITEMS.register("minecraft_music_disc",
            () -> new RecordItem(8, ModSounds.MINECRAFT, new Item.Properties().stacksTo(1), 5120) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> MOOG_CITY_DISC = ITEMS.register("moog_city_music_disc",
            () -> new RecordItem(3, ModSounds.MOOG_CITY, new Item.Properties().stacksTo(1), 3620) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> MOOG_CITY2_DISC = ITEMS.register("moog_city2_music_disc",
            () -> new RecordItem(5, ModSounds.MOOG_CITY2, new Item.Properties().stacksTo(1), 3620) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> MUTATIONDISC = ITEMS.register("mutation_music_disc",
            () -> new RecordItem(14, ModSounds.MUTATION, new Item.Properties().stacksTo(1), 3740) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> SUBWOOFER_LULLABY_DISC = ITEMS.register("subwoofer_lullaby_music_disc",
            () -> new RecordItem(9, ModSounds.SUBWOOFER_LULLABY, new Item.Properties().stacksTo(1), 4180) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> SWEDEN_DISC = ITEMS.register("sweden_music_disc",
            () -> new RecordItem(9, ModSounds.SWEDEN, new Item.Properties().stacksTo(1), 4340) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });

    public static final RegistryObject<Item> TASWELL_DISC = ITEMS.register("taswell_music_disc",
            () -> new RecordItem(9, ModSounds.TASWELL, new Item.Properties().stacksTo(1), 10320) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });

    public static final RegistryObject<Item> WET_HANDS_DISC = ITEMS.register("wet_hands_music_disc",
            () -> new RecordItem(15, ModSounds.WET_HANDS, new Item.Properties().stacksTo(1), 1840) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
            super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        }
    });






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
