# NeuroNova Keyboard v0.4

**A Modern, Privacy-First, AI-Enhanced Keyboard for Android**

## About
NeuroNova Keyboard is an advanced input method service for Android devices, featuring multi-language support, AI-powered text suggestions, and comprehensive customization options—all while maintaining user privacy.

## Key Features

✨ **Multi-Language Support**
- English (US)
- Bengali (Bangla) with Phonetic Input
- Expandable architecture for additional languages

🤖 **AI Integration**
- Optional AI text suggestions
- Predictive completions
- Context-aware recommendations
- User-controlled activation

🎨 **Customization**
- Vibration haptic feedback
- Sound feedback
- Toggle AI features on/off
- Persistent user preferences

🔒 **Privacy-First Design**
- Local text processing by default
- No mandatory cloud storage
- Transparent permission system
- User-controlled data handling

## Installation

### From Release APK
1. Download `neuronova-keyboard-v0.4.apk`
2. Enable Unknown Sources in Settings > Security
3. Open the APK file and install
4. Open the app and follow setup wizard

### Build from Source
```bash
git clone https://github.com/neuronovalive-crypto/Nn.git
cd Nn
./gradlew assembleDebug
./gradlew installDebug
```

## Setup

1. **Enable the Keyboard**
   - Open NeuroNova Keyboard app
   - Tap "Enable Keyboard"
   - Go to Settings > Languages & Input > Keyboard settings
   - Check NeuroNova Keyboard

2. **Configure Preferences**
   - Open NeuroNova Keyboard app
   - Tap "Settings"
   - Toggle: Vibration, Sound, AI Features
   - Changes are saved automatically

3. **Review Privacy Policy**
   - Open NeuroNova Keyboard app
   - Tap "Privacy Policy"
   - Read and understand data practices

## System Requirements

- **Android Version:** 5.0 (API 21) or higher
- **Target SDK:** 34 (Android 14)
- **Storage:** ~5 MB
- **RAM:** Minimal overhead

## Permissions

| Permission | Purpose |
|-----------|----------|
| `VIBRATE` | Haptic feedback on key presses |
| `INTERNET` | AI feature connectivity |
| `ACCESS_NETWORK_STATE` | Check network availability for AI |

## Privacy & Security

### Data Handling
- ✅ Text input processed locally by default
- ✅ No keystroke logging
- ✅ No automatic cloud uploads
- ❓ AI features (optional) may require internet connectivity

### User Control
- Disable AI features in settings
- Manage permissions at OS level
- No forced tracking

## Settings

### Vibration Feedback
Enable/disable haptic response on key presses

### Sound Feedback
Enable/disable audible feedback on key presses

### AI Features
Enable/disable AI-powered text suggestions and predictions

## Troubleshooting

### Keyboard Not Appearing
1. Open NeuroNova Keyboard app
2. Tap "Enable Keyboard"
3. Go to System Settings > Languages & Input
4. Ensure NeuroNova Keyboard is checked
5. Set it as default for text input

### Lag or Performance Issues
1. Disable AI features if not needed
2. Clear app cache: Settings > Apps > NeuroNova > Storage > Clear Cache
3. Restart device

### Bangla Input Not Working
1. Select Bangla subtype in keyboard settings
2. Use phonetic input (e.g., "ami" → "আমি")
3. Refer to Bangla phoneme mappings in documentation

## Development

### Project Structure
```
app/
├── src/
│   └── main/
│       ├── java/com/neuronovatech/keyboard/
│       │   ├── NeuroNovaKeyboardService.java
│       │   ├── MainActivity.java
│       │   ├── SettingsActivity.java
│       │   ├── PrivacyActivity.java
│       │   ├── PermissionActivity.java
│       │   ├── NeuroNovaPrefs.java
│       │   └── BanglaPhonetic.java
│       ├── res/
│       │   ├── layout/
│       │   ├── drawable/
│       │   ├── values/
│       │   └── xml/
│       └── AndroidManifest.xml
└── build.gradle
```

### Building
```bash
# Debug build
./gradlew assembleDebug

# Release build
./gradlew assembleRelease

# Run tests
./gradlew test

# Install on device
./gradlew installDebug
```

## Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## License

GNU General Public License v3.0 - See LICENSE file for details

## Support

For issues, feature requests, or feedback:
1. Open an issue on GitHub
2. Include detailed description and steps to reproduce
3. Attach screenshots if applicable
4. Include device info and Android version

## Version History

### v0.4 (Current)
- AI integration framework
- Enhanced language support
- Improved UI/UX
- Privacy-first design

### v0.3
- Basic keyboard functionality
- English language support

### v0.2
- Initial release
- Core input method service

## Credits

**NeuroNova Development Team**
- Project Lead: neuronovalive-crypto
- Contributors and community feedback

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for detailed version history

---

**NeuroNova Keyboard v0.4** | Made with ❤️ for accessibility and privacy
