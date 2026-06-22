package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.entity.BlacksmithEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlacksmithModel extends GeoModel<BlacksmithEntity> {
    @Override
    public ResourceLocation getModelResource(BlacksmithEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/blacksmith.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlacksmithEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/blacksmith.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlacksmithEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/blacksmith.animation.json");
    }
}