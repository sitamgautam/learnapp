package com.example.learnapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Button to View History
        Button btnHistory = findViewById(R.id.btn_history);
        btnHistory.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, HistoryActivity.class);
            startActivity(intent);
        });

        // Button to Share Profile
        Button btnShare = findViewById(R.id.btn_share_profile);
        btnShare.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, ShareProfileActivity.class);
            startActivity(intent);
        });

        // Button to Upgrade Account
        Button btnUpgrade = findViewById(R.id.btn_upgrade_account);
        btnUpgrade.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, UpgradeAccountActivity.class);
            startActivity(intent);
        });
    }
}
