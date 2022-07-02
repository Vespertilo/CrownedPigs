package me.vespertilo.crownedpigs.mixin;

import me.vespertilo.crownedpigs.CrownedPigs;
import net.minecraft.client.render.entity.PigEntityRenderer;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.PlayerManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PigEntityRenderer.class)
public class PigEntityRendererMixin {
    private static final Identifier CROWNED_TEXTURE = new Identifier("crownedpigs","textures/entity/pig/crownpig.png");
    private static final Identifier NORMAL_TEXTURE = new Identifier("crownedpigs", "textures/entity/pig/pig.png");


    @Inject(at = @At("HEAD"), method = "getTexture(Lnet/minecraft/entity/passive/PigEntity;)Lnet/minecraft/util/Identifier;", cancellable = true)
    public void getTexture(PigEntity pigEntity, CallbackInfoReturnable<Identifier> cir) {
        if (pigEntity.hasCustomName() && "Technoblade".equals(pigEntity.getName().getString())) {
            cir.setReturnValue(CROWNED_TEXTURE);
            return;
        }
        cir.setReturnValue(NORMAL_TEXTURE);
    }
}
