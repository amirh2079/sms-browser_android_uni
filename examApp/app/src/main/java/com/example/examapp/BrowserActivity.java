package com.example.examapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity {

    String address;
    EditText et_addressWeb;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser_activity);
        et_addressWeb = (EditText)findViewById(R.id.editTextBrowser);
        web = (WebView)findViewById(R.id.webView);
    }

    public void BrowserAddress(View view) {
        address = et_addressWeb.getText().toString();
        web.loadUrl(address);
    }
}
