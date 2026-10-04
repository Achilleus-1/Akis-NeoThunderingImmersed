/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.level.Level
 */
package com.netcatgirl.immersivethunder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;

public interface ThunderSoundInterface {
    public static final double closeDistance = 90.0;
    public static final double mediumDistance = 140.0;
    public static final float thunderCloseVolume = 5000.0f;
    public static final float thunderMediumVolume = 10000.0f;
    public static final float thunderFarVolume = 10000.0f;
    public static final float impactSoundVolume = 2.0f;

    public void playThunderSound(Level var1, LightningBolt var2, SoundEvent var3, float var4, boolean var5);
}
