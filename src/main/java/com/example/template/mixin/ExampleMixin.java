package com.example.template.mixin;

import com.example.template.TempLateInit;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {

    @Inject(method = "init",at=@At("HEAD"))
    void init(CallbackInfo ci){
        TempLateInit.LOGGER.info("Stonecutter example mixin init in %s".formatted(TempLateInit.PLATFORM.getModloader()));
    }

}
