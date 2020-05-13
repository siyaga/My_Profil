package com.ananda.myprofil.navigation.dbroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
Tanggal Pengerjaan      : Rabu, 13 Mei 2020
Deskripsi Pengerjaan    : abstract class ini membuat RoomDatabase
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
@Database(entities = {InterestEntity.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract InterestDao interestDao();
}
