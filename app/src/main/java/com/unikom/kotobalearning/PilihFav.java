package com.unikom.kotobalearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PilihFav extends AppCompatActivity implements View.OnClickListener {
    public CardView katabenda, katakerja, katasifat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pilih_fav);
        katabenda = (CardView) findViewById(R.id.daftar_benda);
        katakerja = (CardView) findViewById(R.id.daftar_kerja);
        katasifat = (CardView) findViewById(R.id.daftar_sifat);
        katabenda.setOnClickListener(this);
        katakerja.setOnClickListener(this);
        katasifat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Intent a;

            switch (v.getId()) {
                case R.id.daftar_benda:
                    a = new Intent(this, MainFavorit.class);
                    startActivity(a);
                    break;
            }
            switch (v.getId()) {
                case R.id.daftar_kerja:
                    a = new Intent(this, MainFavKerja.class);
                    startActivity(a);
                    break;
            }
            switch (v.getId()) {
                case R.id.daftar_sifat:
                    a = new Intent(this, MainFavSifat.class);
                    startActivity(a);
                    break;
            }
        }
    }
