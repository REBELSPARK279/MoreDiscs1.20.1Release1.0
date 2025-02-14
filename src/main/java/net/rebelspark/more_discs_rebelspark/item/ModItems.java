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

    public static final RegistryObject<Item> ALPHA_MUSIC_DISC = ITEMS.register("alpha_music_disc",
            () -> new RecordItem(1, ModSounds.ALPHA,new Item.Properties().stacksTo(1), 3020){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                    pTooltip.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
                }
            });





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
