package dev.mayaqq.calciumrefixed.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityMixin {
    @Inject(at = @At("HEAD"), method = "shouldRender(D)Z", cancellable = true)
    private void shouldRender(double distance, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
