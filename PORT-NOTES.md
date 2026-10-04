# Immersive Thunder 1.21.1 backport

Output: `immersivethunder-neoforge-1.21.1-1.3.0-backport-21.1.252.jar`

Target: Minecraft **1.21.1**, NeoForge **21.1.252**, Java **21**.

Place the output JAR in your Minecraft client's `mods` folder, replacing the old Immersive Thunder JAR. Install only one Immersive Thunder JAR in that instance. The supplied original remains unchanged in this workspace.

## Changes

- Minecraft dependency changed from `[1.21.6, 1.22)` to `[1.21.1]`.
- NeoForge dependency changed from `[21.6.19-beta,)` to `[21.1.252,21.2)`.
- Local version identified as `1.3.0+1.21.1-backport`; manifest Minecraft version updated.
- Resource pack format updated from 8 to 34, matching Minecraft 1.21.1.
- Common mixin compatibility changed from `JAVA_18` to `JAVA_21`.
- Removed the reference to `immersivethunder.refmap.json`, which was absent from the supplied JAR. The existing named Minecraft references match NeoForge 1.21.1.
- Logo metadata now points to the icon actually included in the JAR.

All eight compiled mod classes and every sound asset were preserved byte for byte. No code replacement was necessary: this small mod's Minecraft and loader APIs still exist with the same signatures in the requested versions.

## Verification

- Audited all 20 external method/field instructions (16 unique API references), including inheritance and static/instance invocation compatibility, against the official Minecraft 1.21.1 client remapped using Mojang's mappings, NeoForge 21.1.252, and its configured loader 4.0.44 / bus 8.0.5 libraries.
- Verified both `LightningBolt.tick()` sound calls match the original redirect target, and the redirect handler descriptor matches its arguments.
- Confirmed all compiled mod classes are compatible with Java 21.
- Validated TOML/JSON, mixin resources, sound file references, ZIP integrity, and preservation of all entries outside the four edited metadata files.
- This is static compatibility verification. No Minecraft client launch, actual Mixin transformation, or in-game audio test was performed. Other installed mods were not tested.

The audit and reproducible patch script are in `work/CompatibilityAudit.java`, `work/compatibility-audit.txt`, and `work/backport.py`.

Output SHA-256: `5ae62e0f6dd0644e79f48ecfc228a77315363a1efdd4da3eab3c68e1f8a3574a`

Official project: https://github.com/netcatgirl/ImmersiveThunder

Target NeoForge configuration: https://maven.neoforged.net/releases/net/neoforged/neoforge/21.1.252/neoforge-21.1.252-moddev-config.json
