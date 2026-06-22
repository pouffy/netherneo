package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.entity.BelieverVillagerEntity;
import com.benji.netherman.entity.DoctorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BelieverVillagerModel extends GeoModel<BelieverVillagerEntity> {
    @Override
    public ResourceLocation getModelResource(BelieverVillagerEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/believer_villager.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BelieverVillagerEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/believer_villager.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BelieverVillagerEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/believer_villager.animation.json");
    }
}