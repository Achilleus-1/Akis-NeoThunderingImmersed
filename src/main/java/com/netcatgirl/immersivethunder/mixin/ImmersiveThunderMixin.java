/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.level.Level
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.netcatgirl.immersivethunder.mixin;

import com.netcatgirl.immersivethunder.Constants;
import com.netcatgirl.immersivethunder.ThunderSoundInterface;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={LightningBolt.class})
public class ImmersiveThunderMixin
implements ThunderSoundInterface {
    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/level/Level;playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V"))
    private void playSound(Level level, double x, double y, double z, SoundEvent sound, SoundSource source, float volume, float pitch, boolean useDistance) {
        LightningBolt lightningBolt = (LightningBolt)(Object)this;
        LocalPlayer player = Minecraft.getInstance().player;
        double distanceToEntity = Objects.requireNonNull(player).distanceTo((Entity)lightningBolt);
        if (distanceToEntity <= 90.0) {
            this.playThunderSound(level, lightningBolt, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE, 5000.0f, false);
        } else if (distanceToEntity <= 140.0) {
            this.playThunderSound(level, lightningBolt, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM, 10000.0f, true);
        } else {
            this.playThunderSound(level, lightningBolt, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_FAR, 10000.0f, true);
        }
    }

    @Override
    public void playThunderSound(Level level, LightningBolt lightningBolt, SoundEvent soundEvent, float volume, boolean useDistance) {
        level.playLocalSound(lightningBolt.getX(), lightningBolt.getY(), lightningBolt.getZ(), soundEvent, SoundSource.WEATHER, volume, 0.8f, useDistance);
    }
}
