package com.ananda.myprofil.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ananda.myprofil.R;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : Activity ini membuat tampilan Walkthrough 2 ada button lanjut
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

public class WalkthroughActivity2 extends AppCompatActivity {
    Button buttonLanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough2);

        buttonLanjut = findViewById(R.id.btn_walk_daily);
        buttonLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalkthroughActivity2.this, WalkthroughActivity3.class);
                startActivity(intent);
            }
        });
    }
}
