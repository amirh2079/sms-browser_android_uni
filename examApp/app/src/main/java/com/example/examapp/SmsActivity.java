package com.example.examapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    EditText et_phoneNumber,et_smsText;
    String phoneNumber,textSms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_activity);

        et_phoneNumber = (EditText)findViewById(R.id.editTextPhoneNumber);
        et_smsText = (EditText)findViewById(R.id.editTextSmsText);


    }

    public void SmsSender(View view) {
        phoneNumber = et_phoneNumber.getText().toString();
        textSms = et_smsText.getText().toString();
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNumber,null,textSms,null,null);
        Toast.makeText(getApplicationContext(),"Message raft;)",Toast.LENGTH_SHORT).show();
    }
}
