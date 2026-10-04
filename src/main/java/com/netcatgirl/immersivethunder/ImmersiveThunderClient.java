/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.neoforged.bus.api.IEventBus
 *  net.neoforged.fml.common.Mod
 */
package com.netcatgirl.immersivethunder;

import com.netcatgirl.immersivethunder.CommonClass;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value="immersivethunder")
public class ImmersiveThunderClient {
    public ImmersiveThunderClient(IEventBus eventBus) {
        CommonClass.init();
    }
}
