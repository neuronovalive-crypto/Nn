package com.neuronovatech.keyboard;

import android.content.Context;
import android.content.SharedPreferences;

public class NeuroNovaPrefs {
    private static final String PREFS_NAME = "neuronova_prefs";
    private static final String VIBRATION_KEY = "vibration_enabled";
    private static final String SOUND_KEY = "sound_enabled";
    private static final String AI_KEY = "ai_enabled";
    private static final String LANGUAGE_KEY = "selected_language";
    
    private SharedPreferences prefs;
    
    public NeuroNovaPrefs(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }
    
    public boolean isVibrationEnabled() {
        return prefs.getBoolean(VIBRATION_KEY, true);
    }
    
    public void setVibrationEnabled(boolean enabled) {
        prefs.edit().putBoolean(VIBRATION_KEY, enabled).apply();
    }
    
    public boolean isSoundEnabled() {
        return prefs.getBoolean(SOUND_KEY, true);
    }
    
    public void setSoundEnabled(boolean enabled) {
        prefs.edit().putBoolean(SOUND_KEY, enabled).apply();
    }
    
    public boolean isAIEnabled() {
        return prefs.getBoolean(AI_KEY, false);
    }
    
    public void setAIEnabled(boolean enabled) {
        prefs.edit().putBoolean(AI_KEY, enabled).apply();
    }
    
    public String getSelectedLanguage() {
        return prefs.getString(LANGUAGE_KEY, "en");
    }
    
    public void setSelectedLanguage(String language) {
        prefs.edit().putString(LANGUAGE_KEY, language).apply();
    }
}
