# Xodus

**Xodus** is a small casual game based on stories of people evacuating from the war.

![960x540](https://user-images.githubusercontent.com/89737218/165823298-ac353ae3-d0ef-4a3c-9bb7-67a6bb7fe8f1.jpg)

https://user-images.githubusercontent.com/89737218/165823337-0669a28b-4005-4c90-a1e3-43e43e1c82f5.mp4

**Game objective:** keep the balls alive and running. Avoid collisions and the Shredder line.
You can replace the track sections on the field and choose moving direction on the track forks.
You are playing against the Chaos: after you end your turn, the Chaos makes its move, sometimes for worse,
sometimes for better.

You can adjust the field size, the number of Chaos mover per turn, the Shredder line speed, and whether the killed
balls respawn or not.

The field can be scrolled and zoomed, by pinch-zooms, long touches and (Ctrl-)mouse wheel on desktops.

There is no game timer and no hall of fame. There are also no sound, no ads and no in-game purchases.
The game is completely free and will remain so. It does not use Internet connection and does not require
any device permissions.

The game is auto-saved after each turn.

## Download

The game is provided in two options:

- **Desktop Java**. [Download Xodus.jar](https://github.com/andrzej-nov/Xodus/releases/download/v1.6/Xodus.jar).
  Run it with `java -jar Xodus.jar` command line, or in most cases just double-click the Xodus.jar 
  file. Requires Java 17 Runtime or later.
    - **On MacOS** you will get a warning about unidentified developer. Start the Xodus.jar 
      using Finder context menu instead of Launchpad,
      [as explained here](https://www.bemidjistate.edu/offices/its/knowledge-base/how-to-open-an-app-from-an-unidentified-developer-and-exempt-it-from-gatekeeper/)
      .

- **Android**. [Get it on Google Play](https://play.google.com/store/apps/details?id=com.andrzejn.xodus)
  (recommended) or   [download the Xodus.apk](https://github.com/andrzej-nov/Xodus/releases/download/v1.6/Xodus.apk)
  here for manual install (it might be sometimes also a newer version than on the Google Play).
  It should work on any Android version starting from 5.0 and later.

There is no iOS build because I do not have tools to test and deploy it to the AppStore. If somebody completes the iOS
module (see below), I will add it here.

## Development

The game is provided under the [Creative Commons Attribution license](https://creativecommons.org/licenses/by/4.0/).
Please feel free to reuse, extend, derive, improve etc. as long as you keep a reference to the original and mention me,
Andrzej Novosiolov, as the original author.

# Project Attribution and License

This project is based on [Xodus](https://github.com/andrzej-nov/Xodus) by Andrzej Novosiolov.

The original work is licensed under the [Creative Commons Attribution 4.0 International License (CC BY 4.0)](https://creativecommons.org/licenses/by/4.0/).

## Modifications

AppsFlyer has been integrated into this project for learning and experimentation with mobile game marketing and attribution.

## Disclaimer

This project is an independent modification of the original work and is not officially affiliated with or endorsed by the original author.

The game has been implemented using following tools and libraries:

- [IntelliJ IDEA 2026.2.3 (Free Tier)](https://www.jetbrains.com/idea/download/)
- [Android Studio Quail 4 | 2026.1.4](https://developer.android.com/studio) (for the Android emulator)
- [Gradle 9.7.1](https://gradle.org/)
- [Kotlin 2.4.20](https://kotlinlang.org/)
- [libGDX 1.14.2](https://libgdx.com/)
- [libKTX 1.13.1-rc1](https://libktx.github.io/)
- [ShapeDrawer 2.6.0](https://github.com/earlygrey/shapedrawer#shape-drawer)
- [Universal Tween Engine 6.3.3](https://github.com/AurelienRibon/universal-tween-engine)
- Free icons from https://www.flaticon.com/

The `ios` module is present in the project and compiling, but I did not tested it because I do not have Apple devices
and tools for that. If you make it work, I would gratefully accept the pull request.
