package com.example.examapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendSms(View view) {
        Intent i = new Intent(getApplicationContext(),SmsActivity.class);
        startActivity(i);
    }

    public void GotToBrowser(View view) {
        Intent i = new Intent(getApplicationContext(),BrowserActivity.class);
        startActivity(i);
    }
}
