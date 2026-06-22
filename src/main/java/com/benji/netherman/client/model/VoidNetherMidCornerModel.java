package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.block.entity.VoidNetherMidCornerBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class VoidNetherMidCornerModel extends GeoModel<VoidNetherMidCornerBlockEntity> {
    private static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/voidnether_midcorner.geo.json");
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/block/void_nether.png");
    private static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/voidnether_midcorner.animation.json");

    @Override
    public ResourceLocation getModelResource(VoidNetherMidCornerBlockEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(VoidNetherMidCornerBlockEntity animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(VoidNetherMidCornerBlockEntity animatable) {
        return ANIMATION;
    }
}