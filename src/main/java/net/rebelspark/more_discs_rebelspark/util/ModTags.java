package net.rebelspark.more_discs_rebelspark.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> DANCE_FLOORS = tag("dance_floors");
        public static final TagKey<Block> PARTY_BLOCKS = tag("party_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MoreDiscs.MOD_ID, name));
        }
    }

    public static class Items {




        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MoreDiscs.MOD_ID, name));
        }
    }
}
