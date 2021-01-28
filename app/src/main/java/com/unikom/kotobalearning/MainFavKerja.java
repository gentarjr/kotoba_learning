package com.unikom.kotobalearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.unikom.adapter.KataKerjaAdapter;
import com.unikom.adapter.OnKerjaClickListener;
import com.unikom.db.Db;
import com.unikom.kotobalearning.entity.KataKerjaEntity;

import java.io.IOException;
import java.util.List;

public class MainFavKerja extends AppCompatActivity implements OnKerjaClickListener {

    private Db db;
    private KataKerjaAdapter kataKerjaAdapter;
    private RecyclerView rvFavorite;
    private List<KataKerjaEntity> kataKerjaEntityList;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_favorite_kerja);

        db = Db.getInstance(this);
        mediaPlayer = new MediaPlayer();

        rvFavorite = findViewById(R.id.rv_favorite);

        kataKerjaEntityList = db.getDao().getAllKataKerja();
        kataKerjaAdapter = new KataKerjaAdapter(this, kataKerjaEntityList);
        rvFavorite.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(kataKerjaAdapter);
    }

    @Override
    public void onItemClick(View view, KataKerjaEntity kataKerjaEntity) {
        cekSuara(kataKerjaEntity.getSuara());
    }

    private void cekSuara(String suara){
        if (suara.equals("R.raw.buka")){
            mediaPlayer = MediaPlayer.create(this, R.raw.buka);
            play();
        }else {
            if (suara.equals("R.raw.berjalankaki")){
                mediaPlayer = MediaPlayer.create(this, R.raw.berjalankaki);
                play();
            }else {
                if (suara.equals("R.raw.bertiup")){
                    mediaPlayer = MediaPlayer.create(this, R.raw.bertiup);
                    play();
                }else {
                    if (suara.equals("R.raw.mnegenakancelana")){
                        mediaPlayer = MediaPlayer.create(this, R.raw.mnegenakancelana);
                        play();
                    }else {
                        if (suara.equals("R.raw.bekerja")){
                            mediaPlayer = MediaPlayer.create(this, R.raw.berkerja);
                            play();
                        }else {
                            if (suara.equals("R.raw.menarik1")){
                                mediaPlayer = MediaPlayer.create(this, R.raw.menarik1);
                                play();
                            }else {
                                if (suara.equals("R.raw.pergi")){
                                    mediaPlayer = MediaPlayer.create(this, R.raw.pergi);
                                    play();
                                }else {
                                    if (suara.equals("R.raw.menulis")){
                                        mediaPlayer = MediaPlayer.create(this, R.raw.menulis);
                                        play();
                                    }else{
                                        if (suara.equals("R.raw.mendengar")){
                                            mediaPlayer = MediaPlayer.create(this, R.raw.mendengar);
                                            play();
                                        }else {
                                            if (suara.equals("R.raw.menggosok")){
                                                mediaPlayer = MediaPlayer.create(this, R.raw.menggosok);
                                                play();
                                            }else {
                                                if (suara.equals("R.raw.bersuara")){
                                                    mediaPlayer = MediaPlayer.create(this, R.raw.bersuara);
                                                    play();
                                                }else {
                                                    if (suara.equals("R.raw.meletakan")){
                                                        mediaPlayer = MediaPlayer.create(this, R.raw.meletakan);
                                                        play();
                                                    }else {
                                                        if (suara.equals("R.raw.berkembang")){
                                                            mediaPlayer = MediaPlayer.create(this, R.raw.berkembang);
                                                            play();
                                                        }else {
                                                            if (suara.equals("R.raw.tiba")){
                                                                mediaPlayer = MediaPlayer.create(this, R.raw.tiba);
                                                                play();
                                                            } else {
                                                                if (suara.equals("R.raw.meninggalkan")){
                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.meninggalkan);
                                                                    play();
                                                                }else {
                                                                    if (suara.equals("R.raw.berenang")){
                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.berenang);
                                                                        play();
                                                                    }else {
                                                                        if (suara.equals("R.raw.bermain")){
                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.bermain);
                                                                            play();
                                                                        }else {
                                                                            if (suara.equals("R.raw.berbaris")){
                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.berbaris);
                                                                                play();
                                                                            }else {
                                                                                if (suara.equals("R.raw.terbang")){
                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.terbang);
                                                                                    play();
                                                                                }else {
                                                                                    if (suara.equals("R.raw.memanggil")){
                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.memanggil);
                                                                                        play();
                                                                                    }else {
                                                                                        if (suara.equals("R.raw.minum")){
                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.minum);
                                                                                            play();
                                                                                        }else {
                                                                                            if (suara.equals("R.raw.tinggal")){
                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.tinggal);
                                                                                                play();
                                                                                            }else {
                                                                                                if (suara.equals("R.raw.meminta")){
                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.meminta);
                                                                                                    play();
                                                                                                }else {
                                                                                                    if (suara.equals("R.raw.beristirahat")){
                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.beristirahat);
                                                                                                        play();
                                                                                                    }else {
                                                                                                        if (suara.equals("R.raw.membaca")){
                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.membaca);
                                                                                                            play();
                                                                                                        }else {
                                                                                                            if (suara.equals("R.raw.mati")){
                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.mati);
                                                                                                                play();
                                                                                                            }else {
                                                                                                                if (suara.equals("R.raw.bertemu")){
                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.bertemu);
                                                                                                                    play();
                                                                                                                }else {
                                                                                                                    if (suara.equals("R.raw.mencuci")){
                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.mencuci);
                                                                                                                        play();
                                                                                                                    }else {
                                                                                                                        if (suara.equals("R.raw.berbeda")){
                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.berbeda);
                                                                                                                            play();
                                                                                                                        }else {
                                                                                                                            if (suara.equals("R.raw.berkata")){
                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.berkata);
                                                                                                                                play();
                                                                                                                            }else {
                                                                                                                                if (suara.equals("R.raw.membeli")){
                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.membeli);
                                                                                                                                    play();
                                                                                                                                }else {
                                                                                                                                    if (suara.equals("R.raw.belajar")){
                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.belajar);
                                                                                                                                        play();
                                                                                                                                    }else {
                                                                                                                                        if (suara.equals("R.raw.menghisap")){
                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.menghisap);
                                                                                                                                            play();
                                                                                                                                        }else {
                                                                                                                                            if (suara.equals("R.raw.memakai")){
                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.memakai);
                                                                                                                                                play();
                                                                                                                                            }else {
                                                                                                                                                if (suara.equals("R.raw.bernyanyi")){
                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.bernyanyi);
                                                                                                                                                    play();
                                                                                                                                                }else {
                                                                                                                                                    if (suara.equals("R.raw.menunggu")){
                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.menunggu);
                                                                                                                                                        play();
                                                                                                                                                    }else {
                                                                                                                                                        if (suara.equals("R.raw.membawa")){
                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.membawa);
                                                                                                                                                            play();
                                                                                                                                                        }else {
                                                                                                                                                            if (suara.equals("R.raw.berdiri")){
                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.berdiri);
                                                                                                                                                                play();
                                                                                                                                                            }else {
                                                                                                                                                                if (suara.equals("R.raw.ada")){
                                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.ada);
                                                                                                                                                                    play();
                                                                                                                                                                }else {
                                                                                                                                                                    if (suara.equals("R.raw.turun")){
                                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.turun);
                                                                                                                                                                        play();
                                                                                                                                                                    }else {
                                                                                                                                                                        if (suara.equals("R.raw.masuk")){
                                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.masuk);
                                                                                                                                                                            play();
                                                                                                                                                                        }else {
                                                                                                                                                                            if (suara.equals("R.raw.mulai")){
                                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.mulai);
                                                                                                                                                                                play();
                                                                                                                                                                            }else {
                                                                                                                                                                                if (suara.equals("R.raw.menempelkan")){
                                                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.menempelkan);
                                                                                                                                                                                    play();
                                                                                                                                                                                }else {
                                                                                                                                                                                    if (suara.equals("R.raw.berlari")){
                                                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.berlari);
                                                                                                                                                                                        play();
                                                                                                                                                                                    }else {
                                                                                                                                                                                        if (suara.equals("R.raw.butuh")){
                                                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.butuh);
                                                                                                                                                                                            play();
                                                                                                                                                                                        }else {
                                                                                                                                                                                            if (suara.equals("R.raw.pulang")){
                                                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.pulang);
                                                                                                                                                                                                play();
                                                                                                                                                                                            }else {
                                                                                                                                                                                                if (suara.equals("R.raw.memerlukan")){
                                                                                                                                                                                                    mediaPlayer = MediaPlayer.create(this, R.raw.memerlukan);
                                                                                                                                                                                                    play();
                                                                                                                                                                                                }else {
                                                                                                                                                                                                    if (suara.equals("R.raw.memotong")){
                                                                                                                                                                                                        mediaPlayer = MediaPlayer.create(this, R.raw.memotong);
                                                                                                                                                                                                        play();
                                                                                                                                                                                                    }else {
                                                                                                                                                                                                        if (suara.equals("R.raw.menyusahkan")){
                                                                                                                                                                                                            mediaPlayer = MediaPlayer.create(this, R.raw.menyusahkan);
                                                                                                                                                                                                            play();
                                                                                                                                                                                                        }else {
                                                                                                                                                                                                            if (suara.equals("R.raw.mendung")){
                                                                                                                                                                                                                mediaPlayer = MediaPlayer.create(this, R.raw.mendung);
                                                                                                                                                                                                                play();
                                                                                                                                                                                                            }else {
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