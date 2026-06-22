package com.benji.netherman.network;

import com.benji.netherman.NetherExp;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;


public record TotemAnimationPayload(ItemStack stack) implements CustomPacketPayload {

    
    public static final Type<TotemAnimationPayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "totem_animation"));

    
    public static final StreamCodec<RegistryFriendlyByteBuf, TotemAnimationPayload> CODEC = StreamCodec.composite(
            ItemStack.STREAM_CODEC, TotemAnimationPayload::stack,
            TotemAnimationPayload::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}