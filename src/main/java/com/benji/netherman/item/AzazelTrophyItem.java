package com.benji.netherman.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.level.block.Block;

public class AzazelTrophyItem extends BlockItem implements Equipable {

    public AzazelTrophyItem(Block block, Properties properties) {
        super(block, properties.fireResistant().stacksTo(1));
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }
}