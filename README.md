# Neo Thundering Immersed

**NeoForge port and maintenance by [Achilleus (Achilleus-1)](https://github.com/Achilleus-1).**
An independently maintained port of [Immersive Thunder](https://github.com/netcatgirl/ImmersiveThunder) by netcatgirl.

Thunder uses different sounds at close, medium, and far distances from lightning, preserving the original distance thresholds and timing.

## Installation

Requires **Minecraft 1.21.1**, **NeoForge 21.1.255** (dependency range: 21.1.255 to below 21.2), and **Java 21**.

Download `neo-thundering-immersed-1.21.1-1.3.0-neoforge.1.jar` from [Releases](https://github.com/Achilleus-1/Akis-NeoThunderingImmersed/releases) and place it in your instance's `mods` folder. Remove older/original copies of Immersive Thunder before installing this port.

Install on the client to hear the thunder changes.

## Build from source

With a Java 21 JDK installed, set `JAVA_HOME` to that JDK and run from this repository:

```powershell
.\gradlew.bat build --console=plain
```

Linux/macOS: `./gradlew build --console=plain`. Build outputs are in `build/libs/`; dependencies download on the first build. Original mod JARs and decompilers are not needed to rebuild.

## Compatibility and validation

The original internal mod ID `immersivethunder` and resource/config namespaces are preserved to retain compatibility. The displayed name, distribution filename, repository, and maintainer credits use the new branding.

See [VALIDATION.md](VALIDATION.md) for verification of this edition. [PORT-NOTES.md](PORT-NOTES.md) records the earlier port's migration and historical testing, including its older filenames and NeoForge target; it does not establish runtime results for this edition.

## Credits and license

See [CREDITS.md](CREDITS.md) and [LICENSE](LICENSE). Achilleus maintains the NeoForge port; original authors retain credit for their work. This is an unofficial port. Original logos remain temporarily until replacement branding is supplied.
