package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class konsulWebview extends AppCompatActivity {

    WebView webviewtes;
    WebSettings websetting1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsul_webview);

        webviewtes = (WebView) findViewById(R.id.webView1);
        websetting1 = webviewtes.getSettings();
        webviewtes.setWebViewClient(new WebViewClient());
        webviewtes.loadUrl("https://project3-388907.uc.r.appspot.com/admin/konsultasi.jsp");
    }
}