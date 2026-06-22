package com.benji.netherman.client.model;

import com.benji.netherman.NetherExp;
import com.benji.netherman.entity.GildedGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GildedGolemModel extends GeoModel<GildedGolemEntity> {

    
    private static final ResourceLocation MODEL_RESOURCE = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "geo/gilded_golem.geo.json");
    private static final ResourceLocation ANIMATION_RESOURCE = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "animations/gilded_golem.animation.json");

    
    private static final ResourceLocation TEX_NORMAL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/gilded_golem.png");
    private static final ResourceLocation TEX_DAMAGED = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/gilded_golem_damaged.png");
    private static final ResourceLocation TEX_HEAL = ResourceLocation.fromNamespaceAndPath(NetherExp.MODID, "textures/entity/gilded_golem_damaged_heal.png");

    @Override
    public ResourceLocation getModelResource(GildedGolemEntity object) {
        return MODEL_RESOURCE;
    }

    @Override
    public ResourceLocation getTextureResource(GildedGolemEntity object) {
        
        int state = object.getEntityData().get(GildedGolemEntity.TEXTURE_STATE);

        if (state == 2) {
            return TEX_HEAL;
        } else if (state == 1) {
            return TEX_DAMAGED;
        }

        return TEX_NORMAL;
    }

    @Override
    public ResourceLocation getAnimationResource(GildedGolemEntity animatable) {
        return ANIMATION_RESOURCE;
    }
}