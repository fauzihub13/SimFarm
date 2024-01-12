package com.example.simpet01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class artikel_1 extends AppCompatActivity {

    ImageView btn_backFromArtikel;
    CardView berita1,berita2,berita3,berita4,berita5,berita6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel1);

        btn_backFromArtikel= findViewById(R.id.btn_backFromArtikel);
        berita1= findViewById(R.id.berita1);
        berita2= findViewById(R.id.berita2);
        berita3= findViewById(R.id.berita3);
        berita4= findViewById(R.id.berita4);
        berita5= findViewById(R.id.berita5);
        berita6= findViewById(R.id.berita6);


        btn_backFromArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        berita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita1.class);
                startActivity(i);
            }
        });

        berita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita1.class);
                startActivity(i);
            }
        });

        berita2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita2.class);
                startActivity(i);
            }
        });

        berita3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita3.class);
                startActivity(i);
            }
        });

        berita4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita4.class);
                startActivity(i);
            }
        });

        berita5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita5.class);
                startActivity(i);
            }
        });

        berita6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artikel_1.this, berita6.class);
                startActivity(i);
            }
        });
    }
}