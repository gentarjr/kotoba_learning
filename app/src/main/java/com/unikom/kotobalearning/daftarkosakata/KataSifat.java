package com.unikom.kotobalearning.daftarkosakata;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.db.Db;
import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.entity.KataSifatEntity;

import java.io.IOException;

public class KataSifat extends AppCompatActivity implements View.OnClickListener{
    private ImageButton btnPlay, btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17, btnPlay18, btnPlay19, btnPlay20, btnPlay21, btnPlay22, btnPlay23, btnPlay24, btnPlay25, btnPlay26, btnPlay27, btnPlay28, btnPlay29, btnPlay30, btnPlay31, btnPlay32, btnPlay33, btnPlay34, btnPlay35, btnPlay36, btnPlay37, btnPlay38, btnPlay39, btnPlay40, btnPlay41, btnPlay42, btnPlay43, btnPlay44, btnPlay45, btnPlay46, btnPlay47, btnPlay48, btnPlay49;
    private ImageButton btnFav, btnFav1, btnFav2, btnFav3, btnFav4, btnFav5, btnFav6, btnFav7, btnFav8, btnFav9, btnFav10, btnFav11, btnFav12, btnFav13, btnFav14, btnFav15, btnFav16, btnFav17, btnFav18, btnFav19, btnFav20, btnFav21, btnFav22, btnFav23, btnFav24, btnFav25, btnFav26, btnFav27, btnFav28, btnFav29, btnFav30, btnFav31, btnFav32, btnFav33, btnFav34, btnFav35, btnFav36, btnFav37, btnFav38, btnFav39, btnFav40, btnFav41, btnFav42, btnFav43, btnFav44, btnFav45, btnFav46, btnFav47, btnFav48, btnFav49;
    private TextView tvCina1,tvCina2,tvCina3, tvCina4, tvCina5, tvCina6, tvCina7, tvCina8,  tvCina9, tvCina10, tvCina11, tvCina12, tvCina13, tvCina14, tvCina15, tvCina16, tvCina17, tvCina18, tvCina19, tvCina20, tvCina21, tvCina22, tvCina23, tvCina24, tvCina25, tvCina26, tvCina27, tvCina28, tvCina29, tvCina30, tvCina31, tvCina32, tvCina33, tvCina34, tvCina35, tvCina36, tvCina37, tvCina38, tvCina39, tvCina40, tvCina41, tvCina42, tvCina43, tvCina44, tvCina45, tvCina46, tvCina47, tvCina48, tvCina49, tvCina50;
    private TextView tvEja1, tvEja2, tvEja3, tvEja4, tvEja5, tvEja6, tvEja7, tvEja8, tvEja9, tvEja10, tvEja11, tvEja12, tvEja13, tvEja14, tvEja15, tvEja16, tvEja17, tvEja18, tvEja19, tvEja20, tvEja21, tvEja22, tvEja23, tvEja24, tvEja25, tvEja26, tvEja27, tvEja28, tvEja29, tvEja30, tvEja31, tvEja32, tvEja33, tvEja34, tvEja35, tvEja36, tvEja37, tvEja38, tvEja39, tvEja40, tvEja41, tvEja42, tvEja43, tvEja44, tvEja45, tvEja46, tvEja47, tvEja48, tvEja49, tvEja50;
    private TextView tvIndo1, tvIndo2, tvIndo3, tvIndo4, tvIndo5, tvIndo6, tvIndo7, tvIndo8, tvIndo9, tvIndo10, tvIndo11, tvIndo12, tvIndo13, tvIndo14, tvIndo15, tvIndo16, tvIndo17, tvIndo18,tvIndo19, tvIndo20, tvIndo21, tvIndo22, tvIndo23, tvIndo24, tvIndo25, tvIndo26, tvIndo27, tvIndo28, tvIndo29, tvIndo30, tvIndo31,tvIndo32, tvIndo33, tvIndo34, tvIndo35, tvIndo36, tvIndo37, tvIndo38, tvIndo39, tvIndo40, tvIndo41, tvIndo42, tvIndo43, tvIndo44, tvIndo45, tvIndo46, tvIndo47, tvIndo48, tvIndo49, tvIndo50;
    private MediaPlayer mp;
    private Db db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_sifat);

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
        btnFav.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo1.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina1.getText().toString(), tvEja1.getText().toString(), tvIndo1.getText().toString(), "R.raw.biru");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo1.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina2 = findViewById(R.id.tv_cina2);
        tvEja2 = findViewById(R.id.tv_eja2);
        tvIndo2 = findViewById(R.id.tv_indo2);
        btnFav1 = findViewById(R.id.btnFav1);
        btnFav1.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo2.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina2.getText().toString(), tvEja2.getText().toString(), tvIndo2.getText().toString(), "R.raw.bahaya");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo2.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina3 = findViewById(R.id.tv_cina3);
        tvEja3 = findViewById(R.id.tv_eja3);
        tvIndo3 = findViewById(R.id.tv_indo3);
        btnFav2 = findViewById(R.id.btnFav2);
        btnFav2.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo3.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina3.getText().toString(), tvEja3.getText().toString(), tvIndo3.getText().toString(), "R.raw.merah");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo3.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina4 = findViewById(R.id.tv_cina4);
        tvEja4 = findViewById(R.id.tv_eja4);
        tvIndo4 = findViewById(R.id.tv_indo4);
        btnFav3 = findViewById(R.id.btnFav3);
        btnFav3.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo4.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina4.getText().toString(), tvEja4.getText().toString(), tvIndo4.getText().toString(), "R.raw.terang");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo4.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina5 = findViewById(R.id.tv_cina5);
        tvEja5 = findViewById(R.id.tv_eja5);
        tvIndo5 = findViewById(R.id.tv_indo5);
        btnFav4 = findViewById(R.id.btnFav4);
        btnFav4.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo5.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina5.getText().toString(), tvEja5.getText().toString(), tvIndo5.getText().toString(), "R.raw.manis");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo5.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina6 = findViewById(R.id.tv_cina6);
        tvEja6 = findViewById(R.id.tv_eja6);
        tvIndo6 = findViewById(R.id.tv_indo6);
        btnFav5 = findViewById(R.id.btnFav5);
        btnFav5.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo6.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina6.getText().toString(), tvEja6.getText().toString(), tvIndo6.getText().toString(), "R.raw.baru");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo5.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina7 = findViewById(R.id.tv_cina7);
        tvEja7 = findViewById(R.id.tv_eja7);
        tvIndo7 = findViewById(R.id.tv_indo7);
        btnFav6 = findViewById(R.id.btnFav6);
        btnFav6.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo7.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina7.getText().toString(), tvEja7.getText().toString(), tvIndo7.getText().toString(), "R.raw.hangat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo7.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina8 = findViewById(R.id.tv_cina8);
        tvEja8 = findViewById(R.id.tv_eja8);
        tvIndo8 = findViewById(R.id.tv_indo8);
        btnFav7 = findViewById(R.id.btnFav7);
        btnFav7.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo8.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina8.getText().toString(), tvEja8.getText().toString(), tvIndo8.getText().toString(), "R.raw.tebal");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo8.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina9 = findViewById(R.id.tv_cina9);
        tvEja9 = findViewById(R.id.tv_eja9);
        tvIndo9 = findViewById(R.id.tv_indo9);
        btnFav8 = findViewById(R.id.btnFav8);
        btnFav8.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo9.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina9.getText().toString(), tvEja9.getText().toString(), tvIndo9.getText().toString(), "R.raw.kecil");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo9.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina10 = findViewById(R.id.tv_cina10);
        tvEja10 = findViewById(R.id.tv_eja10);
        tvIndo10 = findViewById(R.id.tv_indo10);
        btnFav9 = findViewById(R.id.btnFav9);
        btnFav9.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo10.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina10.getText().toString(), tvEja10.getText().toString(), tvIndo10.getText().toString(), "R.raw.dekat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo10.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina11 = findViewById(R.id.tv_cina11);
        tvEja11 = findViewById(R.id.tv_eja11);
        tvIndo11 = findViewById(R.id.tv_indo11);
        btnFav10 = findViewById(R.id.btnFav10);
        btnFav10.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo11.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina11.getText().toString(), tvEja11.getText().toString(), tvIndo11.getText().toString(), "R.raw.kuno");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo11.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina12 = findViewById(R.id.tv_cina12);
        tvEja12 = findViewById(R.id.tv_eja12);
        tvIndo12 = findViewById(R.id.tv_indo12);
        btnFav11 = findViewById(R.id.btnFav11);
        btnFav11.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo12.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina12.getText().toString(), tvEja12.getText().toString(), tvIndo12.getText().toString(), "R.raw.gemuk");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo12.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina13 = findViewById(R.id.tv_cina13);
        tvEja13 = findViewById(R.id.tv_eja13);
        tvIndo13 = findViewById(R.id.tv_indo13);
        btnFav12 = findViewById(R.id.btnFav12);
        btnFav12.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo13.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina13.getText().toString(), tvEja13.getText().toString(), tvIndo13.getText().toString(), "R.raw.cepat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo13.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina14 = findViewById(R.id.tv_cina14);
        tvEja14 = findViewById(R.id.tv_eja14);
        tvIndo14 = findViewById(R.id.tv_indo14);
        btnFav13 = findViewById(R.id.btnFav13);
        btnFav13.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo14.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina14.getText().toString(), tvEja14.getText().toString(), tvIndo14.getText().toString(), "R.raw.rendah");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo14.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina15 = findViewById(R.id.tv_cina15);
        tvEja15 = findViewById(R.id.tv_eja15);
        tvIndo15 = findViewById(R.id.tv_indo15);
        btnFav14 = findViewById(R.id.btnFav14);
        btnFav14.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo15.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina15.getText().toString(), tvEja15.getText().toString(), tvIndo15.getText().toString(), "R.raw.luas");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo15.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina16 = findViewById(R.id.tv_cina16);
        tvEja16 = findViewById(R.id.tv_eja16);
        tvIndo16 = findViewById(R.id.tv_indo16);
        btnFav15 = findViewById(R.id.btnFav15);
        btnFav15.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo16.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina16.getText().toString(), tvEja16.getText().toString(), tvIndo16.getText().toString(), "R.raw.ingin");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo16.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina17 = findViewById(R.id.tv_cina17);
        tvEja17 = findViewById(R.id.tv_eja17);
        tvIndo17 = findViewById(R.id.tv_indo17);
        btnFav16 = findViewById(R.id.btnFav16);
        btnFav16.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo17.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina17.getText().toString(), tvEja17.getText().toString(), tvIndo17.getText().toString(), "R.raw.kurus");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo17.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina18 = findViewById(R.id.tv_cina18);
        tvEja18 = findViewById(R.id.tv_eja18);
        tvIndo18 = findViewById(R.id.tv_indo18);
        btnFav17 = findViewById(R.id.btnFav17);
        btnFav17.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo18.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina18.getText().toString(), tvEja18.getText().toString(), tvIndo18.getText().toString(), "R.raw.baik");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo18.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina19 = findViewById(R.id.tv_cina19);
        tvEja19 = findViewById(R.id.tv_eja19);
        tvIndo19 = findViewById(R.id.tv_indo19);
        btnFav18 = findViewById(R.id.btnFav18);
        btnFav18.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo19.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina19.getText().toString(), tvEja19.getText().toString(), tvIndo19.getText().toString(), "R.raw.sibuk");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo19.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina20 = findViewById(R.id.tv_cina20);
        tvEja20 = findViewById(R.id.tv_eja20);
        tvIndo20 = findViewById(R.id.tv_indo20);
        btnFav19 = findViewById(R.id.btnFav19);
        btnFav19.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo20.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina20.getText().toString(), tvEja20.getText().toString(), tvIndo20.getText().toString(), "R.raw.sakit");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo20.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina21 = findViewById(R.id.tv_cina21);
        tvEja21 = findViewById(R.id.tv_eja21);
        tvIndo21 = findViewById(R.id.tv_indo21);
        btnFav20 = findViewById(R.id.btnFav20);
        btnFav20.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo21.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina21.getText().toString(), tvEja21.getText().toString(), tvIndo21.getText().toString(), "R.raw.pedas");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo21.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina22 = findViewById(R.id.tv_cina22);
        tvEja22 = findViewById(R.id.tv_eja22);
        tvIndo22 = findViewById(R.id.tv_indo22);
        btnFav21 = findViewById(R.id.btnFav21);
        btnFav21.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo22.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina22.getText().toString(), tvEja22.getText().toString(), tvIndo22.getText().toString(), "R.raw.ringan");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo22.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina23 = findViewById(R.id.tv_cina23);
        tvEja23 = findViewById(R.id.tv_eja23);
        tvIndo23 = findViewById(R.id.tv_indo23);
        btnFav22 = findViewById(R.id.btnFav22);
        btnFav22.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo23.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina23.getText().toString(), tvEja23.getText().toString(), tvIndo23.getText().toString(), "R.raw.mungil");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo23.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina24 = findViewById(R.id.tv_cina24);
        tvEja24 = findViewById(R.id.tv_eja24);
        tvIndo24 = findViewById(R.id.tv_indo24);
        btnFav23 = findViewById(R.id.btnFav23);
        btnFav23.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo24.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina24.getText().toString(), tvEja24.getText().toString(), tvIndo24.getText().toString(), "R.raw.kuning");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo24.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina25 = findViewById(R.id.tv_cina25);
        tvEja25 = findViewById(R.id.tv_eja25);
        tvIndo25 = findViewById(R.id.tv_indo25);
        btnFav24 = findViewById(R.id.btnFav24);
        btnFav24.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo25.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina25.getText().toString(), tvEja25.getText().toString(), tvIndo25.getText().toString(), "R.raw.kotor");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo25.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina26 = findViewById(R.id.tv_cina26);
        tvEja26 = findViewById(R.id.tv_eja26);
        tvIndo26 = findViewById(R.id.tv_indo26);
        btnFav25 = findViewById(R.id.btnFav25);
        btnFav25.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo26.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina26.getText().toString(), tvEja26.getText().toString(), tvIndo26.getText().toString(), "R.raw.gelap");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo26.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina27 = findViewById(R.id.tv_cina27);
        tvEja27 = findViewById(R.id.tv_eja27);
        tvIndo27 = findViewById(R.id.tv_indo27);
        btnFav26 = findViewById(R.id.btnFav26);
        btnFav26.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo27.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina27.getText().toString(), tvEja27.getText().toString(), tvIndo27.getText().toString(), "R.raw.hitam");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo27.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina28 = findViewById(R.id.tv_cina28);
        tvEja28 = findViewById(R.id.tv_eja28);
        tvIndo28 = findViewById(R.id.tv_indo28);
        btnFav27 = findViewById(R.id.btnFav27);
        btnFav27.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo28
                    .getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina28.getText().toString(), tvEja28.getText().toString(), tvIndo28.getText().toString(), "R.raw.bulat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo28.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina29 = findViewById(R.id.tv_cina29);
        tvEja29 = findViewById(R.id.tv_eja29);
        tvIndo29 = findViewById(R.id.tv_indo29);
        btnFav28 = findViewById(R.id.btnFav28);
        btnFav28.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo29.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina29.getText().toString(), tvEja29.getText().toString(), tvIndo29.getText().toString(), "R.raw.tidakenak");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo29.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina30 = findViewById(R.id.tv_cina30);
        tvEja30 = findViewById(R.id.tv_eja30);
        tvIndo30 = findViewById(R.id.tv_indo30);
        btnFav29 = findViewById(R.id.btnFav29);
        btnFav29.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo30.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina30.getText().toString(), tvEja30.getText().toString(), tvIndo30.getText().toString(), "R.raw.pendek");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo30.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina31 = findViewById(R.id.tv_cina31);
        tvEja31 = findViewById(R.id.tv_eja31);
        tvIndo31 = findViewById(R.id.tv_indo31);
        btnFav30 = findViewById(R.id.btnFav30);
        btnFav30.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo31.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina31.getText().toString(), tvEja31.getText().toString(), tvIndo31.getText().toString(), "R.raw.sulit");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo31.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina32 = findViewById(R.id.tv_cina32);
        tvEja32 = findViewById(R.id.tv_eja32);
        tvIndo32 = findViewById(R.id.tv_indo32);
        btnFav31 = findViewById(R.id.btnFav31);
        btnFav31.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo32.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina32.getText().toString(), tvEja32.getText().toString(), tvIndo32.getText().toString(), "R.raw.panjang");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo32.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina33 = findViewById(R.id.tv_cina33);
        tvEja33 = findViewById(R.id.tv_eja33);
        tvIndo33 = findViewById(R.id.tv_indo33);
        btnFav32 = findViewById(R.id.btnFav32);
        btnFav32.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo33.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina33.getText().toString(), tvEja33.getText().toString(), tvIndo33.getText().toString(), "R.raw.tidakcukup");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo33.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina34 = findViewById(R.id.tv_cina34);
        tvEja34 = findViewById(R.id.tv_eja34);
        tvIndo34 = findViewById(R.id.tv_indo34);
        btnFav33 = findViewById(R.id.btnFav33);
        btnFav33.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo34.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina34.getText().toString(), tvEja34.getText().toString(), tvIndo34.getText().toString(), "R.raw.enak");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo34.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina35 = findViewById(R.id.tv_cina35);
        tvEja35 = findViewById(R.id.tv_eja35);
        tvIndo35 = findViewById(R.id.tv_indo35);
        btnFav34 = findViewById(R.id.btnFav34);
        btnFav34.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo35.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina35.getText().toString(), tvEja35.getText().toString(), tvIndo35.getText().toString(), "R.raw.berat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo35.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina36 = findViewById(R.id.tv_cina36);
        tvEja36 = findViewById(R.id.tv_eja36);
        tvIndo36 = findViewById(R.id.tv_indo36);
        btnFav35 = findViewById(R.id.btnFav35);
        btnFav35.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo36.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina36.getText().toString(), tvEja36.getText().toString(), tvIndo36.getText().toString(), "R.raw.menarik");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo1.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina37 = findViewById(R.id.tv_cina37);
        tvEja37 = findViewById(R.id.tv_eja37);
        tvIndo37 = findViewById(R.id.tv_indo37);
        btnFav36 = findViewById(R.id.btnFav36);
        btnFav36.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo37.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina37.getText().toString(), tvEja37.getText().toString(), tvIndo37.getText().toString(), "R.raw.banyak");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo37.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina38 = findViewById(R.id.tv_cina38);
        tvEja38 = findViewById(R.id.tv_eja38);
        tvIndo38 = findViewById(R.id.tv_indo38);
        btnFav37 = findViewById(R.id.btnFav37);
        btnFav37.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo38.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina38.getText().toString(), tvEja38.getText().toString(), tvIndo38.getText().toString(), "R.raw.besar");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo38.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina39 = findViewById(R.id.tv_cina39);
        tvEja39 = findViewById(R.id.tv_eja39);
        tvIndo39 = findViewById(R.id.tv_indo39);
        btnFav38 = findViewById(R.id.btnFav38);
        btnFav38.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo39.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina39.getText().toString(), tvEja39.getText().toString(), tvIndo39.getText().toString(), "R.raw.lambat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo39.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina40 = findViewById(R.id.tv_cina40);
        tvEja40 = findViewById(R.id.tv_eja40);
        tvIndo40 = findViewById(R.id.tv_indo40);
        btnFav39 = findViewById(R.id.btnFav39);
        btnFav39.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo40.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina40.getText().toString(), tvEja40.getText().toString(), tvIndo40.getText().toString(), "R.raw.dingin");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo40.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina41 = findViewById(R.id.tv_cina41);
        tvEja41 = findViewById(R.id.tv_eja41);
        tvIndo41 = findViewById(R.id.tv_indo41);
        btnFav40 = findViewById(R.id.btnFav40);
        btnFav40.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo41.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina41.getText().toString(), tvEja41.getText().toString(), tvIndo41.getText().toString(), "R.raw.sempit");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo41.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina42 = findViewById(R.id.tv_cina42);
        tvEja42 = findViewById(R.id.tv_eja42);
        tvIndo42 = findViewById(R.id.tv_indo42);
        btnFav41 = findViewById(R.id.btnFav41);
        btnFav41.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo42.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina42.getText().toString(), tvEja42.getText().toString(), tvIndo42.getText().toString(), "R.raw.putih");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo42.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina43 = findViewById(R.id.tv_cina43);
        tvEja43 = findViewById(R.id.tv_eja43);
        tvIndo43 = findViewById(R.id.tv_indo43);
        btnFav42 = findViewById(R.id.btnFav42);
        btnFav42.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo43.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina43.getText().toString(), tvEja43.getText().toString(), tvIndo43.getText().toString(), "R.raw.sedikit");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo43.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina44 = findViewById(R.id.tv_cina44);
        tvEja44 = findViewById(R.id.tv_eja44);
        tvIndo44 = findViewById(R.id.tv_indo44);
        btnFav43 = findViewById(R.id.btnFav43);
        btnFav43.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo44.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina44.getText().toString(), tvEja44.getText().toString(), tvIndo44.getText().toString(), "R.raw.sejuk");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo44.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina45 = findViewById(R.id.tv_cina45);
        tvEja45 = findViewById(R.id.tv_eja45);
        tvIndo45 = findViewById(R.id.tv_indo45);
        btnFav44 = findViewById(R.id.btnFav44);
        btnFav44.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo45.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina45.getText().toString(), tvEja45.getText().toString(), tvIndo45.getText().toString(), "R.raw.mahal");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo45.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina46 = findViewById(R.id.tv_cina46);
        tvEja46 = findViewById(R.id.tv_eja46);
        tvIndo46 = findViewById(R.id.tv_indo46);
        btnFav45 = findViewById(R.id.btnFav45);
        btnFav45.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo46.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina46.getText().toString(), tvEja46.getText().toString(), tvIndo46.getText().toString(), "R.raw.menyenangkan");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo46.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina47 = findViewById(R.id.tv_cina47);
        tvEja47 = findViewById(R.id.tv_eja47);
        tvIndo47 = findViewById(R.id.tv_indo47);
        btnFav46 = findViewById(R.id.btnFav46);
        btnFav46.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo47.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina47.getText().toString(), tvEja47.getText().toString(), tvIndo47.getText().toString(), "R.raw.jauh");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo47.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina48 = findViewById(R.id.tv_cina48);
        tvEja48 = findViewById(R.id.tv_eja48);
        tvIndo48 = findViewById(R.id.tv_indo48);
        btnFav47 = findViewById(R.id.btnFav47);
        btnFav47.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo48.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina48.getText().toString(), tvEja48.getText().toString(), tvIndo48.getText().toString(), "R.raw.membosankan");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo48.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina49 = findViewById(R.id.tv_cina49);
        tvEja49 = findViewById(R.id.tv_eja49);
        tvIndo49 = findViewById(R.id.tv_indo49);
        btnFav48 = findViewById(R.id.btnFav48);
        btnFav48.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo49.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina49.getText().toString(), tvEja49.getText().toString(), tvIndo49.getText().toString(), "R.raw.dingin2");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo49.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina50 = findViewById(R.id.tv_cina50);
        tvEja50 = findViewById(R.id.tv_eja50);
        tvIndo50 = findViewById(R.id.tv_indo50);
        btnFav49 = findViewById(R.id.btnFav49);
        btnFav49.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataSifatByNama(tvIndo50.getText().toString().trim());
            if (jumlah == 0) {
                KataSifatEntity katasifat = new KataSifatEntity(0, tvCina50.getText().toString(), tvEja50.getText().toString(), tvIndo50.getText().toString(), "R.raw.kuat");
                db.getDao().insertKataSifat(katasifat);
                Toast.makeText(this, "Kata Sifat berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataSifat(tvIndo50.getText().toString().trim());
                Toast.makeText(this, "Kata Sifat di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                mp = MediaPlayer.create(this, R.raw.biru);
                play();
                btnPlay.setEnabled(false);
                break;
            case R.id.btnPlay1:
                mp = MediaPlayer.create(this, R.raw.bahaya);
                play();
                btnPlay1.setEnabled(false);
                break;
            case R.id.btnPlay2:
                mp = MediaPlayer.create(this, R.raw.merah);
                play();
                btnPlay2.setEnabled(false);
                break;
            case R.id.btnPlay3:
                mp = MediaPlayer.create(this, R.raw.terang);
                play();
                btnPlay3.setEnabled(false);
                break;
            case R.id.btnPlay4:
                mp = MediaPlayer.create(this, R.raw.manis);
                play();
                btnPlay4.setEnabled(false);
                break;
            case R.id.btnPlay5:
                mp = MediaPlayer.create(this, R.raw.baru);
                play();
                btnPlay5.setEnabled(false);
                break;
            case R.id.btnPlay6:
                mp = MediaPlayer.create(this, R.raw.hangat);
                play();
                btnPlay6.setEnabled(false);
                break;
            case R.id.btnPlay7:
                mp = MediaPlayer.create(this, R.raw.tebal);
                play();
                btnPlay7.setEnabled(false);
                break;
            case R.id.btnPlay8:
                mp = MediaPlayer.create(this, R.raw.kecil);
                play();
                btnPlay8.setEnabled(false);
                break;
            case R.id.btnPlay9:
                mp = MediaPlayer.create(this, R.raw.dekat);
                play();
                btnPlay9.setEnabled(false);
                break;
            case R.id.btnPlay10:
                mp = MediaPlayer.create(this, R.raw.kuno);
                play();
                btnPlay10.setEnabled(false);
                break;
            case R.id.btnPlay11:
                mp = MediaPlayer.create(this, R.raw.gemuk);
                play();
                btnPlay11.setEnabled(false);
                break;
            case R.id.btnPlay12:
                mp = MediaPlayer.create(this, R.raw.cepat);
                play();
                btnPlay12.setEnabled(false);
                break;
            case R.id.btnPlay13:
                mp = MediaPlayer.create(this, R.raw.rendah);
                play();
                btnPlay13.setEnabled(false);
                break;
            case R.id.btnPlay14:
                mp = MediaPlayer.create(this, R.raw.luas);
                play();
                btnPlay14.setEnabled(false);
                break;
            case R.id.btnPlay15:
                mp = MediaPlayer.create(this, R.raw.ingin);
                play();
                btnPlay15.setEnabled(false);
                break;
            case R.id.btnPlay16:
                mp = MediaPlayer.create(this, R.raw.kurus);
                play();
                btnPlay16.setEnabled(false);
                break;
            case R.id.btnPlay17:
                mp = MediaPlayer.create(this, R.raw.baik);
                play();
                btnPlay17.setEnabled(false);
                break;
            case R.id.btnPlay18:
                mp = MediaPlayer.create(this, R.raw.sibuk);
                play();
                btnPlay18.setEnabled(false);
                break;
            case R.id.btnPlay19:
                mp = MediaPlayer.create(this, R.raw.sakit);
                play();
                btnPlay19.setEnabled(false);
                break;
            case R.id.btnPlay20:
                mp = MediaPlayer.create(this, R.raw.pedas);
                play();
                btnPlay20.setEnabled(false);
                break;
            case R.id.btnPlay21:
                mp = MediaPlayer.create(this, R.raw.ringan);
                play();
                btnPlay21.setEnabled(false);
                break;
            case R.id.btnPlay22:
                mp = MediaPlayer.create(this, R.raw.mungil);
                play();
                btnPlay22.setEnabled(false);
                break;
            case R.id.btnPlay23:
                mp = MediaPlayer.create(this, R.raw.kuning);
                play();
                btnPlay23.setEnabled(false);
                break;
            case R.id.btnPlay24:
                mp = MediaPlayer.create(this, R.raw.kotor);
                play();
                btnPlay24.setEnabled(false);
                break;
            case R.id.btnPlay25:
                mp = MediaPlayer.create(this, R.raw.gelap);
                play();
                btnPlay25.setEnabled(false);
                break;
            case R.id.btnPlay26:
                mp = MediaPlayer.create(this, R.raw.hitam);
                play();
                btnPlay26.setEnabled(false);
                break;
            case R.id.btnPlay27:
                mp = MediaPlayer.create(this, R.raw.bulat);
                play();
                btnPlay27.setEnabled(false);
                break;
            case R.id.btnPlay28:
                mp = MediaPlayer.create(this, R.raw.tidakenak);
                play();
                btnPlay28.setEnabled(false);
                break;
            case R.id.btnPlay29:
                mp = MediaPlayer.create(this, R.raw.pendek);
                play();
                btnPlay29.setEnabled(false);
                break;
            case R.id.btnPlay30:
                mp = MediaPlayer.create(this, R.raw.sulit);
                play();
                btnPlay30.setEnabled(false);
                break;
            case R.id.btnPlay31:
                mp = MediaPlayer.create(this, R.raw.panjang);
                play();
                btnPlay31.setEnabled(false);
                break;
            case R.id.btnPlay32:
                mp = MediaPlayer.create(this, R.raw.tidakcukup);
                play();
                btnPlay32.setEnabled(false);
                break;
            case R.id.btnPlay33:
                mp = MediaPlayer.create(this, R.raw.enak);
                play();
                btnPlay33.setEnabled(false);
                break;
            case R.id.btnPlay34:
                mp = MediaPlayer.create(this, R.raw.berat);
                play();
                btnPlay34.setEnabled(false);
                break;
            case R.id.btnPlay35:
                mp = MediaPlayer.create(this, R.raw.menarik);
                play();
                btnPlay35.setEnabled(false);
                break;
            case R.id.btnPlay36:
                mp = MediaPlayer.create(this, R.raw.banyak);
                play();
                btnPlay36.setEnabled(false);
                break;
            case R.id.btnPlay37:
                mp = MediaPlayer.create(this, R.raw.besar);
                play();
                btnPlay37.setEnabled(false);
                break;
            case R.id.btnPlay38:
                mp = MediaPlayer.create(this, R.raw.lambat);
                play();
                btnPlay38.setEnabled(false);
                break;
            case R.id.btnPlay39:
                mp = MediaPlayer.create(this, R.raw.dingin);
                play();
                btnPlay39.setEnabled(false);
                break;
            case R.id.btnPlay40:
                mp = MediaPlayer.create(this, R.raw.sempit);
                play();
                btnPlay40.setEnabled(false);
                break;
            case R.id.btnPlay41:
                mp = MediaPlayer.create(this, R.raw.putih);
                play();
                btnPlay41.setEnabled(false);
                break;
            case R.id.btnPlay42:
                mp = MediaPlayer.create(this, R.raw.sedikit);
                play();
                btnPlay42.setEnabled(false);
                break;
            case R.id.btnPlay43:
                mp = MediaPlayer.create(this, R.raw.sejuk);
                play();
                btnPlay43.setEnabled(false);
                break;
            case R.id.btnPlay44:
                mp = MediaPlayer.create(this, R.raw.mahal);
                play();
                btnPlay44.setEnabled(false);
                break;
            case R.id.btnPlay45:
                mp = MediaPlayer.create(this, R.raw.menyenangkan);
                play();
                btnPlay45.setEnabled(false);
                break;
            case R.id.btnPlay46:
                mp = MediaPlayer.create(this, R.raw.jauh);
                play();
                btnPlay46.setEnabled(false);
                break;
            case R.id.btnPlay47:
                mp = MediaPlayer.create(this, R.raw.membosankan);
                play();
                btnPlay47.setEnabled(false);
                break;
            case R.id.btnPlay48:
                mp = MediaPlayer.create(this, R.raw.dingin2);
                play();
                btnPlay48.setEnabled(false);
                break;
            case R.id.btnPlay49:
                mp = MediaPlayer.create(this, R.raw.kuat);
                play();
                btnPlay49.setEnabled(false);
                break;
        }
    }

    public void stateAwal(){
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
