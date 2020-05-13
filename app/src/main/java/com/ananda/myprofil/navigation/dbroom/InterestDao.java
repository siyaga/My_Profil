package com.ananda.myprofil.navigation.dbroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/*
Tanggal Pengerjaan      : Rabu, 13 Mei 2020
Deskripsi Pengerjaan    : abstract class ini membuat Dao
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

@Dao
public interface InterestDao {

    @Insert
    void tambahInterest(InterestEntity interestEntity);

    @Delete
    public void hapusInterest(InterestEntity interestEntity);

    @Query("SELECT * FROM InterestEntity")
    List<InterestEntity> tampilSeluruhInterestEntity();

}
