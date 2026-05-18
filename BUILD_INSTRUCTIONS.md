# NeuroNova Keyboard v0.4 - Build Instructions

## Prerequisites
- Android Studio Flamingo or later
- Android SDK 34
- Java 11 or later
- Gradle 8.0 or later

## Building the Project

### 1. Clone the Repository
```bash
git clone https://github.com/neuronovalive-crypto/Nn.git
cd Nn
```

### 2. Build Debug APK
```bash
./gradlew assembleDebug
```
Output: `app/build/outputs/apk/debug/app-debug.apk`

### 3. Build Release APK
```bash
./gradlew assembleRelease
```

### 4. Install on Device
```bash
./gradlew installDebug
```

### 5. Run Tests
```bash
./gradlew test
```

## IDE Setup (Android Studio)
1. Open Android Studio
2. Select "Open an Existing Project"
3. Navigate to the cloned repository
4. Wait for Gradle sync to complete
5. Select "Build > Build Bundle(s) / APK(s) > Build APK(s)"

## Troubleshooting

### Gradle Sync Issues
- Invalidate caches: File > Invalidate Caches > Invalidate and Restart
- Update SDK: SDK Manager > SDK Platforms > Update

### Build Failures
- Ensure Java version: `java -version`
- Clear build cache: `./gradlew clean`
- Update dependencies: `./gradlew dependencies --refresh-dependencies`

## Output Files
- Debug APK: `app/build/outputs/apk/debug/app-debug.apk`
- Release APK: `app/build/outputs/apk/release/app-release-unsigned.apk`
- Bundle: `app/build/outputs/bundle/release/app-release.aab`

## Installation
1. Enable Unknown Sources: Settings > Security > Unknown Sources
2. Transfer APK to device
3. Open file manager and tap APK to install
4. Grant required permissions

## First Run
1. Open NeuroNova Keyboard app
2. Tap "Enable Keyboard"
3. Go to Settings > Languages & Input > Keyboard settings
4. Enable NeuroNova Keyboard for your language
5. Configure preferences in Settings
