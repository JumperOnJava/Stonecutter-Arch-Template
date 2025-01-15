package io.github.jumperonjava.template.mixin;

import io.github.jumperonjava.template.TempLateInit;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {

    @Inject(method = "init",at=@At("HEAD"))
    void init(CallbackInfo ci){
        TempLateInit.LOGGER.info("Stonecutter example mixin init");
    }

}
