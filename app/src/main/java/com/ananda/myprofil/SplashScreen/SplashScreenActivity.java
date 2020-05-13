package com.ananda.myprofil.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ananda.myprofil.R;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : Activity ini membuat tampilan SplashScreen delay selama 4 detik
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class SplashScreenActivity extends AppCompatActivity {
    private int time_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent splash = new Intent(SplashScreenActivity.this,WalkthroughActivity1.class);
                startActivity(splash);
                finish();
            }
        },time_loading);
    }
}
