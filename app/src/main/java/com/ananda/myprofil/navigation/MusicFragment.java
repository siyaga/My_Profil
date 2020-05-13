package com.ananda.myprofil.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.adapter.ListMusicAdapter;
import com.ananda.myprofil.navigation.data.DataMusic;
import com.ananda.myprofil.navigation.property.Music;

import java.util.ArrayList;
import java.util.Vector;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : Fragment ini Menampilkan Music dan memasukan data Dari RacycleView
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class MusicFragment extends Fragment {
    private RecyclerView rvMusic;
    private ArrayList<Music> listMusic = new ArrayList<>();
    public MusicFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_music, container, false);
        rvMusic = v.findViewById(R.id.rv_music);
        rvMusic.setHasFixedSize(true);
        listMusic.addAll(DataMusic.getListData());
        RecyclerMusic();
        return v;
    }

    public void RecyclerMusic(){
        rvMusic.setLayoutManager(new LinearLayoutManager(getContext()));
        ListMusicAdapter listMusicAdapter = new ListMusicAdapter(listMusic);
        rvMusic.setAdapter(listMusicAdapter);

    }

}
