package com.unikom.kotobalearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.unikom.kotobalearning.daftarkosakata.DaftarKosakata;
import com.unikom.kotobalearning.kuiskosakata.KuisKosakata;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView kosakata, kuiskata, favorit, faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kosakata = (CardView) findViewById(R.id.daftar_kosakata);
        kuiskata = (CardView) findViewById(R.id.kuis_kosakata);
        favorit = (CardView) findViewById(R.id.favorit);
        faq = (CardView) findViewById(R.id.faq);
        kosakata.setOnClickListener(this);
        kuiskata.setOnClickListener(this);
        favorit.setOnClickListener(this);
        faq.setOnClickListener(this);
    }

    public void onClick(View v){
    Intent i;

        switch(v.getId()){
            case R.id.daftar_kosakata :
                i = new Intent(this,DaftarKosakata.class);
                startActivity(i);
                break;
        }
        switch (v.getId()){
            case R.id.kuis_kosakata :
                i = new Intent(this,KuisKosakata.class);
                startActivity(i);
                break;
        }
        switch (v.getId()){
            case R.id.favorit :
                i = new Intent(this,PilihFav.class);
                startActivity(i);
                break;
        }
        switch (v.getId()){
            case R.id.faq :
                i = new Intent(this,MainFaq.class);
                startActivity(i);
                break;
       }
    }
}