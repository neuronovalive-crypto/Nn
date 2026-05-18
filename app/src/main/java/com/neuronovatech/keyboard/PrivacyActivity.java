package com.neuronovatech.keyboard;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PrivacyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        
        TextView privacyText = findViewById(R.id.privacy_text);
        privacyText.setText(getPrivacyPolicy());
    }
    
    private String getPrivacyPolicy() {
        return "NeuroNova Keyboard Privacy Policy\n\n" +
                "1. Data Collection: We collect minimal user data.\n" +
                "2. User Privacy: Your keystrokes are processed locally on your device.\n" +
                "3. No Cloud Storage: NeuroNova does not upload your data to external servers by default.\n" +
                "4. Permissions: We request only necessary permissions for keyboard functionality.\n" +
                "5. Third-party Services: Optional AI features may require API connections.\n" +
                "6. User Control: You have full control over feature toggles and settings.";
    }
}
