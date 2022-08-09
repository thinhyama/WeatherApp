package com.example.weatherproject.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.weatherproject.R;

public class BcActivity extends AppCompatActivity {
    WebView bcView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc);
        bcView = findViewById(R.id.bcview);
        bcView.setWebViewClient(new WebViewClient());
        bcView.loadUrl("https://weather.com/vi-vn/samsungfeedback/");
    }
}