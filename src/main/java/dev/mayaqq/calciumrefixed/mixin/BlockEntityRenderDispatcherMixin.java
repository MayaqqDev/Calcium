package dev.mayaqq.calciumrefixed.mixin;

import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockEntityRenderDispatcher.class)
public class BlockEntityRenderDispatcherMixin {
    @Inject(at = @At("HEAD"), method = "render*", cancellable = true)
    private void render(CallbackInfo ci) {
        ci.cancel();
    }
}
