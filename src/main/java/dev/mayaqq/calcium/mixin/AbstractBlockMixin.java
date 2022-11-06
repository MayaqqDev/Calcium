package dev.mayaqq.calcium.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockRenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractBlock.class)
public class AbstractBlockMixin {

	@Inject(method = "getRenderType", at = @At("HEAD"), cancellable = true)
	public void myMod$modifyRenderType(CallbackInfoReturnable<BlockRenderType> cir) {
		cir.setReturnValue(BlockRenderType.INVISIBLE);
	}
}
