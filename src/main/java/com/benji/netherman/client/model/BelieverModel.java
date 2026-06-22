package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.entity.BelieverEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BelieverModel extends GeoModel<BelieverEntity> {
    private static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/believer.geo.json");
    private static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/believer.animation.json");

    private static final ResourceLocation TEX_NORMAL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/believer.png");
    private static final ResourceLocation TEX_PRAY = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/believer_pray.png");

    @Override
    public ResourceLocation getModelResource(BelieverEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(BelieverEntity animatable) {
        
        return animatable.clientIsProtected ? TEX_PRAY : TEX_NORMAL;
    }

    @Override
    public ResourceLocation getAnimationResource(BelieverEntity animatable) {
        return ANIMATION;
    }
}