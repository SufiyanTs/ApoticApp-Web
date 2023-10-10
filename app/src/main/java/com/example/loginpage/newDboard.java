package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class newDboard extends AppCompatActivity implements View.OnClickListener {
    private ImageView POBAT, BERITA, PENGIRIMAN, KONSULTASI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dboard);
        POBAT = (ImageView) findViewById(R.id.pobat);
        BERITA = (ImageView) findViewById(R.id.berita);
        PENGIRIMAN = (ImageView) findViewById(R.id.pengiriman);
        KONSULTASI = (ImageView) findViewById(R.id.konsultasi);

        POBAT.setOnClickListener((View.OnClickListener)this);
        BERITA.setOnClickListener((View.OnClickListener)this);
        PENGIRIMAN.setOnClickListener((View.OnClickListener)this);
        KONSULTASI.setOnClickListener((View.OnClickListener)this);
    }
@Override
    public void onClick(View view){
        Intent i;
        switch (view.getId()){
//            nnti nambahin casenya disini men
            case R.id.:  i = new Intent(this,konsulWebview.class); startActivity(i);break;
        }
}
}