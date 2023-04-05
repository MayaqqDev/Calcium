package dev.mayaqq.calciumrefixed.mixin;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.SpawnerBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnerBlock.class)
public class SpawnerBlockMixin {
    @Inject(at = @At("HEAD"), method = "getRenderType", cancellable = true)
    private void getRenderType(CallbackInfoReturnable<BlockRenderType> cir) {
        cir.setReturnValue(BlockRenderType.INVISIBLE);
    }
}
