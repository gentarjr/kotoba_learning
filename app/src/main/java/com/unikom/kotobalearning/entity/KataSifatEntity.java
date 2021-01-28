package com.unikom.kotobalearning.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class KataSifatEntity {

    @PrimaryKey(autoGenerate = true)
    private final int id_katasifat;

    @ColumnInfo(name = "kata_cina")
    private final String kata_cina;

    @ColumnInfo(name = "eja_kata")
    private final String eja_kata;

    @ColumnInfo(name = "kata_indo")
    private final String kata_indo;

    @ColumnInfo(name = "suara")
    private final String suara;

    public KataSifatEntity(int id_katasifat, String kata_cina, String eja_kata, String kata_indo, String suara) {
        this.id_katasifat = id_katasifat;
        this.kata_cina = kata_cina;
        this.eja_kata = eja_kata;
        this.kata_indo = kata_indo;
        this.suara = suara;
    }

    public int getId_katasifat() {
        return id_katasifat;
    }

    public String getKata_cina() {
        return kata_cina;
    }

    public String getEja_kata() {
        return eja_kata;
    }

    public String getKata_indo() {
        return kata_indo;
    }

    public String getSuara() {
        return suara;
    }
}
