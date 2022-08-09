package com.example.weatherproject.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.weatherproject.R;
import com.example.weatherproject.weather.MainActivity;

public class Contact_Activity extends AppCompatActivity {
    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhbm = new Intent(Contact_Activity.this, WebActivity.class);
                startActivity(mhbm);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhgp = new Intent(Contact_Activity.this, GiayphepActivity.class);
                startActivity(mhgp);
            }
        });
    }
}