package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.block.entity.VoidNetherCornerBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class VoidNetherCornerModel extends GeoModel<VoidNetherCornerBlockEntity> {
    private static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/voidnether_corner.geo.json");
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/block/void_nether.png");
    private static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/voidnether_corner.animation.json");

    @Override
    public ResourceLocation getModelResource(VoidNetherCornerBlockEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(VoidNetherCornerBlockEntity animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(VoidNetherCornerBlockEntity animatable) {
        return ANIMATION;
    }
}