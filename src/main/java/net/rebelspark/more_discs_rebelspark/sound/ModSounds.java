package net.rebelspark.more_discs_rebelspark.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreDiscs.MOD_ID);


    public static final RegistryObject<SoundEvent> A_FAMILIAR_ROOM = registerSoundEvents("a_familiar_room");
    public static final RegistryObject<SoundEvent> ALPHA = registerSoundEvents("alpha");
    public static final RegistryObject<SoundEvent> ARIA_MATH = registerSoundEvents("aria_math");
    public static final RegistryObject<SoundEvent> BACK_ON_DASH = registerSoundEvents("back_on_dash");
    public static final RegistryObject<SoundEvent> BEGINNING = registerSoundEvents("beginning");
    public static final RegistryObject<SoundEvent> BEGINNING2 = registerSoundEvents("beginning2");
    public static final RegistryObject<SoundEvent> BIOME_FEST = registerSoundEvents("biome_fest");
    public static final RegistryObject<SoundEvent> BLIND_SPOTS = registerSoundEvents("blind_spots");
    public static final RegistryObject<SoundEvent> CASTLEMANIA = registerSoundEvents("castlemania");
    public static final RegistryObject<SoundEvent> CASTLEMANIA2 = registerSoundEvents("castlemania2");
    public static final RegistryObject<SoundEvent> CHRIS = registerSoundEvents("chris");
    public static final RegistryObject<SoundEvent> CLARK = registerSoundEvents("clark");
    public static final RegistryObject<SoundEvent> DANNY = registerSoundEvents("danny");
    public static final RegistryObject<SoundEvent> DEATH = registerSoundEvents("death");
    public static final RegistryObject<SoundEvent> DOG_ = registerSoundEvents("dog");
    public static final RegistryObject<SoundEvent> DOOR = registerSoundEvents("door");
    public static final RegistryObject<SoundEvent> DREITON = registerSoundEvents("dreiton");
    public static final RegistryObject<SoundEvent> DRY_HANDS = registerSoundEvents("dry_hands");
    public static final RegistryObject<SoundEvent> EXCUSE = registerSoundEvents("excuse");
    public static final RegistryObject<SoundEvent> EXECUTIONER = registerSoundEvents("executioner");
    public static final RegistryObject<SoundEvent> FLAKE = registerSoundEvents("flake");
    public static final RegistryObject<SoundEvent> FLOATING_TREES = registerSoundEvents("floating_trees");
    public static final RegistryObject<SoundEvent> HAGGSTROM = registerSoundEvents("haggstrom");
    public static final RegistryObject<SoundEvent> HARDCODEMINECRAFT = registerSoundEvents("hardcoreminecraft");
    public static final RegistryObject<SoundEvent> HAUNT_MUSKIE = registerSoundEvents("haunt_muskie");
    public static final RegistryObject<SoundEvent> HEADBUG = registerSoundEvents("headbug");
    public static final RegistryObject<SoundEvent> INVINCIBLE = registerSoundEvents("invincible");
    public static final RegistryObject<SoundEvent> KEY_ = registerSoundEvents("key");
    public static final RegistryObject<SoundEvent> KI__ = registerSoundEvents("ki");
    public static final RegistryObject<SoundEvent> LIVING_MICE = registerSoundEvents("living_mice");
    public static final RegistryObject<SoundEvent> MICE_ON_VENUS = registerSoundEvents("mice_on_venus");
    public static final RegistryObject<SoundEvent> MINECRAFT = registerSoundEvents("minecraft");
    public static final RegistryObject<SoundEvent> MOOG_CITY = registerSoundEvents("moog_city");
    public static final RegistryObject<SoundEvent> MOOG_CITY2 = registerSoundEvents("moog_city2");
    public static final RegistryObject<SoundEvent> MUTATION = registerSoundEvents("mutation");
    public static final RegistryObject<SoundEvent> SUBWOOFER_LULLABY = registerSoundEvents("subwoofer_lullaby");
    public static final RegistryObject<SoundEvent> SWEDEN = registerSoundEvents("sweden");
    public static final RegistryObject<SoundEvent> TASWELL = registerSoundEvents("taswell");
    public static final RegistryObject<SoundEvent> WET_HANDS = registerSoundEvents("wet_hands");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MoreDiscs.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
