package com.benji.netherman.init;

import com.benji.netherman.NetherExp;
import com.benji.netherman.common.effect.ManipulationEffect;
import com.benji.netherman.common.effect.ZoneEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, NetherExp.MODID);

    public static final DeferredHolder<MobEffect, ManipulationEffect> MANIPULATION_EFFECT = EFFECTS.register("manipulation", ManipulationEffect::new);
    public static final DeferredHolder<MobEffect, ZoneEffect> FEAR_EFFECT = EFFECTS.register("fear", () -> new ZoneEffect(0x000000));
    public static final DeferredHolder<MobEffect, ZoneEffect> EXCITEMENT_EFFECT = EFFECTS.register("excitement", () -> new ZoneEffect(0xFF0000));
    public static final DeferredHolder<MobEffect, ZoneEffect> FAITH_EFFECT = EFFECTS.register("faith", () -> new ZoneEffect(0x800080));
    public static final DeferredHolder<MobEffect, ZoneEffect> ANXIETY_EFFECT = EFFECTS.register("anxiety", () -> new ZoneEffect(0x8B0000));

    public static void init(IEventBus bus) {
        EFFECTS.register(bus);
    }
}
