package dev.mayaqq.calciumrefixed.mixin;

import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BeehiveBlock.class)
public class BeehiveBlockMixin {
    @Inject(at = @At("HEAD"), method = "getRenderType", cancellable = true)
    private void getRenderType(BlockState state, CallbackInfoReturnable<BlockRenderType> cir) {
        cir.setReturnValue(BlockRenderType.INVISIBLE);
    }
}
