package com.unikom.kotobalearning.daftarkosakata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.unikom.kotobalearning.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DaftarKosakata extends AppCompatActivity implements View.OnClickListener {

    public CardView katabenda, katakerja, katasifat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar);
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
                a = new Intent(this, KataBenda.class);
                startActivity(a);
                break;
        }
        switch (v.getId()) {
            case R.id.daftar_kerja:
                a = new Intent(this, KataKerja.class);
                startActivity(a);
                break;
        }
        switch (v.getId()) {
            case R.id.daftar_sifat:
                a = new Intent(this, KataSifat.class);
                startActivity(a);
                break;
        }
    }
}