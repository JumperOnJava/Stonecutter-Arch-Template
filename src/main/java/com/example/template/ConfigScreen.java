package com.example.template;


import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ConfigScreen extends Screen {

    public ConfigScreen(Screen parent) {
        super(Component.empty());
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        super.render(guiGraphics, mouseX, mouseY, delta);
        guiGraphics.drawString(minecraft.font,
                "Hello, world",
                width / 2,
                height / 2,
                0xFFFFFFFF);
    }

    public static ConfigScreen createConfigScreen(Screen parent) {
        return new ConfigScreen(parent);
    }
}
