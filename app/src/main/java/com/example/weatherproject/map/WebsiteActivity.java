package com.example.weatherproject.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.weatherproject.R;

public class WebsiteActivity extends AppCompatActivity {
    WebView  websiteView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        websiteView = findViewById(R.id.wsview);
        websiteView.setWebViewClient(new WebViewClient());
        websiteView.loadUrl("https://weather.com/vi-VN/");
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}