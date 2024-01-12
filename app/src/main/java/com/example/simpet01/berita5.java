package com.example.simpet01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class berita5 extends AppCompatActivity {

    ImageView btn_backFromDetailArtikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita5);

        btn_backFromDetailArtikel=findViewById(R.id.btn_backFromDetailArtikel);

        btn_backFromDetailArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}