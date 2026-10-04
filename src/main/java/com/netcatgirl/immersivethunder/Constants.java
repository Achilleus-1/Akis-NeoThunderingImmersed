/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.netcatgirl.immersivethunder;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {
    public static final String MOD_ID = "immersivethunder";
    public static final String MOD_NAME = "Neo Thundering Immersed";
    public static final Logger LOG = LoggerFactory.getLogger((String)"Neo Thundering Immersed");
    public static final ResourceLocation THUNDER_CLOSE = ResourceLocation.fromNamespaceAndPath((String)"immersivethunder", (String)"thunder_close");
    public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE = SoundEvent.createVariableRangeEvent((ResourceLocation)THUNDER_CLOSE);
    public static final ResourceLocation THUNDER_MEDIUM = ResourceLocation.fromNamespaceAndPath((String)"immersivethunder", (String)"thunder_medium");
    public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM = SoundEvent.createVariableRangeEvent((ResourceLocation)THUNDER_MEDIUM);
    public static final ResourceLocation THUNDER_FAR = ResourceLocation.fromNamespaceAndPath((String)"immersivethunder", (String)"thunder_far");
    public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_FAR = SoundEvent.createVariableRangeEvent((ResourceLocation)THUNDER_FAR);
}
