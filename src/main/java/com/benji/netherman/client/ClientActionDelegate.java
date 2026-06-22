package com.benji.netherman.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientActionDelegate {
    public static void openNoteScreen() {
        com.benji.netherman.client.gui.NoteScreen.openScreen();
    }
}