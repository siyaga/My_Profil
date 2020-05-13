package com.ananda.myprofil.navigation.dbroom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*
Tanggal Pengerjaan      : Rabu, 13 Mei 2020
Deskripsi Pengerjaan    : class ini membuat variabel dan getter setter InterestEntity
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

@Entity
public class InterestEntity {

    @PrimaryKey(autoGenerate = true)
    private int idInterest;
    @ColumnInfo(name = "hobbyInterest")
    private String hobbyInterest;
    @ColumnInfo(name = "makesInterest")
    private String makesInterest;
    @ColumnInfo(name = "mikesInterest")
    private String mikesInterest;
    @ColumnInfo(name = "interestInterest")
    private String interestInterest;
    @ColumnInfo(name = "citacitaInterest")
    private String citacitaInterest;

    public int getIdInterest() {
        return idInterest;
    }

    public void setIdInterest(int idInterest) {
        this.idInterest = idInterest;
    }

    public String getHobbyInterest() {
        return hobbyInterest;
    }

    public void setHobbyInterest(String hobbyInterest) {
        this.hobbyInterest = hobbyInterest;
    }

    public String getMakesInterest() {
        return makesInterest;
    }

    public void setMakesInterest(String makesInterest) {
        this.makesInterest = makesInterest;
    }

    public String getMikesInterest() {
        return mikesInterest;
    }

    public void setMikesInterest(String mikesInterest) {
        this.mikesInterest = mikesInterest;
    }

    public String getInterestInterest() {
        return interestInterest;
    }

    public void setInterestInterest(String interestInterest) {
        this.interestInterest = interestInterest;
    }

    public String getCitacitaInterest() {
        return citacitaInterest;
    }

    public void setCitacitaInterest(String citacitaInterest) {
        this.citacitaInterest = citacitaInterest;
    }
}
