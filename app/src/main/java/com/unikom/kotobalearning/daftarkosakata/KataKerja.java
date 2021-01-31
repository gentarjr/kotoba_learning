package com.unikom.kotobalearning.daftarkosakata;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.unikom.db.Db;
import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.entity.KataKerjaEntity;

import java.io.IOException;

import androidx.appcompat.app.AppCompatActivity;

public class KataKerja extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnPlay, btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17, btnPlay18, btnPlay19, btnPlay20, btnPlay21, btnPlay22, btnPlay23, btnPlay24, btnPlay25, btnPlay26, btnPlay27, btnPlay28, btnPlay29, btnPlay30, btnPlay31, btnPlay32, btnPlay33, btnPlay34, btnPlay35, btnPlay36, btnPlay37, btnPlay38, btnPlay39, btnPlay40, btnPlay41, btnPlay42, btnPlay43, btnPlay44, btnPlay45, btnPlay46, btnPlay47, btnPlay48, btnPlay49;
    private ImageButton btnFav, btnFav1, btnFav2, btnFav3, btnFav4, btnFav5, btnFav6, btnFav7, btnFav8, btnFav9, btnFav10, btnFav11, btnFav12, btnFav13, btnFav14, btnFav15, btnFav16, btnFav17, btnFav18, btnFav19, btnFav20, btnFav21, btnFav22, btnFav23, btnFav24, btnFav25, btnFav26, btnFav27, btnFav28, btnFav29, btnFav30, btnFav31, btnFav32, btnFav33, btnFav34, btnFav35, btnFav36, btnFav37, btnFav38, btnFav39, btnFav40, btnFav41, btnFav42, btnFav43, btnFav44, btnFav45, btnFav46, btnFav47, btnFav48, btnFav49;
    private TextView tvCina1,tvCina2,tvCina3, tvCina4, tvCina5, tvCina6, tvCina7, tvCina8,  tvCina9, tvCina10, tvCina11, tvCina12, tvCina13, tvCina14, tvCina15, tvCina16, tvCina17, tvCina18, tvCina19, tvCina20, tvCina21, tvCina22, tvCina23, tvCina24, tvCina25, tvCina26, tvCina27, tvCina28, tvCina29, tvCina30, tvCina31, tvCina32, tvCina33, tvCina34, tvCina35, tvCina36, tvCina37, tvCina38, tvCina39, tvCina40, tvCina41, tvCina42, tvCina43, tvCina44, tvCina45, tvCina46, tvCina47, tvCina48, tvCina49, tvCina50;
    private TextView tvEja1, tvEja2, tvEja3, tvEja4, tvEja5, tvEja6, tvEja7, tvEja8, tvEja9, tvEja10, tvEja11, tvEja12, tvEja13, tvEja14, tvEja15, tvEja16, tvEja17, tvEja18, tvEja19, tvEja20, tvEja21, tvEja22, tvEja23, tvEja24, tvEja25, tvEja26, tvEja27, tvEja28, tvEja29, tvEja30, tvEja31, tvEja32, tvEja33, tvEja34, tvEja35, tvEja36, tvEja37, tvEja38, tvEja39, tvEja40, tvEja41, tvEja42, tvEja43, tvEja44, tvEja45, tvEja46, tvEja47, tvEja48, tvEja49, tvEja50;
    private TextView tvIndo1, tvIndo2, tvIndo3, tvIndo4, tvIndo5, tvIndo6, tvIndo7, tvIndo8, tvIndo9, tvIndo10, tvIndo11, tvIndo12, tvIndo13, tvIndo14, tvIndo15, tvIndo16, tvIndo17, tvIndo18,tvIndo19, tvIndo20, tvIndo21, tvIndo22, tvIndo23, tvIndo24, tvIndo25, tvIndo26, tvIndo27, tvIndo28, tvIndo29, tvIndo30, tvIndo31, tvIndo32, tvIndo33, tvIndo34, tvIndo35, tvIndo36, tvIndo37, tvIndo38, tvIndo39, tvIndo40, tvIndo41, tvIndo42, tvIndo43, tvIndo44, tvIndo45, tvIndo46, tvIndo47, tvIndo48, tvIndo49, tvIndo50;
    private MediaPlayer mp;
    private Db db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_kerja);

        db = Db.getInstance(this);

        mp = new MediaPlayer();

        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        btnPlay1 = (ImageButton) findViewById(R.id.btnPlay1);
        btnPlay2 = (ImageButton) findViewById(R.id.btnPlay2);
        btnPlay3 = (ImageButton) findViewById(R.id.btnPlay3);
        btnPlay4 = (ImageButton) findViewById(R.id.btnPlay4);
        btnPlay5 = (ImageButton) findViewById(R.id.btnPlay5);
        btnPlay6 = (ImageButton) findViewById(R.id.btnPlay6);
        btnPlay7 = (ImageButton) findViewById(R.id.btnPlay7);
        btnPlay8 = (ImageButton) findViewById(R.id.btnPlay8);
        btnPlay9 = (ImageButton) findViewById(R.id.btnPlay9);
        btnPlay10 = (ImageButton) findViewById(R.id.btnPlay10);
        btnPlay11 = (ImageButton) findViewById(R.id.btnPlay11);
        btnPlay12 = (ImageButton) findViewById(R.id.btnPlay12);
        btnPlay13 = (ImageButton) findViewById(R.id.btnPlay13);
        btnPlay14 = (ImageButton) findViewById(R.id.btnPlay14);
        btnPlay15 = (ImageButton) findViewById(R.id.btnPlay15);
        btnPlay16 = (ImageButton) findViewById(R.id.btnPlay16);
        btnPlay17 = (ImageButton) findViewById(R.id.btnPlay17);
        btnPlay18 = (ImageButton) findViewById(R.id.btnPlay18);
        btnPlay19 = (ImageButton) findViewById(R.id.btnPlay19);
        btnPlay20 = (ImageButton) findViewById(R.id.btnPlay20);
        btnPlay21 = (ImageButton) findViewById(R.id.btnPlay21);
        btnPlay22 = (ImageButton) findViewById(R.id.btnPlay22);
        btnPlay23 = (ImageButton) findViewById(R.id.btnPlay23);
        btnPlay24 = (ImageButton) findViewById(R.id.btnPlay24);
        btnPlay25 = (ImageButton) findViewById(R.id.btnPlay25);
        btnPlay26 = (ImageButton) findViewById(R.id.btnPlay26);
        btnPlay27 = (ImageButton) findViewById(R.id.btnPlay27);
        btnPlay28 = (ImageButton) findViewById(R.id.btnPlay28);
        btnPlay29 = (ImageButton) findViewById(R.id.btnPlay29);
        btnPlay30 = (ImageButton) findViewById(R.id.btnPlay30);
        btnPlay31 = (ImageButton) findViewById(R.id.btnPlay31);
        btnPlay32 = (ImageButton) findViewById(R.id.btnPlay32);
        btnPlay33 = (ImageButton) findViewById(R.id.btnPlay33);
        btnPlay34 = (ImageButton) findViewById(R.id.btnPlay34);
        btnPlay35 = (ImageButton) findViewById(R.id.btnPlay35);
        btnPlay36 = (ImageButton) findViewById(R.id.btnPlay36);
        btnPlay37 = (ImageButton) findViewById(R.id.btnPlay37);
        btnPlay38 = (ImageButton) findViewById(R.id.btnPlay38);
        btnPlay39 = (ImageButton) findViewById(R.id.btnPlay39);
        btnPlay40 = (ImageButton) findViewById(R.id.btnPlay40);
        btnPlay41 = (ImageButton) findViewById(R.id.btnPlay41);
        btnPlay42 = (ImageButton) findViewById(R.id.btnPlay42);
        btnPlay43 = (ImageButton) findViewById(R.id.btnPlay43);
        btnPlay44 = (ImageButton) findViewById(R.id.btnPlay44);
        btnPlay45 = (ImageButton) findViewById(R.id.btnPlay45);
        btnPlay46 = (ImageButton) findViewById(R.id.btnPlay46);
        btnPlay47 = (ImageButton) findViewById(R.id.btnPlay47);
        btnPlay48 = (ImageButton) findViewById(R.id.btnPlay48);
        btnPlay49 = (ImageButton) findViewById(R.id.btnPlay49);



        btnPlay.setOnClickListener(this);
        btnPlay1.setOnClickListener(this);
        btnPlay2.setOnClickListener(this);
        btnPlay3.setOnClickListener(this);
        btnPlay4.setOnClickListener(this);
        btnPlay5.setOnClickListener(this);
        btnPlay6.setOnClickListener(this);
        btnPlay7.setOnClickListener(this);
        btnPlay8.setOnClickListener(this);
        btnPlay9.setOnClickListener(this);
        btnPlay10.setOnClickListener(this);
        btnPlay11.setOnClickListener(this);
        btnPlay12.setOnClickListener(this);
        btnPlay13.setOnClickListener(this);
        btnPlay14.setOnClickListener(this);
        btnPlay15.setOnClickListener(this);
        btnPlay16.setOnClickListener(this);
        btnPlay17.setOnClickListener(this);
        btnPlay18.setOnClickListener(this);
        btnPlay19.setOnClickListener(this);
        btnPlay20.setOnClickListener(this);
        btnPlay21.setOnClickListener(this);
        btnPlay22.setOnClickListener(this);
        btnPlay23.setOnClickListener(this);
        btnPlay24.setOnClickListener(this);
        btnPlay25.setOnClickListener(this);
        btnPlay26.setOnClickListener(this);
        btnPlay27.setOnClickListener(this);
        btnPlay28.setOnClickListener(this);
        btnPlay29.setOnClickListener(this);
        btnPlay30.setOnClickListener(this);
        btnPlay31.setOnClickListener(this);
        btnPlay32.setOnClickListener(this);
        btnPlay33.setOnClickListener(this);
        btnPlay34.setOnClickListener(this);
        btnPlay35.setOnClickListener(this);
        btnPlay36.setOnClickListener(this);
        btnPlay37.setOnClickListener(this);
        btnPlay38.setOnClickListener(this);
        btnPlay39.setOnClickListener(this);
        btnPlay40.setOnClickListener(this);
        btnPlay41.setOnClickListener(this);
        btnPlay42.setOnClickListener(this);
        btnPlay43.setOnClickListener(this);
        btnPlay44.setOnClickListener(this);
        btnPlay45.setOnClickListener(this);
        btnPlay46.setOnClickListener(this);
        btnPlay47.setOnClickListener(this);
        btnPlay48.setOnClickListener(this);
        btnPlay49.setOnClickListener(this);

        tvCina1 = findViewById(R.id.tv_cina1);
        tvEja1 = findViewById(R.id.tv_eja1);
        tvIndo1 = findViewById(R.id.tv_indo1);
        btnFav = findViewById(R.id.btnFav);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo1.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina1.getText().toString(), tvEja1.getText().toString(), tvIndo1.getText().toString(), "R.raw.buka");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo1.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina2 = findViewById(R.id.tv_cina2);
        tvEja2 = findViewById(R.id.tv_eja2);
        tvIndo2 = findViewById(R.id.tv_indo2);
        btnFav1 = findViewById(R.id.btnFav1);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav1.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav1.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav1.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo2.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina2.getText().toString(), tvEja2.getText().toString(), tvIndo2.getText().toString(), "R.raw.berjalankaki");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav1.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo2.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav1.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina3 = findViewById(R.id.tv_cina3);
        tvEja3 = findViewById(R.id.tv_eja3);
        tvIndo3 = findViewById(R.id.tv_indo3);
        btnFav2 = findViewById(R.id.btnFav2);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav2.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav2.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav2.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo3.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina3.getText().toString(), tvEja3.getText().toString(), tvIndo3.getText().toString(), "R.raw.bertiup");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav2.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo3.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav2.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina4 = findViewById(R.id.tv_cina4);
        tvEja4 = findViewById(R.id.tv_eja4);
        tvIndo4 = findViewById(R.id.tv_indo4);
        btnFav3 = findViewById(R.id.btnFav3);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav3.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav3.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav3.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo4.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina4.getText().toString(), tvEja4.getText().toString(), tvIndo4.getText().toString(), "R.raw.mnegenakancelana");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav3.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo4.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav3.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina5 = findViewById(R.id.tv_cina5);
        tvEja5 = findViewById(R.id.tv_eja5);
        tvIndo5 = findViewById(R.id.tv_indo5);
        btnFav4 = findViewById(R.id.btnFav4);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav4.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav4.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav4.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo5.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina5.getText().toString(), tvEja5.getText().toString(), tvIndo5.getText().toString(), "R.raw.bekerja");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav4.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo5.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav4.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina6 = findViewById(R.id.tv_cina6);
        tvEja6 = findViewById(R.id.tv_eja6);
        tvIndo6 = findViewById(R.id.tv_indo6);
        btnFav5 = findViewById(R.id.btnFav5);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav5.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav5.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav5.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo6.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina6.getText().toString(), tvEja6.getText().toString(), tvIndo6.getText().toString(), "R.raw.menarik1");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav5.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo6.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav5.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina7 = findViewById(R.id.tv_cina7);
        tvEja7 = findViewById(R.id.tv_eja7);
        tvIndo7 = findViewById(R.id.tv_indo7);
        btnFav6 = findViewById(R.id.btnFav6);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav6.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav6.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav6.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo7.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina7.getText().toString(), tvEja7.getText().toString(), tvIndo7.getText().toString(), "R.raw.pergi");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav6.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo7.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav6.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina8 = findViewById(R.id.tv_cina8);
        tvEja8 = findViewById(R.id.tv_eja8);
        tvIndo8 = findViewById(R.id.tv_indo8);
        btnFav7 = findViewById(R.id.btnFav7);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav7.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav7.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav7.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo8.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina8.getText().toString(), tvEja8.getText().toString(), tvIndo8.getText().toString(), "R.raw.menulis");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav7.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo8.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav7.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });


        tvCina9 = findViewById(R.id.tv_cina9);
        tvEja9 = findViewById(R.id.tv_eja9);
        tvIndo9 = findViewById(R.id.tv_indo9);
        btnFav8 = findViewById(R.id.btnFav8);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav8.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav8.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav8.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo9.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina9.getText().toString(), tvEja9.getText().toString(), tvIndo9.getText().toString(), "R.raw.mendengar");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav8.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo9.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav8.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina10 = findViewById(R.id.tv_cina10);
        tvEja10 = findViewById(R.id.tv_eja10);
        tvIndo10 = findViewById(R.id.tv_indo10);
        btnFav9 = findViewById(R.id.btnFav9);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav9.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav9.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav9.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo10.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina10.getText().toString(), tvEja10.getText().toString(), tvIndo10.getText().toString(), "R.raw.menggosok");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav9.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo10.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav9.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina11 = findViewById(R.id.tv_cina11);
        tvEja11 = findViewById(R.id.tv_eja11);
        tvIndo11 = findViewById(R.id.tv_indo11);
        btnFav10 = findViewById(R.id.btnFav10);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav10.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav10.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav10.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo11.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina11.getText().toString(), tvEja11.getText().toString(), tvIndo11.getText().toString(), "R.raw.bersuara");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav10.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo11.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav10.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina12 = findViewById(R.id.tv_cina12);
        tvEja12 = findViewById(R.id.tv_eja12);
        tvIndo12 = findViewById(R.id.tv_indo12);
        btnFav11 = findViewById(R.id.btnFav11);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav11.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav11.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav11.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo12.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina12.getText().toString(), tvEja12.getText().toString(), tvIndo12.getText().toString(), "R.raw.meletakan");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav11.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo12.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav11.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina13 = findViewById(R.id.tv_cina13);
        tvEja13 = findViewById(R.id.tv_eja13);
        tvIndo13 = findViewById(R.id.tv_indo13);
        btnFav12 = findViewById(R.id.btnFav12);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav12.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav12.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav12.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo13.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina13.getText().toString(), tvEja13.getText().toString(), tvIndo13.getText().toString(), "R.raw.berkembang");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav12.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo13.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav12.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina14 = findViewById(R.id.tv_cina14);
        tvEja14 = findViewById(R.id.tv_eja14);
        tvIndo14 = findViewById(R.id.tv_indo14);
        btnFav13 = findViewById(R.id.btnFav13);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav13.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav13.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav13.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo14.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina14.getText().toString(), tvEja14.getText().toString(), tvIndo14.getText().toString(), "R.raw.tiba");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav13.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo14.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav13.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina15 = findViewById(R.id.tv_cina15);
        tvEja15 = findViewById(R.id.tv_eja15);
        tvIndo15 = findViewById(R.id.tv_indo15);
        btnFav14 = findViewById(R.id.btnFav14);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav14.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav14.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav14.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo15.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina15.getText().toString(), tvEja15.getText().toString(), tvIndo15.getText().toString(), "R.raw.meninggalkan");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav14.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo15.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav14.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina16 = findViewById(R.id.tv_cina16);
        tvEja16 = findViewById(R.id.tv_eja16);
        tvIndo16 = findViewById(R.id.tv_indo16);
        btnFav15 = findViewById(R.id.btnFav15);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav15.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav15.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav15.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo16.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina16.getText().toString(), tvEja16.getText().toString(), tvIndo16.getText().toString(), "R.raw.berenang");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav15.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo16.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav15.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina17 = findViewById(R.id.tv_cina17);
        tvEja17 = findViewById(R.id.tv_eja17);
        tvIndo17 = findViewById(R.id.tv_indo17);
        btnFav16 = findViewById(R.id.btnFav16);


        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav16.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav16.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav16.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo17.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina17.getText().toString(), tvEja17.getText().toString(), tvIndo17.getText().toString(), "R.raw.bermain");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav16.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo17.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav16.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina18 = findViewById(R.id.tv_cina18);
        tvEja18 = findViewById(R.id.tv_eja18);
        tvIndo18 = findViewById(R.id.tv_indo18);
        btnFav17 = findViewById(R.id.btnFav17);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav17.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav17.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav17.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo18.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina18.getText().toString(), tvEja18.getText().toString(), tvIndo18.getText().toString(), "R.raw.berbaris");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav17.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo18.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav17.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina19 = findViewById(R.id.tv_cina19);
        tvEja19 = findViewById(R.id.tv_eja19);
        tvIndo19 = findViewById(R.id.tv_indo19);
        btnFav18 = findViewById(R.id.btnFav18);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav18.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav18.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav18.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo19.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina19.getText().toString(), tvEja19.getText().toString(), tvIndo19.getText().toString(), "R.raw.terbang");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav18.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo19.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav18.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina20 = findViewById(R.id.tv_cina20);
        tvEja20 = findViewById(R.id.tv_eja20);
        tvIndo20 = findViewById(R.id.tv_indo20);
        btnFav19 = findViewById(R.id.btnFav19);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav19.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav19.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav19.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo20.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina20.getText().toString(), tvEja20.getText().toString(), tvIndo20.getText().toString(), "R.raw.memanggil");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav19.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo20.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav19.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina21 = findViewById(R.id.tv_cina21);
        tvEja21 = findViewById(R.id.tv_eja21);
        tvIndo21 = findViewById(R.id.tv_indo21);
        btnFav20 = findViewById(R.id.btnFav20);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav20.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav20.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav20.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo21.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina21.getText().toString(), tvEja21.getText().toString(), tvIndo21.getText().toString(), "R.raw.minum");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav20.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo21.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav20.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina22 = findViewById(R.id.tv_cina22);
        tvEja22 = findViewById(R.id.tv_eja22);
        tvIndo22 = findViewById(R.id.tv_indo22);
        btnFav21 = findViewById(R.id.btnFav21);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav21.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav21.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav21.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo21.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina21.getText().toString(), tvEja21.getText().toString(), tvIndo21.getText().toString(), "R.raw.tinggal");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav21.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo21.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav21.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina23 = findViewById(R.id.tv_cina23);
        tvEja23 = findViewById(R.id.tv_eja23);
        tvIndo23 = findViewById(R.id.tv_indo23);
        btnFav22 = findViewById(R.id.btnFav22);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav22.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav22.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav22.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo23.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina23.getText().toString(), tvEja23.getText().toString(), tvIndo23.getText().toString(), "R.raw.meminta");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav22.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo23.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav22.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina24 = findViewById(R.id.tv_cina24);
        tvEja24 = findViewById(R.id.tv_eja24);
        tvIndo24 = findViewById(R.id.tv_indo24);
        btnFav23 = findViewById(R.id.btnFav23);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav23.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav23.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav23.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo24.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina24.getText().toString(), tvEja24.getText().toString(), tvIndo24.getText().toString(), "R.raw.beristirahat");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav23.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo24.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav23.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina25 = findViewById(R.id.tv_cina25);
        tvEja25 = findViewById(R.id.tv_eja25);
        tvIndo25 = findViewById(R.id.tv_indo25);
        btnFav24 = findViewById(R.id.btnFav24);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav24.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav24.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav24.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo25.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina25.getText().toString(), tvEja25.getText().toString(), tvIndo25.getText().toString(), "R.raw.membaca");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav24.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo25.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav24.setBackground(getResources().getDrawable(R.drawable.bintang_border));

            }
        });

        tvCina26 = findViewById(R.id.tv_cina26);
        tvEja26 = findViewById(R.id.tv_eja26);
        tvIndo26 = findViewById(R.id.tv_indo26);
        btnFav25 = findViewById(R.id.btnFav25);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav25.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav25.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav25.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo26.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina26.getText().toString(), tvEja26.getText().toString(), tvIndo26.getText().toString(), "R.raw.mati");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav25.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo26.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav25.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina27 = findViewById(R.id.tv_cina27);
        tvEja27 = findViewById(R.id.tv_eja27);
        tvIndo27 = findViewById(R.id.tv_indo27);
        btnFav26 = findViewById(R.id.btnFav26);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav26.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav26.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav26.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo27.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina27.getText().toString(), tvEja27.getText().toString(), tvIndo27.getText().toString(), "R.raw.bertemu");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav26.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo27.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav26.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina28 = findViewById(R.id.tv_cina28);
        tvEja28 = findViewById(R.id.tv_eja28);
        tvIndo28 = findViewById(R.id.tv_indo28);
        btnFav27 = findViewById(R.id.btnFav27);


        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav27.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav27.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav27.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo28.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina28.getText().toString(), tvEja28.getText().toString(), tvIndo28.getText().toString(), "R.raw.mencuci");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav27.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo28.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav27.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina29 = findViewById(R.id.tv_cina29);
        tvEja29 = findViewById(R.id.tv_eja29);
        tvIndo29 = findViewById(R.id.tv_indo29);
        btnFav28 = findViewById(R.id.btnFav28);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav28.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav28.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav28.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo29.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina29.getText().toString(), tvEja29.getText().toString(), tvIndo29.getText().toString(), "R.raw.berbeda");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav28.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo29.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav28.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina30 = findViewById(R.id.tv_cina30);
        tvEja30 = findViewById(R.id.tv_eja30);
        tvIndo30 = findViewById(R.id.tv_indo30);
        btnFav29 = findViewById(R.id.btnFav29);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav29.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav29.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav29.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo30.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina30.getText().toString(), tvEja30.getText().toString(), tvIndo30.getText().toString(), "R.raw.berkata");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav29.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo30.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav29.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina31 = findViewById(R.id.tv_cina31);
        tvEja31 = findViewById(R.id.tv_eja31);
        tvIndo31 = findViewById(R.id.tv_indo31);
        btnFav30 = findViewById(R.id.btnFav30);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav30.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav30.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav30.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo31.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina31.getText().toString(), tvEja31.getText().toString(), tvIndo31.getText().toString(), "R.raw.membeli");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav30.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo31.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav30.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina32 = findViewById(R.id.tv_cina32);
        tvEja32 = findViewById(R.id.tv_eja32);
        tvIndo32 = findViewById(R.id.tv_indo32);
        btnFav31 = findViewById(R.id.btnFav31);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav31.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav31.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav31.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo32.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina32.getText().toString(), tvEja32.getText().toString(), tvIndo32.getText().toString(), "R.raw.belajar");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav31.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo32.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav31.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina33 = findViewById(R.id.tv_cina33);
        tvEja33 = findViewById(R.id.tv_eja33);
        tvIndo33 = findViewById(R.id.tv_indo33);
        btnFav32 = findViewById(R.id.btnFav32);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav32.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav32.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav32.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo33.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina33.getText().toString(), tvEja33.getText().toString(), tvIndo33.getText().toString(), "R.raw.menghisap");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav32.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo33.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav32.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina34 = findViewById(R.id.tv_cina34);
        tvEja34 = findViewById(R.id.tv_eja34);
        tvIndo34 = findViewById(R.id.tv_indo34);
        btnFav33 = findViewById(R.id.btnFav33);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav33.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav33.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav33.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo34.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina34.getText().toString(), tvEja34.getText().toString(), tvIndo34.getText().toString(), "R.raw.memakai");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav33.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo34.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav33.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina35 = findViewById(R.id.tv_cina35);
        tvEja35 = findViewById(R.id.tv_eja35);
        tvIndo35 = findViewById(R.id.tv_indo35);
        btnFav34 = findViewById(R.id.btnFav34);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav34.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav34.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav34.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo35.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina35.getText().toString(), tvEja35.getText().toString(), tvIndo35.getText().toString(), "R.raw.bernyanyi");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav34.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo35.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav34.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina36 = findViewById(R.id.tv_cina36);
        tvEja36 = findViewById(R.id.tv_eja36);
        tvIndo36 = findViewById(R.id.tv_indo36);
        btnFav35 = findViewById(R.id.btnFav35);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav35.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav35.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav35.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo36.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina36.getText().toString(), tvEja36.getText().toString(), tvIndo36.getText().toString(), "R.raw.menunggu");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav35.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo36.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav35.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina37 = findViewById(R.id.tv_cina37);
        tvEja37 = findViewById(R.id.tv_eja37);
        tvIndo37 = findViewById(R.id.tv_indo37);
        btnFav36 = findViewById(R.id.btnFav36);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav36.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav36.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav36.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo37.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina37.getText().toString(), tvEja37.getText().toString(), tvIndo37.getText().toString(), "R.raw.membawa");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav36.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo37.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav36.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina38 = findViewById(R.id.tv_cina38);
        tvEja38 = findViewById(R.id.tv_eja38);
        tvIndo38 = findViewById(R.id.tv_indo38);
        btnFav37 = findViewById(R.id.btnFav37);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav37.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav37.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav37.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo38.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina38.getText().toString(), tvEja38.getText().toString(), tvIndo38.getText().toString(), "R.raw.berdiri");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav37.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo38.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav37.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina39 = findViewById(R.id.tv_cina39);
        tvEja39 = findViewById(R.id.tv_eja39);
        tvIndo39 = findViewById(R.id.tv_indo39);
        btnFav38 = findViewById(R.id.btnFav38);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav38.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav38.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav38.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo39.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina39.getText().toString(), tvEja39.getText().toString(), tvIndo39.getText().toString(), "R.raw.ada");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav38.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo39.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav38.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina40 = findViewById(R.id.tv_cina40);
        tvEja40 = findViewById(R.id.tv_eja40);
        tvIndo40 = findViewById(R.id.tv_indo40);
        btnFav39 = findViewById(R.id.btnFav39);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav39.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav39.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav39.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo40.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina40.getText().toString(), tvEja40.getText().toString(), tvIndo40.getText().toString(), "R.raw.turun");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav39.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo40.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav39.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina41 = findViewById(R.id.tv_cina41);
        tvEja41 = findViewById(R.id.tv_eja41);
        tvIndo41 = findViewById(R.id.tv_indo41);
        btnFav40 = findViewById(R.id.btnFav40);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav40.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav40.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav40.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo41.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina41.getText().toString(), tvEja41.getText().toString(), tvIndo41.getText().toString(), "R.raw.masuk");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav40.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo41.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav40.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina42 = findViewById(R.id.tv_cina42);
        tvEja42 = findViewById(R.id.tv_eja42);
        tvIndo42 = findViewById(R.id.tv_indo42);
        btnFav41 = findViewById(R.id.btnFav41);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav41.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav41.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav41.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo42.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina42.getText().toString(), tvEja42.getText().toString(), tvIndo42.getText().toString(), "R.raw.mulai");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav41.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo42.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav41.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina43 = findViewById(R.id.tv_cina43);
        tvEja43 = findViewById(R.id.tv_eja43);
        tvIndo43 = findViewById(R.id.tv_indo43);
        btnFav42 = findViewById(R.id.btnFav42);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav42.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav42.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav42.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo43.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina43.getText().toString(), tvEja43.getText().toString(), tvIndo43.getText().toString(), "R.raw.menempelkan");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav42.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo43.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav42.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina44 = findViewById(R.id.tv_cina44);
        tvEja44 = findViewById(R.id.tv_eja44);
        tvIndo44 = findViewById(R.id.tv_indo44);
        btnFav43 = findViewById(R.id.btnFav43);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav43.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav43.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav43.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo44.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina44.getText().toString(), tvEja44.getText().toString(), tvIndo44.getText().toString(), "R.raw.berlari");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav43.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo44.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav43.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina45 = findViewById(R.id.tv_cina45);
        tvEja45 = findViewById(R.id.tv_eja45);
        tvIndo45 = findViewById(R.id.tv_indo45);
        btnFav44 = findViewById(R.id.btnFav44);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav44.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav44.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav44.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo45.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina45.getText().toString(), tvEja45.getText().toString(), tvIndo45.getText().toString(), "R.raw.butuh");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav44.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo45.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav44.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina46 = findViewById(R.id.tv_cina46);
        tvEja46 = findViewById(R.id.tv_eja46);
        tvIndo46 = findViewById(R.id.tv_indo46);
        btnFav45 = findViewById(R.id.btnFav45);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav45.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav45.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav45.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo46.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina46.getText().toString(), tvEja46.getText().toString(), tvIndo46.getText().toString(), "R.raw.pulang");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav45.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo46.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav45.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina47 = findViewById(R.id.tv_cina47);
        tvEja47 = findViewById(R.id.tv_eja47);
        tvIndo47 = findViewById(R.id.tv_indo47);
        btnFav46 = findViewById(R.id.btnFav46);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav46.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav46.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav46.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo47.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina47.getText().toString(), tvEja47.getText().toString(), tvIndo47.getText().toString(), "R.raw.memerlukan");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav46.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo47.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav46.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina48 = findViewById(R.id.tv_cina48);
        tvEja48 = findViewById(R.id.tv_eja48);
        tvIndo48 = findViewById(R.id.tv_indo48);
        btnFav47 = findViewById(R.id.btnFav47);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav47.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav47.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav47.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo48.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina48.getText().toString(), tvEja48.getText().toString(), tvIndo48.getText().toString(), "R.raw.memotong");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav47.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo48.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav47.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina49 = findViewById(R.id.tv_cina49);
        tvEja49 = findViewById(R.id.tv_eja49);
        tvIndo49 = findViewById(R.id.tv_indo49);
        btnFav48 = findViewById(R.id.btnFav48);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav48.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav48.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav48.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo49.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina49.getText().toString(), tvEja49.getText().toString(), tvIndo49.getText().toString(), "R.raw.menyusahkan");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav48.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo49.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav48.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });

        tvCina50 = findViewById(R.id.tv_cina50);
        tvEja50 = findViewById(R.id.tv_eja50);
        tvIndo50 = findViewById(R.id.tv_indo50);
        btnFav49 = findViewById(R.id.btnFav49);

        if(db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim()) == 0){
            btnFav49.setBackground(getResources().getDrawable(R.drawable.bintang_border));
        }else{
            btnFav49.setBackground(getResources().getDrawable(R.drawable.bintang));
        }

        btnFav49.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataKerjaByNama(tvIndo50.getText().toString().trim());
            if (jumlah == 0) {
                KataKerjaEntity katakerja = new KataKerjaEntity(0, tvCina50.getText().toString(), tvEja50.getText().toString(), tvIndo50.getText().toString(), "R.raw.mendung");
                db.getDao().insertKataKerja(katakerja);
                Toast.makeText(this, "Kata Kerja berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
                btnFav49.setBackground(getResources().getDrawable(R.drawable.bintang));
            }else{
                db.getDao().deleteKataKerja(tvIndo50.getText().toString().trim());
                Toast.makeText(this, "Kata Kerja di hapus pada favorite", Toast.LENGTH_SHORT).show();
                btnFav49.setBackground(getResources().getDrawable(R.drawable.bintang_border));
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                mp = MediaPlayer.create(this, R.raw.buka);
                play();
                btnPlay.setEnabled(false);
                break;
            case R.id.btnPlay1:
                mp = MediaPlayer.create(this, R.raw.berjalankaki);
                play();
                btnPlay1.setEnabled(false);
            case R.id.btnPlay2:
                mp = MediaPlayer.create(this, R.raw.bertiup);
                play();
                btnPlay2.setEnabled(false);
                break;
            case R.id.btnPlay3:
                mp = MediaPlayer.create(this, R.raw.mnegenakancelana);
                play();
                btnPlay3.setEnabled(false);
                break;
            case R.id.btnPlay4:
                mp = MediaPlayer.create(this, R.raw.berkerja);
                play();
                btnPlay4.setEnabled(false);
                break;
            case R.id.btnPlay5:
                mp = MediaPlayer.create(this, R.raw.menarik1);
                play();
                btnPlay5.setEnabled(false);
                break;
            case R.id.btnPlay6:
                mp = MediaPlayer.create(this, R.raw.pergi);
                play();
                btnPlay6.setEnabled(false);
                break;
            case R.id.btnPlay7:
                mp = MediaPlayer.create(this, R.raw.menulis);
                play();
                btnPlay7.setEnabled(false);
                break;
            case R.id.btnPlay8:
                mp = MediaPlayer.create(this, R.raw.mendengar);
                play();
                btnPlay8.setEnabled(false);
                break;
            case R.id.btnPlay9:
                mp = MediaPlayer.create(this, R.raw.menggosok);
                play();
                btnPlay9.setEnabled(false);
                break;
            case R.id.btnPlay10:
                mp = MediaPlayer.create(this, R.raw.bersuara);
                play();
                btnPlay10.setEnabled(false);
                break;
            case R.id.btnPlay11:
                mp = MediaPlayer.create(this, R.raw.meletakan);
                play();
                btnPlay11.setEnabled(false);
                break;
            case R.id.btnPlay12:
                mp = MediaPlayer.create(this, R.raw.berkembang);
                play();
                btnPlay12.setEnabled(false);
                break;
            case R.id.btnPlay13:
                mp = MediaPlayer.create(this, R.raw.tiba);
                play();
                btnPlay13.setEnabled(false);
                break;
            case R.id.btnPlay14:
                mp = MediaPlayer.create(this, R.raw.meninggalkan);
                play();
                btnPlay14.setEnabled(false);
                break;
            case R.id.btnPlay15:
                mp = MediaPlayer.create(this, R.raw.berenang);
                play();
                btnPlay15.setEnabled(false);
                break;
            case R.id.btnPlay16:
                mp = MediaPlayer.create(this, R.raw.bermain);
                play();
                btnPlay16.setEnabled(false);
                break;
            case R.id.btnPlay17:
                mp = MediaPlayer.create(this, R.raw.berbaris);
                play();
                btnPlay17.setEnabled(false);
                break;
            case R.id.btnPlay18:
                mp = MediaPlayer.create(this, R.raw.terbang);
                play();
                btnPlay18.setEnabled(false);
                break;
            case R.id.btnPlay19:
                mp = MediaPlayer.create(this, R.raw.memanggil);
                play();
                btnPlay19.setEnabled(false);
                break;
            case R.id.btnPlay20:
                mp = MediaPlayer.create(this, R.raw.minum);
                play();
                btnPlay20.setEnabled(false);
                break;
            case R.id.btnPlay21:
                mp = MediaPlayer.create(this, R.raw.tinggal);
                play();
                btnPlay21.setEnabled(false);
                break;
            case R.id.btnPlay22:
                mp = MediaPlayer.create(this, R.raw.meminta);
                play();
                btnPlay22.setEnabled(false);
                break;
            case R.id.btnPlay23:
                mp = MediaPlayer.create(this, R.raw.beristirahat);
                play();
                btnPlay23.setEnabled(false);
                break;
            case R.id.btnPlay24:
                mp = MediaPlayer.create(this, R.raw.membaca);
                play();
                btnPlay24.setEnabled(false);
                break;
            case R.id.btnPlay25:
                mp = MediaPlayer.create(this, R.raw.mati);
                play();
                btnPlay25.setEnabled(false);
                break;
            case R.id.btnPlay26:
                mp = MediaPlayer.create(this, R.raw.bertemu);
                play();
                btnPlay26.setEnabled(false);
                break;
            case R.id.btnPlay27:
                mp = MediaPlayer.create(this, R.raw.mencuci);
                play();
                btnPlay27.setEnabled(false);
                break;
            case R.id.btnPlay28:
                mp = MediaPlayer.create(this, R.raw.berbeda);
                play();
                btnPlay28.setEnabled(false);
                break;
            case R.id.btnPlay29:
                mp = MediaPlayer.create(this, R.raw.berkata);
                play();
                btnPlay29.setEnabled(false);
                break;
            case R.id.btnPlay30:
                mp = MediaPlayer.create(this, R.raw.membeli);
                play();
                btnPlay30.setEnabled(false);
                break;
            case R.id.btnPlay31:
                mp = MediaPlayer.create(this, R.raw.belajar);
                play();
                btnPlay31.setEnabled(false);
                break;
            case R.id.btnPlay32:
                mp = MediaPlayer.create(this, R.raw.menghisap);
                play();
                btnPlay32.setEnabled(false);
                break;
            case R.id.btnPlay33:
                mp = MediaPlayer.create(this, R.raw.memakai);
                play();
                btnPlay33.setEnabled(false);
                break;
            case R.id.btnPlay34:
                mp = MediaPlayer.create(this, R.raw.bernyanyi);
                play();
                btnPlay34.setEnabled(false);
                break;
            case R.id.btnPlay35:
                mp = MediaPlayer.create(this, R.raw.menunggu);
                play();
                btnPlay35.setEnabled(false);
                break;
            case R.id.btnPlay36:
                mp = MediaPlayer.create(this, R.raw.membawa);
                play();
                btnPlay36.setEnabled(false);
                break;
            case R.id.btnPlay37:
                mp = MediaPlayer.create(this, R.raw.berdiri);
                play();
                btnPlay37.setEnabled(false);
                break;
            case R.id.btnPlay38:
                mp = MediaPlayer.create(this, R.raw.ada);
                play();
                btnPlay38.setEnabled(false);
                break;
            case R.id.btnPlay39:
                mp = MediaPlayer.create(this, R.raw.turun);
                play();
                btnPlay39.setEnabled(false);
                break;
            case R.id.btnPlay40:
                mp = MediaPlayer.create(this, R.raw.masuk);
                play();
                btnPlay40.setEnabled(false);
                break;
            case R.id.btnPlay41:
                mp = MediaPlayer.create(this, R.raw.mulai);
                play();
                btnPlay41.setEnabled(false);
                break;
            case R.id.btnPlay42:
                mp = MediaPlayer.create(this, R.raw.menempelkan);
                play();
                btnPlay42.setEnabled(false);
                break;
            case R.id.btnPlay43:
                mp = MediaPlayer.create(this, R.raw.berlari);
                play();
                btnPlay43.setEnabled(false);
                break;
            case R.id.btnPlay44:
                mp = MediaPlayer.create(this, R.raw.butuh);
                play();
                btnPlay44.setEnabled(false);
                break;
            case R.id.btnPlay45:
                mp = MediaPlayer.create(this, R.raw.pulang);
                play();
                btnPlay45.setEnabled(false);
                break;
            case R.id.btnPlay46:
                mp = MediaPlayer.create(this, R.raw.memerlukan);
                play();
                btnPlay46.setEnabled(false);
                break;
            case R.id.btnPlay47:
                mp = MediaPlayer.create(this, R.raw.memotong);
                play();
                btnPlay47.setEnabled(false);
                break;
            case R.id.btnPlay48:
                mp = MediaPlayer.create(this, R.raw.menyusahkan);
                play();
                btnPlay48.setEnabled(false);
                break;
            case R.id.btnPlay49:
                mp = MediaPlayer.create(this, R.raw.mendung);
                play();
                btnPlay49.setEnabled(false);
                break;
        }
    }

    public void stateAwal() {
        btnPlay.setEnabled(true);
        btnPlay1.setEnabled(true);
        btnPlay2.setEnabled(true);
        btnPlay3.setEnabled(true);
        btnPlay4.setEnabled(true);
        btnPlay5.setEnabled(true);
        btnPlay6.setEnabled(true);
        btnPlay7.setEnabled(true);
        btnPlay8.setEnabled(true);
        btnPlay9.setEnabled(true);
        btnPlay10.setEnabled(true);
        btnPlay11.setEnabled(true);
        btnPlay12.setEnabled(true);
        btnPlay13.setEnabled(true);
        btnPlay14.setEnabled(true);
        btnPlay15.setEnabled(true);
        btnPlay16.setEnabled(true);
        btnPlay17.setEnabled(true);
        btnPlay18.setEnabled(true);
        btnPlay19.setEnabled(true);
        btnPlay20.setEnabled(true);
        btnPlay21.setEnabled(true);
        btnPlay22.setEnabled(true);
        btnPlay23.setEnabled(true);
        btnPlay24.setEnabled(true);
        btnPlay25.setEnabled(true);
        btnPlay26.setEnabled(true);
        btnPlay27.setEnabled(true);
        btnPlay28.setEnabled(true);
        btnPlay29.setEnabled(true);
        btnPlay30.setEnabled(true);
        btnPlay31.setEnabled(true);
        btnPlay32.setEnabled(true);
        btnPlay33.setEnabled(true);
        btnPlay34.setEnabled(true);
        btnPlay35.setEnabled(true);
        btnPlay36.setEnabled(true);
        btnPlay37.setEnabled(true);
        btnPlay38.setEnabled(true);
        btnPlay39.setEnabled(true);
        btnPlay40.setEnabled(true);
        btnPlay41.setEnabled(true);
        btnPlay42.setEnabled(true);
        btnPlay43.setEnabled(true);
        btnPlay44.setEnabled(true);
        btnPlay45.setEnabled(true);
        btnPlay46.setEnabled(true);
        btnPlay47.setEnabled(true);
        btnPlay48.setEnabled(true);
        btnPlay49.setEnabled(true);



    }


    private void play() {

        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mp.start();

        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
}
