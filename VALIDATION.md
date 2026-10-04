# Validation of Neo Thundering Immersed

Date: October 4, 2026.
Target: **Minecraft 1.21.1, NeoForge 21.1.255, Java 21**.

## Completed checks

- Gradle build completed successfully against NeoForge 21.1.255.
- Packaged JAR ZIP integrity, TOML metadata, JSON resources, mod logo, mixin class references, author/credits, and preserved license notices verified.
- All packaged classes have Java 21 class-file version 65.
- All three renamed JARs loaded together into an isolated Minecraft client, opened a flat singleplayer test world, and exited normally following the AFK camera's smoke test.

- Compiled all eight reconstructed mod classes from source.
- Static audit: 20 external method/field instructions and 16 unique API references resolved against the target Minecraft, NeoForge, loader, bus, and SLF4J libraries.
- Both LightningBolt.tick sound redirect sites and the handler descriptor verified.
- Original thunder audio is preserved.

Not exercised: actual lightning audio at different distances. Startup and static checks do not establish in-game audio behavior.

## Artifacts

Version: `1.3.0-neoforge.1`. SHA-256 hashes of the runtime and source JARs are in [SHA256SUMS.txt](SHA256SUMS.txt).

The historical PORT-NOTES and, where present, VALIDATION-ORIGINAL describe the earlier unbranded port and its older target/artifact hashes. This file describes the renamed edition.
