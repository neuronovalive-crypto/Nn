package com.neuronovatech.keyboard;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.Nullable;

public class NeuroNovaKeyboardService extends InputMethodService implements KeyboardView.OnKeyListener {
    private KeyboardView keyboardView;
    private Keyboard keyboard;
    private Keyboard symbolsKeyboard;
    private boolean caps = false;
    private StringBuilder textComposition;

    @Override
    public void onCreate() {
        super.onCreate();
        textComposition = new StringBuilder();
    }

    @Override
    public View onCreateInputView() {
        keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        keyboard = new Keyboard(this, R.xml.method);
        symbolsKeyboard = new Keyboard(this, R.xml.symbols);
        
        keyboardView.setKeyboard(keyboard);
        keyboardView.setOnKeyListener(this);
        keyboardView.setBackgroundColor(getResources().getColor(R.color.keyboard_background));
        
        return keyboardView;
    }

    @Override
    public View onCreateCandidatesView() {
        return super.onCreateCandidatesView();
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection ic = getCurrentInputConnection();
        if (ic == null) return;

        switch (primaryCode) {
            case Keyboard.KEYCODE_DELETE:
                ic.deleteSurroundingText(1, 0);
                break;
            case Keyboard.KEYCODE_SHIFT:
                caps = !caps;
                keyboard.setShifted(caps);
                keyboardView.invalidateAllKeys();
                break;
            case Keyboard.KEYCODE_MODE_CHANGE:
                if (keyboardView.getKeyboard() == keyboard) {
                    keyboardView.setKeyboard(symbolsKeyboard);
                } else {
                    keyboardView.setKeyboard(keyboard);
                }
                break;
            case -100: // Space
                ic.commitText(" ", 1);
                break;
            case -101: // Enter
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
                break;
            default:
                char c = (char) primaryCode;
                if (caps) {
                    c = Character.toUpperCase(c);
                    caps = false;
                    keyboard.setShifted(false);
                    keyboardView.invalidateAllKeys();
                } else {
                    c = Character.toLowerCase(c);
                }
                ic.commitText(String.valueOf(c), 1);
                break;
        }
    }

    @Override
    public void onPress(int primaryCode) {
    }

    @Override
    public void onRelease(int primaryCode) {
    }
}
