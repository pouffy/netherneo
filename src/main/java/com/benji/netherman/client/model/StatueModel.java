package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.entity.StatueEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StatueModel extends GeoModel<StatueEntity> {
    private static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/statue_entity.geo.json");
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/statue_entity.png");
    private static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/statue_entity.animation.json");

    @Override
    public ResourceLocation getModelResource(StatueEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(StatueEntity animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(StatueEntity animatable) {
        return ANIMATION;
    }
}