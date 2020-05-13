package com.ananda.myprofil.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.dbroom.AppDataBase;
import com.ananda.myprofil.navigation.dbroom.InterestEntity;

/*
Tanggal Pengerjaan      : Rabu, 13 Mei 2020
Deskripsi Pengerjaan    : Fragment ini Menampilkan Data
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class HomeFragment extends Fragment {
    private InterestEntity interestEntity;
    public static AppDataBase db;
    TextView tvHobby, tvMakes, tvMikes, tvInterest, tvCitacita;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        tvHobby = v.findViewById(R.id.tv_hobby);
        tvMakes = v.findViewById(R.id.tv_makes);
        tvMikes = v.findViewById(R.id.tv_mikes);
        tvInterest = v.findViewById(R.id.tv_interest);
        tvCitacita = v.findViewById(R.id.tv_cita_cita);



        db = Room.databaseBuilder(getContext().getApplicationContext(),
                AppDataBase.class, "interest")
                .allowMainThreadQueries().build();

        //Tambah Data
        interestEntity = new InterestEntity();
        interestEntity.setHobbyInterest("Olahraga");
        interestEntity.setMakesInterest("Rendang");
        interestEntity.setMikesInterest("Jus Mangga");
        interestEntity.setInterestInterest("Wanita");
        interestEntity.setCitacitaInterest("Jadi Mahasiswa Unikom");

        tvHobby.setText(interestEntity.getHobbyInterest());
        tvMakes.setText(interestEntity.getMakesInterest());
        tvMikes.setText(interestEntity.getMikesInterest());
        tvInterest.setText(interestEntity.getInterestInterest());
        tvCitacita.setText(interestEntity.getCitacitaInterest());

        db.interestDao().tambahInterest(interestEntity);

        return v;
    }
}
