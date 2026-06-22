package com.benji.netherman.item;

import com.benji.netherman.entity.CrimsonArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CrimsonArrowItem extends ArrowItem {
    public CrimsonArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public net.minecraft.world.entity.projectile.AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter, @org.jetbrains.annotations.Nullable ItemStack weapon) {
        return new CrimsonArrowEntity(level, shooter);
    }
}