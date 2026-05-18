package com.neuronovatech.keyboard;

import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends AppCompatActivity {
    private NeuroNovaPrefs prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        
        prefs = new NeuroNovaPrefs(this);
        
        Switch vibrationSwitch = findViewById(R.id.vibration_toggle);
        Switch soundSwitch = findViewById(R.id.sound_toggle);
        Switch aiSwitch = findViewById(R.id.ai_toggle);
        
        vibrationSwitch.setChecked(prefs.isVibrationEnabled());
        soundSwitch.setChecked(prefs.isSoundEnabled());
        aiSwitch.setChecked(prefs.isAIEnabled());
        
        vibrationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            prefs.setVibrationEnabled(isChecked);
        });
        
        soundSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            prefs.setSoundEnabled(isChecked);
        });
        
        aiSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            prefs.setAIEnabled(isChecked);
        });
    }
}
