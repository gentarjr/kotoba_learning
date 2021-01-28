package com.unikom.kotobalearning.kuiskosakata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.unikom.kotobalearning.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KuisKosakata extends AppCompatActivity implements View.OnClickListener {

    public CardView kuisbenda, kuiskerja, kuissifat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_kuis);
        kuisbenda = (CardView) findViewById(R.id.kata_benda);
        kuiskerja = (CardView) findViewById(R.id.kata_kerja);
        kuissifat = (CardView) findViewById(R.id.kata_sifat);
        kuisbenda.setOnClickListener(this);
        kuiskerja.setOnClickListener(this);
        kuissifat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent a;

        switch(v.getId()){
            case R.id.kata_benda :
                a = new Intent(this, KuisKataBenda.class);
                startActivity(a);
                break;
        }
        switch(v.getId()){
            case R.id.kata_kerja :
                a = new Intent(this, KuisKataKerja.class);
                startActivity(a);
                break;
        }
        switch(v.getId()){
            case R.id.kata_sifat :
                a = new Intent(this, KuisKataSifat.class);
                startActivity(a);
                break;
        }
    }


}
