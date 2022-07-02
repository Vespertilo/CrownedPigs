package me.vespertilo.crownedpigs.mixin;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.client.render.entity.model.QuadrupedEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PigEntityModel.class)
public class PigEntityModelMixin {
    @Inject(at = @At("HEAD"), method = "getTexturedModelData", cancellable = true)
    private static void getTexturedModelData(Dilation dilation, CallbackInfoReturnable<TexturedModelData> cir) {
        ModelData modelData = QuadrupedEntityModel.getModelData(6, dilation);
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, dilation).uv(32, 32).cuboid(-4.0F, -5.0F, -8.0F, 8.0F, 1.0F, 8.0F).uv(16, 16).cuboid(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, dilation), ModelTransform.pivot(0.0F, 12.0F, -6.0F));
        cir.setReturnValue(TexturedModelData.of(modelData, 64, 48));
    }
}
