package net.rebelspark.more_discs_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.loot.AddItemModifier;
import net.rebelspark.more_discs_rebelspark.util.ModTags;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, MoreDiscs.MOD_ID);
    }

    @Override
    protected void start() {

        //A FAMILIAR ROOM

        add("a_familiar_room_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.0625f).build()}, ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.get()));
        add("a_familiar_room_from_igloo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.0475f).build()}, ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.get()));
        add("a_familiar_room_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.03f).build()}, ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.get()));

        //ARIA MATH

        add("aria_math_from_blaze", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/blaze")).build(),
                LootItemRandomChanceCondition.randomChance(0.013f).build()}, ModItems.ARIA_MATH_MUSIC_DISC.get()));
        add("aria_math_from_magma_cube", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/magma_cube")).build(),
                LootItemRandomChanceCondition.randomChance(0.009f).build()}, ModItems.ARIA_MATH_MUSIC_DISC.get()));


        //BIOME FEST

        add("biome_fest_from_mooshroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/mooshroom")).build(),
                LootItemRandomChanceCondition.randomChance(0.1175f).build()}, ModItems.BIOME_FEST_DISC.get()));
        add("biome_fest_from_mansion", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.165f).build()}, ModItems.BIOME_FEST_DISC.get()));
        add("biome_fest_from_fishing_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.14f).build()}, ModItems.BIOME_FEST_DISC.get()));

        //BEGINNING 2

        add("beginning2_from_chorus_plant", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("blocks/chorus_plant")).build(),
                LootItemRandomChanceCondition.randomChance(0.06f).build()}, ModItems.BEGINNING2_DISC.get()));

        //CHRIS

        add("chris_from_igloo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.28f).build()}, ModItems.CHRISDISC.get()));
        add("chris_from_ice", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("blocks/ice")).build(),
                LootItemRandomChanceCondition.randomChance(0.054f).build()}, ModItems.CHRISDISC.get()));
        add("chris_from_stray", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/stray")).build(),
                LootItemRandomChanceCondition.randomChance(0.16f).build()}, ModItems.CHRISDISC.get()));


        //CLARK

        add("clark_from_yellow_sheep", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/sheep/yellow")).build(),
                LootItemRandomChanceCondition.randomChance(0.13f).build()}, ModItems.CLARKDISC.get()));
        add("clark_from_fortress", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()}, ModItems.CLARKDISC.get()));

        //DANNY

        add("danny_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.12f).build()}, ModItems.DANNYDISC.get()));
        add("danny_from_stronghold_crossing", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build(),
                LootItemRandomChanceCondition.randomChance(0.125f).build()}, ModItems.DANNYDISC.get()));
        add("danny_from_end_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.13f).build()}, ModItems.DANNYDISC.get()));


        //DOG
        add("dog_from_woodland_mansion", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.12f).build()}, ModItems.DOGDISC.get()));
        add("dog_frag_from_skeletons", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.13f).build()}, ModItems.DOG_DISC_FRAGMENT.get()));
         add("dog_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.DOGDISC.get()));

         //FLAKE

        add("flake_from_desert_well_archeology", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_well")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.FLAKE_DISC.get()));
        add("flake_from_desert_pyramid_archeology", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.FLAKE_DISC.get()));


        //HAGGSTROM

       add("haggstrom_from_fishers_house", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fisher")).build(),
                LootItemRandomChanceCondition.randomChance(0.175f).build()}, ModItems.HAGGSTROMDISC.get()));
       add("haggstrom_from_cherry_leaves", new AddItemModifier(new LootItemCondition[]{
               new LootTableIdCondition.Builder(new ResourceLocation("blocks/cherry_leaves")).build(),
               LootItemRandomChanceCondition.randomChance(0.015f).build()}, ModItems.HAGGSTROMDISC.get()));
        add("haggstrom_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.1562f).build()}, ModItems.HAGGSTROMDISC.get()));

        //MICE ON VENUS

        add("mice_on_venus_from_desert_pyramid_archaeology", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.0654f).build()}, ModItems.MICE_ON_VENUS_DISC.get()));
        add("mice_on_venus_from_desert_well_archaeology", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_well")).build(),
                LootItemRandomChanceCondition.randomChance(0.0872f).build()}, ModItems.MICE_ON_VENUS_DISC.get()));
        add("mice_on_venus_from_buried_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.122f).build()}, ModItems.MICE_ON_VENUS_DISC.get()));
        add("mice_on_venus_from_ruined_portal", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build(),
                LootItemRandomChanceCondition.randomChance(0.157f).build()}, ModItems.MICE_ON_VENUS_DISC.get()));

        //MINECRAFT
        add("minecraft_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.027f).build()}, ModItems.MINECRAFTDISC.get()));
        add("minecraft_from_mineshaft", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.021f).build()}, ModItems.MINECRAFTDISC.get()));

        add("minecraft_frag_from_grass_block", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("blocks/grass_block")).build(),
                LootItemRandomChanceCondition.randomChance(0.035f).build()}, ModItems.MINECRAFT_DISC_FRAGMENT.get()));


        //MOOG CITY 2 DISC
        add("moog_city_2_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.152f).build()}, ModItems.MOOG_CITY2_DISC.get()));

        //FRAG

        add("moog_city_2frag_from_stone", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("blocks/stone")).build(),
                LootItemRandomChanceCondition.randomChance(0.035f).build()}, ModItems.MOOG_CITY2_DISC_FRAGMENT.get()));
        add("moog_city_2frag_from_iron_golem", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/iron_golem")).build(),
                LootItemRandomChanceCondition.randomChance(0.0835f).build()}, ModItems.MOOG_CITY2_DISC_FRAGMENT.get()));

        //SUBWOOFER LULLABY

        add("subwoofer_lullaby_from_pink_sheep", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/sheep/pink")).build(),
                LootItemRandomChanceCondition.randomChance(0.13f).build()}, ModItems.SUBWOOFER_LULLABY_DISC.get()));

        //TASWELL

        add("taswell_from_ender_dragon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build()
                }, ModItems.TASWELL_DISC.get()));

        //WET HANDS

        add("wet_hands_from_sea_lantern", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("blocks/sea_lantern")).build(),
                LootItemRandomChanceCondition.randomChance(0.27f).build()}, ModItems.WET_HANDS_DISC.get()));
        add("wet_hands_from_fishing_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.19f).build()}, ModItems.WET_HANDS_DISC.get()));

    }
}




