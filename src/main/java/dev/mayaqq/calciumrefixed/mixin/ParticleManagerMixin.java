package dev.mayaqq.calciumrefixed.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.client.particle.ParticleManager.class)
public class ParticleManagerMixin {
    @Inject(at = @At("HEAD"), method = "renderParticles", cancellable = true)
    private void renderParticles(CallbackInfo ci) {
        ci.cancel();
    }
}
