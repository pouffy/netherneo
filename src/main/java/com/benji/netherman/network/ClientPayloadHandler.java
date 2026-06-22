package com.benji.netherman.network;

import com.benji.netherman.NetherExp;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayloadHandler {

    
    public static void handleTotemAnimation() {
        Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(NetherExp.CHANCE_TOTEM.get()));
    }

    
    public static void handleCustomTotemAnimation(TotemAnimationPayload payload, IPayloadContext context) {
        
        context.enqueueWork(() -> {
            Minecraft.getInstance().gameRenderer.displayItemActivation(payload.stack());
        });
    }
}