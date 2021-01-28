package com.unikom.db;

import com.unikom.kotobalearning.entity.KataBendaEntity;
import com.unikom.kotobalearning.entity.KataKerjaEntity;
import com.unikom.kotobalearning.entity.KataSifatEntity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


@Dao
public interface DbDao {

    @Query("SELECT * FROM KataBendaEntity ")
    List<KataBendaEntity> getAllKataBenda();

    @Query("SELECT * FROM KataSifatEntity ")
    List<KataSifatEntity> getAllKataSifat();

    @Query("SELECT * FROM KataKerjaEntity ")
    List<KataKerjaEntity> getAllKataKerja();

    @Query("SELECT COUNT(kata_indo) FROM KataBendaEntity WHERE kata_indo = :kata_indo")
    Integer getKataBendaByNama(String kata_indo);

    @Query("SELECT COUNT(kata_indo) FROM KataSifatEntity WHERE kata_indo = :kata_indo")
    Integer getKataSifatByNama(String kata_indo);

    @Query("SELECT COUNT(kata_indo) FROM KataKerjaEntity WHERE kata_indo = :kata_indo")
    Integer getKataKerjaByNama(String kata_indo);

    @Insert
    void insertKataBenda(KataBendaEntity kataBendaEntity);

    @Insert
    void insertKataSifat(KataSifatEntity kataSifatEntity);

    @Insert
    void insertKataKerja(KataKerjaEntity kataKerjaEntity);

    @Query("DELETE FROM KataBendaEntity WHERE kata_indo = :kata_indo")
    void deleteKataBenda(String kata_indo);

    @Query("DELETE FROM KataSifatEntity WHERE kata_indo = :kata_indo")
    void deleteKataSifat(String kata_indo);

    @Query("DELETE FROM KataKerjaEntity WHERE kata_indo = :kata_indo")
    void deleteKataKerja(String kata_indo);

}
