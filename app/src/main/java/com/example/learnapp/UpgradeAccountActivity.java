package com.example.learnapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class UpgradeAccountActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade_account);

        webView = findViewById(R.id.payment_webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Loading Stripe payment
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://buy.stripe.com/test_9B6fZ96247CtaoXcDZbsc00");
    }
}
