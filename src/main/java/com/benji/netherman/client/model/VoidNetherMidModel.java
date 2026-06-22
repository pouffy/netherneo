package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.block.entity.VoidNetherMidBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class VoidNetherMidModel extends GeoModel<VoidNetherMidBlockEntity> {
    private static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/voidnether_mid.geo.json");
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/block/void_nether.png");
    private static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/voidnether_mid.animation.json");

    @Override
    public ResourceLocation getModelResource(VoidNetherMidBlockEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(VoidNetherMidBlockEntity animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(VoidNetherMidBlockEntity animatable) {
        return ANIMATION;
    }
}