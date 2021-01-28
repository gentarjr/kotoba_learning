package com.unikom.kotobalearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.unikom.adapter.KataSifatAdapter;
import com.unikom.adapter.OnSifatClickListener;
import com.unikom.db.Db;
import com.unikom.kotobalearning.entity.KataSifatEntity;

import java.io.IOException;
import java.util.List;

public class MainFavSifat extends AppCompatActivity implements OnSifatClickListener {

    private Db db;
    private KataSifatAdapter kataSifatAdapter;
    private RecyclerView rvFavorite;
    private List<KataSifatEntity> kataSifatEntityList;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_favorite_kerja);

        db = Db.getInstance(this);
        mediaPlayer = new MediaPlayer();

        rvFavorite = findViewById(R.id.rv_favorite);

        kataSifatEntityList = db.getDao().getAllKataSifat();
        kataSifatAdapter = new KataSifatAdapter(this, kataSifatEntityList);
        rvFavorite.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(kataSifatAdapter);
    }

    @Override
    public void onItemClick(View view, KataSifatEntity kataSifatEntity) {
        cekSuara(kataSifatEntity.getSuara());
    }

    private void cekSuara(String suara) {
        if (suara.equals("R.raw.biru")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.biru);
            play();
        } else {
            if (suara.equals("R.raw.bahaya")) {
                mediaPlayer = MediaPlayer.create(this, R.raw.bahaya);
                play();
            } else {
                if (suara.equals("R.raw.merah")) {
                    mediaPlayer = MediaPlayer.create(this, R.raw.merah);
                    play();
                } else {
                    if (suara.equals("R.raw.terang")) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.terang);
                        play();
                    } else {
                        if (suara.equals("R.raw.manis")) {
                            mediaPlayer = MediaPlayer.create(this, R.raw.manis);
                            play();
                        } else {
                            if (suara.equals("R.raw.baru")) {
                                mediaPlayer = MediaPlayer.create(this, R.raw.baru);
                                play();
                            } else {
                                if (suara.equals("R.raw.hangat")) {
                                    mediaPlayer = MediaPlayer.create(this, R.raw.hangat);
                                    play();
                                } else {
                                    if (suara.equals("R.raw.tebal")) {
                                        mediaPlayer = MediaPlayer.create(this, R.raw.tebal);
                                        play();
                                    } else {
                                        if (suara.equals("R.raw.kecil")) {
                                            mediaPlayer = MediaPlayer.create(this, R.raw.kecil);
                                            play();
                                        } else {
                                            if (suara.equals("R.raw.dekat")) {
                                                mediaPlayer = MediaPlayer.create(this, R.raw.dekat);
                                                play();
                                            } else {
                                                if (suara.equals("R.raw.kuno")) {
                                                    mediaPlayer = MediaPlayer.create(this, R.raw.kuno);
                                                    play();
                                                } else {
                                                    if (suara.equals("R.raw.gemuk")) {
                                                        mediaPlayer = MediaPlayer.create(this, R.raw.gemuk);
                                                        play();
                                                    } else {
                                                        if (suara.equals("R.raw.cepat")) {
                                                            mediaPlayer = MediaPlayer.create(this, R.raw.cepat);
                                                            play();
                                                        } else {
                                                            if (suara.equals("R.raw.rendah")) {
                                                                mediaPlayer = MediaPlayer.create(this, R.raw.rendah);
                                                                play();
                                                            } else {
                                                                if (suara.equals("R.raw.luas")) {
                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.luas);
                                                                    play();
                                                                } else {
                                                                    if (suara.equals("R.raw.kurus")) {
                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.kurus);
                                                                        play();
                                                                    } else {
                                                                        if (suara.equals("R.raw.ingin")) {
                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.ingin);
                                                                            play();
                                                                        } else {
                                                                            if (suara.equals("R.raw.baik")) {
                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.baik);
                                                                                play();
                                                                            } else {
                                                                                if (suara.equals("R.raw.sibuk")) {
                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.sibuk);
                                                                                    play();
                                                                                } else {
                                                                                    if (suara.equals("R.raw.sakit")) {
                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.sakit);
                                                                                        play();
                                                                                    } else {
                                                                                        if (suara.equals("R.raw.pedas")) {
                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.pedas);
                                                                                            play();
                                                                                        } else {
                                                                                            if (suara.equals("R.raw.ringan")) {
                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.ringan);
                                                                                                play();
                                                                                            } else {
                                                                                                if (suara.equals("R.raw.mungil")) {
                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.mungil);
                                                                                                    play();
                                                                                                } else {
                                                                                                    if (suara.equals("R.raw.kuning")) {
                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.kuning);
                                                                                                        play();
                                                                                                    } else {
                                                                                                        if (suara.equals("R.raw.kotor")) {
                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.kotor);
                                                                                                            play();
                                                                                                        } else {
                                                                                                            if (suara.equals("R.raw.gelap")) {
                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.gelap);
                                                                                                                play();
                                                                                                            } else {
                                                                                                                if (suara.equals("R.raw.hitam")) {
                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.hitam);
                                                                                                                    play();
                                                                                                                } else {
                                                                                                                    if (suara.equals("R.raw.bulat")) {
                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.bulat);
                                                                                                                        play();
                                                                                                                    } else {
                                                                                                                        if (suara.equals("R.raw.tidakenak")) {
                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.tidakenak);
                                                                                                                            play();
                                                                                                                        } else {
                                                                                                                            if (suara.equals("R.raw.pendek")) {
                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.pendek);
                                                                                                                                play();
                                                                                                                            } else {
                                                                                                                                if (suara.equals("R.raw.sulit")) {
                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.sulit);
                                                                                                                                    play();
                                                                                                                                } else {
                                                                                                                                    if (suara.equals("R.raw.panjang")) {
                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.panjang);
                                                                                                                                        play();
                                                                                                                                    } else {
                                                                                                                                        if (suara.equals("R.raw.tidakcukup")) {
                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.tidakcukup);
                                                                                                                                            play();
                                                                                                                                        } else {
                                                                                                                                            if (suara.equals("R.raw.enak")) {
                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.enak);
                                                                                                                                                play();
                                                                                                                                            } else {
                                                                                                                                                if (suara.equals("R.raw.berat")){
                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.berat);
                                                                                                                                                    play();
                                                                                                                                                } else{
                                                                                                                                                    if (suara.equals("R.raw.menarik")){
                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.menarik);
                                                                                                                                                        play();
                                                                                                                                                    } else{
                                                                                                                                                        if (suara.equals("R.raw.banyak")){
                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.banyak);
                                                                                                                                                            play();
                                                                                                                                                        } else{
                                                                                                                                                            if (suara.equals("R.raw.besar")){
                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.besar);
                                                                                                                                                                play();
                                                                                                                                                            } else{
                                                                                                                                                                if (suara.equals("R.raw.lambat")){
                                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.lambat);
                                                                                                                                                                    play();
                                                                                                                                                                } else{
                                                                                                                                                                    if (suara.equals("R.raw.dingin")){
                                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.dingin);
                                                                                                                                                                        play();
                                                                                                                                                                    } else{
                                                                                                                                                                        if (suara.equals("R.raw.sempit")){
                                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.sempit);
                                                                                                                                                                            play();
                                                                                                                                                                        } else{
                                                                                                                                                                            if (suara.equals("R.raw.putih")){
                                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.putih);
                                                                                                                                                                                play();
                                                                                                                                                                            } else{
                                                                                                                                                                                if (suara.equals("R.raw.sedikit")){
                                                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.sedikit);
                                                                                                                                                                                    play();
                                                                                                                                                                                } else{
                                                                                                                                                                                    if (suara.equals("R.raw.sejuk")){
                                                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.sejuk);
                                                                                                                                                                                        play();
                                                                                                                                                                                    } else{
                                                                                                                                                                                        if (suara.equals("R.raw.mahal")){
                                                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.mahal);
                                                                                                                                                                                            play();
                                                                                                                                                                                        } else{
                                                                                                                                                                                            if (suara.equals("R.raw.menyenangkan")){
                                                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.menyenangkan);
                                                                                                                                                                                                play();
                                                                                                                                                                                            }else{
                                                                                                                                                                                                if (suara.equals("R.raw.jauh")){
                                                                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.jauh);
                                                                                                                                                                                                    play();
                                                                                                                                                                                                } else{
                                                                                                                                                                                                    if (suara.equals("R.raw.membosankan")){
                                                                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.membosankan);
                                                                                                                                                                                                        play();
                                                                                                                                                                                                    }else{
                                                                                                                                                                                                        if (suara.equals("R.raw.dingin2")){
                                                                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.dingin2);
                                                                                                                                                                                                            play();
                                                                                                                                                                                                        }else{
                                                                                                                                                                                                            if (suara.equals("R.raw.kuat")){
                                                                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.kuat);
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
