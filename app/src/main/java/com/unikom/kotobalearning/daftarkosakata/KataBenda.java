package com.unikom.kotobalearning.daftarkosakata;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer.OnCompletionListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.db.Db;
import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.entity.KataBendaEntity;

import java.io.IOException;

/*Cara Menambah Suara
 * 1A. copy paste kan lagu ke file res -> raw
 * 1B. Tambahkan dulu source code di file XML nya, nama file XML tertera pada line 26 atau ada di res->layout
 * 2. Kemudian Tambahkan btnPlay pada line 21
 * 3. setelah itu add id Button seperti pada line 32 dan 33
 * 4. kemudian add onClick button seperti pada line 36 dan 37
 * 5. kemudian add case - break, coppy kan saja dibawahnya dari line 49 - 53 (case -> break) paste di line bawahnya
 * 6. untuk mengarahkan ke file lagu silahkan masukkan file nama lagu seperti pada line 51 cth : R.raw.nama_lagu
 * 7. tambahkan disable button seperti pada line 60 & 61*/

public class KataBenda extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnPlay, btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10,
            btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17, btnPlay18, btnPlay19, btnPlay20;
    private ImageButton btnFav, btnFav1, btnFav2, btnFav3, btnFav4, btnFav5, btnFav6, btnFav7, btnFav8, btnFav9, btnFav10, btnFav11, btnFav12, btnFav13, btnFav14, btnFav15, btnFav16, btnFav17, btnFav18, btnFav19, btnFav20;
    private TextView tvCina1,tvCina2,tvCina3, tvCina4, tvCina5, tvCina6, tvCina7, tvCina8,  tvCina9, tvCina10, tvCina11, tvCina12, tvCina13, tvCina14, tvCina15, tvCina16, tvCina17, tvCina18, tvCina19, tvCina20, tvCina21;
    private TextView tvEja1, tvEja2, tvEja3, tvEja4, tvEja5, tvEja6, tvEja7, tvEja8, tvEja9, tvEja10, tvEja11, tvEja12, tvEja13, tvEja14, tvEja15, tvEja16, tvEja17, tvEja18, tvEja19, tvEja20, tvEja21;
    private TextView tvIndo1, tvIndo2, tvIndo3, tvIndo4, tvIndo5, tvIndo6, tvIndo7, tvIndo8, tvIndo9, tvIndo10, tvIndo11, tvIndo12, tvIndo13, tvIndo14, tvIndo15, tvIndo16, tvIndo17, tvIndo18,tvIndo19, tvIndo20, tvIndo21;
    private MediaPlayer mp;
    private Db db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_benda);

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


        tvCina1 = findViewById(R.id.tv_cina1);
        tvEja1 = findViewById(R.id.tv_eja1);
        tvIndo1 = findViewById(R.id.tv_indo1);
        btnFav = findViewById(R.id.btnFav);
        btnFav.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo1.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina1.getText().toString(), tvEja1.getText().toString(), tvIndo1.getText().toString(), "R.raw.barang");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo1.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina2 = findViewById(R.id.tv_cina2);
        tvEja2 = findViewById(R.id.tv_eja2);
        tvIndo2 = findViewById(R.id.tv_indo2);
        btnFav1 = findViewById(R.id.btnFav1);
        btnFav1.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo2.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina2.getText().toString(), tvEja2.getText().toString(), tvIndo2.getText().toString(), "R.raw.topi");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo2.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina3 = findViewById(R.id.tv_cina3);
        tvEja3 = findViewById(R.id.tv_eja3);
        tvIndo3 = findViewById(R.id.tv_indo3);
        btnFav2 = findViewById(R.id.btnFav2);
        btnFav2.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo3.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina3.getText().toString(), tvEja3.getText().toString(), tvIndo3.getText().toString(), "R.raw.payung");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo3.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina4 = findViewById(R.id.tv_cina4);
        tvEja4 = findViewById(R.id.tv_eja4);
        tvIndo4 = findViewById(R.id.tv_indo4);
        btnFav3 = findViewById(R.id.btnFav3);
        btnFav3.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo4.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina4.getText().toString(), tvEja4.getText().toString(), tvIndo4.getText().toString(), "R.raw.kacamata");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo4.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina5 = findViewById(R.id.tv_cina5);
        tvEja5 = findViewById(R.id.tv_eja5);
        tvIndo5 = findViewById(R.id.tv_indo5);
        btnFav4 = findViewById(R.id.btnFav4);
        btnFav4.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo5.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina5.getText().toString(), tvEja5.getText().toString(), tvIndo5.getText().toString(), "R.raw.saputangan");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo5.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina6 = findViewById(R.id.tv_cina6);
        tvEja6 = findViewById(R.id.tv_eja6);
        tvIndo6 = findViewById(R.id.tv_indo6);
        btnFav5 = findViewById(R.id.btnFav5);
        btnFav5.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo6.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina6.getText().toString(), tvEja6.getText().toString(), tvIndo6.getText().toString(), "R.raw.handuk");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo6.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina7 = findViewById(R.id.tv_cina7);
        tvEja7 = findViewById(R.id.tv_eja7);
        tvIndo7 = findViewById(R.id.tv_indo7);
        btnFav6 = findViewById(R.id.btnFav6);
        btnFav6.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo7.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina7.getText().toString(), tvEja7.getText().toString(), tvIndo7.getText().toString(), "R.raw.sabun");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo7.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
        tvCina8 = findViewById(R.id.tv_cina8);
        tvEja8 = findViewById(R.id.tv_eja8);
        tvIndo8 = findViewById(R.id.tv_indo8);
        btnFav7 = findViewById(R.id.btnFav7);
        btnFav7.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo8.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina8.getText().toString(), tvEja8.getText().toString(), tvIndo8.getText().toString(), "R.raw.shampo");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo8.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina9 = findViewById(R.id.tv_cina9);
        tvEja9 = findViewById(R.id.tv_eja9);
        tvIndo9 = findViewById(R.id.tv_indo9);
        btnFav8 = findViewById(R.id.btnFav8);
        btnFav8.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo9.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina9.getText().toString(), tvEja9.getText().toString(), tvIndo9.getText().toString(), "R.raw.dompet");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo9.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina10 = findViewById(R.id.tv_cina10);
        tvEja10 = findViewById(R.id.tv_eja10);
        tvIndo10 = findViewById(R.id.tv_indo10);
        btnFav9 = findViewById(R.id.btnFav9);
        btnFav9.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo10.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina10.getText().toString(), tvEja10.getText().toString(), tvIndo10.getText().toString(), "R.raw.uang");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo10.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina11 = findViewById(R.id.tv_cina11);
        tvEja11 = findViewById(R.id.tv_eja11);
        tvIndo11 = findViewById(R.id.tv_indo11);
        btnFav10 = findViewById(R.id.btnFav10);
        btnFav10.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo11.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina11.getText().toString(), tvEja11.getText().toString(), tvIndo11.getText().toString(), "R.raw.sandal");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo11.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina12 = findViewById(R.id.tv_cina12);
        tvEja12 = findViewById(R.id.tv_eja12);
        tvIndo12 = findViewById(R.id.tv_indo12);
        btnFav11 = findViewById(R.id.btnFav11);
        btnFav11.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo12.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina12.getText().toString(), tvEja12.getText().toString(), tvIndo12.getText().toString(), "R.raw.kaoskaki");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo12.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina13 = findViewById(R.id.tv_cina13);
        tvEja13 = findViewById(R.id.tv_eja13);
        tvIndo13 = findViewById(R.id.tv_indo13);
        btnFav12 = findViewById(R.id.btnFav12);
        btnFav12.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo13.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina13.getText().toString(), tvEja13.getText().toString(), tvIndo13.getText().toString(), "R.raw.sepatu");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo13.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina14 = findViewById(R.id.tv_cina14);
        tvEja14 = findViewById(R.id.tv_eja14);
        tvIndo14 = findViewById(R.id.tv_indo14);
        btnFav13 = findViewById(R.id.btnFav13);
        btnFav13.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo14.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina14.getText().toString(), tvEja14.getText().toString(), tvIndo14.getText().toString(), "R.raw.barangbawaan");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo14.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina15 = findViewById(R.id.tv_cina15);
        tvEja15 = findViewById(R.id.tv_eja15);
        tvIndo15 = findViewById(R.id.tv_indo15);
        btnFav14 = findViewById(R.id.btnFav14);
        btnFav14.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo15.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina15.getText().toString(), tvEja15.getText().toString(), tvIndo15.getText().toString(), "R.raw.tas");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo15.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina16 = findViewById(R.id.tv_cina16);
        tvEja16 = findViewById(R.id.tv_eja16);
        tvIndo16 = findViewById(R.id.tv_indo16);
        btnFav15 = findViewById(R.id.btnFav15);
        btnFav15.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo16.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina16.getText().toString(), tvEja16.getText().toString(), tvIndo16.getText().toString(), "R.raw.rokok");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo16.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina17 = findViewById(R.id.tv_cina17);
        tvEja17 = findViewById(R.id.tv_eja17);
        tvIndo17 = findViewById(R.id.tv_indo17);
        btnFav16 = findViewById(R.id.btnFav16);
        btnFav16.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo17.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina17.getText().toString(), tvEja17.getText().toString(), tvIndo17.getText().toString(), "R.raw.korekapi");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo17.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina18 = findViewById(R.id.tv_cina18);
        tvEja18 = findViewById(R.id.tv_eja18);
        tvIndo18 = findViewById(R.id.tv_indo18);
        btnFav17 = findViewById(R.id.btnFav17);
        btnFav17.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo18.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina18.getText().toString(), tvEja18.getText().toString(), tvIndo18.getText().toString(), "R.raw.obat");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo18.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina19 = findViewById(R.id.tv_cina19);
        tvEja19 = findViewById(R.id.tv_eja19);
        tvIndo19 = findViewById(R.id.tv_indo19);
        btnFav18 = findViewById(R.id.btnFav18);
        btnFav18.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo19.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina19.getText().toString(), tvEja19.getText().toString(), tvIndo19.getText().toString(), "R.raw.kunci");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo19.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina20 = findViewById(R.id.tv_cina20);
        tvEja20 = findViewById(R.id.tv_eja20);
        tvIndo20 = findViewById(R.id.tv_indo20);
        btnFav19 = findViewById(R.id.btnFav19);
        btnFav19.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo20.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina20.getText().toString(), tvEja20.getText().toString(), tvIndo20.getText().toString(), "R.raw.koran");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo20.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });

        tvCina21 = findViewById(R.id.tv_cina21);
        tvEja21 = findViewById(R.id.tv_eja21);
        tvIndo21 = findViewById(R.id.tv_indo21);
        btnFav20 = findViewById(R.id.btnFav20);
        btnFav20.setOnClickListener(view -> {
            Integer jumlah = db.getDao().getKataBendaByNama(tvIndo21.getText().toString().trim());
            if (jumlah == 0) {
                KataBendaEntity kataBenda = new KataBendaEntity(0, tvCina21.getText().toString(), tvEja21.getText().toString(), tvIndo21.getText().toString(), "R.raw.majalah");
                db.getDao().insertKataBenda(kataBenda);
                Toast.makeText(this, "Kata benda berhasil di simpan ke favorite", Toast.LENGTH_SHORT).show();
            }else{
                db.getDao().deleteKataBenda(tvIndo21.getText().toString().trim());
                Toast.makeText(this, "Kata benda di hapus pada favorite", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                mp = MediaPlayer.create(this, R.raw.barang);
                play();
                btnPlay.setEnabled(false);
                break;
            case R.id.btnPlay1:
                mp = MediaPlayer.create(this, R.raw.topi);
                play();
                btnPlay1.setEnabled(false);
                break;
            case R.id.btnPlay2:
                mp = MediaPlayer.create(this, R.raw.payung);
                play();
                btnPlay2.setEnabled(false);
                break;
            case R.id.btnPlay3:
                mp = MediaPlayer.create(this, R.raw.kacamata);
                play();
                btnPlay3.setEnabled(false);
                break;
            case R.id.btnPlay4:
                mp = MediaPlayer.create(this, R.raw.saputangan);
                play();
                btnPlay4.setEnabled(false);
                break;
            case R.id.btnPlay5:
                mp = MediaPlayer.create(this, R.raw.handuk);
                play();
                btnPlay5.setEnabled(false);
                break;
            case R.id.btnPlay6:
                mp = MediaPlayer.create(this, R.raw.sabun);
                play();
                btnPlay6.setEnabled(false);
                break;
            case R.id.btnPlay7:
                mp = MediaPlayer.create(this, R.raw.shampo);
                play();
                btnPlay7.setEnabled(false);
                break;
            case R.id.btnPlay8:
                mp = MediaPlayer.create(this, R.raw.dompet);
                play();
                btnPlay8.setEnabled(false);
                break;
            case R.id.btnPlay9:
                mp = MediaPlayer.create(this, R.raw.uang);
                play();
                btnPlay9.setEnabled(false);
                break;
            case R.id.btnPlay10:
                mp = MediaPlayer.create(this, R.raw.sandal);
                play();
                btnPlay10.setEnabled(false);
                break;
            case R.id.btnPlay11:
                mp = MediaPlayer.create(this, R.raw.kaoskaki);
                play();
                btnPlay11.setEnabled(false);
                break;
            case R.id.btnPlay12:
                mp = MediaPlayer.create(this, R.raw.sepatu);
                play();
                btnPlay12.setEnabled(false);
                break;
            case R.id.btnPlay13:
                mp = MediaPlayer.create(this, R.raw.barangbawaan);
                play();
                btnPlay13.setEnabled(false);
                break;
            case R.id.btnPlay14:
                mp = MediaPlayer.create(this, R.raw.tas);
                play();
                btnPlay14.setEnabled(false);
                break;
            case R.id.btnPlay15:
                mp = MediaPlayer.create(this, R.raw.rokok);
                play();
                btnPlay15.setEnabled(false);
                break;
            case R.id.btnPlay16:
                mp = MediaPlayer.create(this, R.raw.korekapi);
                play();
                btnPlay16.setEnabled(false);
                break;
            case R.id.btnPlay17:
                mp = MediaPlayer.create(this, R.raw.obat);
                play();
                btnPlay17.setEnabled(false);
                break;
            case R.id.btnPlay18:
                mp = MediaPlayer.create(this, R.raw.kunci);
                play();
                btnPlay18.setEnabled(false);
                break;
            case R.id.btnPlay19:
                mp = MediaPlayer.create(this, R.raw.koran);
                play();
                btnPlay19.setEnabled(false);
                break;
            case R.id.btnPlay20:
                mp = MediaPlayer.create(this, R.raw.majalah);
                play();
                btnPlay20.setEnabled(false);
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

    }

    /** Dijalankan Oleh Tombol Play */
    private void play() {
        /** Memanggil File MP3 ".mp3" */
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** Menjalankan Audio */
        mp.start();

        /** Penanganan Ketika Suara Berakhir */
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
}

