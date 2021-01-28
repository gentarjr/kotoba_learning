package com.unikom.kotobalearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.unikom.adapter.KataBendaAdapter;
import com.unikom.adapter.OnBendaClickListener;
import com.unikom.db.Db;
import com.unikom.kotobalearning.entity.KataBendaEntity;

import java.io.IOException;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainFavorit extends AppCompatActivity implements OnBendaClickListener {

    private Db db;
    private KataBendaAdapter kataBendaAdapter;
    private RecyclerView rvFavorite;
    private List<KataBendaEntity> kataBendaEntityList;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_favorite_baru);

        db = Db.getInstance(this);
        mediaPlayer = new MediaPlayer();

        rvFavorite = findViewById(R.id.rv_favorite);

        kataBendaEntityList = db.getDao().getAllKataBenda();
        kataBendaAdapter = new KataBendaAdapter(this, kataBendaEntityList);
        rvFavorite.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(kataBendaAdapter);


    }

    @Override
    public void onItemClick(View view, KataBendaEntity kataBendaEntity) {
        cekSuara(kataBendaEntity.getSuara());
    }

    private void cekSuara(String suara){
        if (suara.equals("R.raw.barang")){
            mediaPlayer = MediaPlayer.create(this, R.raw.barang);
            play();
        }
        else{
            if (suara.equals("R.raw.topi")){
                mediaPlayer = MediaPlayer.create(this, R.raw.topi);
                play();
            }
            else{
                if (suara.equals("R.raw.payung")){
                    mediaPlayer = MediaPlayer.create(this, R.raw.payung);
                    play();
                }
                else {
                    if (suara.equals("R.raw.kacamata")){
                        mediaPlayer = MediaPlayer.create(this, R.raw.kacamata);
                        play();
                    }
                    else {
                        if (suara.equals("R.raw.saputangan")){
                            mediaPlayer = MediaPlayer.create(this, R.raw.saputangan);
                            play();
                        }
                        else {
                            if (suara.equals("R.raw.handuk")){
                                mediaPlayer = MediaPlayer.create(this, R.raw.handuk);
                                play();
                            }
                            else {
                                if (suara.equals("R.raw.sabun")){
                                    mediaPlayer = MediaPlayer.create(this, R.raw.sabun);
                                    play();
                                }
                                else {
                                    if (suara.equals("R.raw.shampo")){
                                        mediaPlayer = MediaPlayer.create(this, R.raw.shampo);
                                        play();
                                    }
                                    else {
                                        if (suara.equals("R.raw.dompet")){
                                            mediaPlayer = MediaPlayer.create(this, R.raw.dompet);
                                            play();
                                        }
                                        else {
                                            if (suara.equals("R.raw.uang")) {
                                                mediaPlayer = MediaPlayer.create(this, R.raw.uang);
                                                play();
                                            }
                                            else {
                                                if (suara.equals("R.raw.sandal")) {
                                                    mediaPlayer = MediaPlayer.create(this, R.raw.sandal);
                                                    play();
                                                }
                                                else {
                                                    if (suara.equals("R.raw.kaoskaki")) {
                                                        mediaPlayer = MediaPlayer.create(this, R.raw.kaoskaki);
                                                        play();
                                                    }
                                                    else {
                                                        if (suara.equals("R.raw.sepatu")) {
                                                            mediaPlayer = MediaPlayer.create(this, R.raw.sepatu);
                                                            play();
                                                        }
                                                        else {
                                                            if (suara.equals("R.raw.barangbawaan")) {
                                                                mediaPlayer = MediaPlayer.create(this, R.raw.barangbawaan);
                                                                play();
                                                            }
                                                            else {
                                                                if (suara.equals("R.raw.tas")) {
                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.tas);
                                                                    play();
                                                                }
                                                                else {
                                                                    if (suara.equals("R.raw.rokok")) {
                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.rokok);
                                                                        play();
                                                                    }
                                                                    else {
                                                                        if (suara.equals("R.raw.korekapi")) {
                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.korekapi);
                                                                            play();
                                                                        }
                                                                        else {
                                                                            if (suara.equals("R.raw.obat")) {
                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.obat);
                                                                                play();
                                                                            }
                                                                            else {
                                                                                if (suara.equals("R.raw.kunci")) {
                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.kunci);
                                                                                    play();
                                                                                }
                                                                                else {
                                                                                    if (suara.equals("R.raw.koran")) {
                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.koran);
                                                                                        play();
                                                                                    }
                                                                                    else {
                                                                                        if (suara.equals("R.raw.majalah")) {
                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.majalah);
                                                                                            play();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void play() {
        try {
            mediaPlayer.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mediaPlayer.start();
    }
}