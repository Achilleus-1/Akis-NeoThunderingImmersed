/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.neoforged.fml.ModList
 *  net.neoforged.fml.loading.FMLLoader
 */
package com.netcatgirl.immersivethunder.platform;

import com.netcatgirl.immersivethunder.platform.services.IPlatformHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper
implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.isProduction();
    }
}
