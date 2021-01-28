package com.unikom.db;

import android.content.Context;

import com.unikom.kotobalearning.entity.KataBendaEntity;
import com.unikom.kotobalearning.entity.KataKerjaEntity;
import com.unikom.kotobalearning.entity.KataSifatEntity;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = { KataBendaEntity.class, KataSifatEntity.class, KataKerjaEntity.class}, version = 1)

public abstract class Db extends RoomDatabase {

    public abstract DbDao getDao();

    private static Db noteDB;

    public static Db getInstance(Context context) {
        if (null == noteDB) {
            noteDB = buildDatabaseInstance(context);
        }
        return noteDB;
    }

    private static Db buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                Db.class,
                "db_kotoba")
                .allowMainThreadQueries().build();
    }

}