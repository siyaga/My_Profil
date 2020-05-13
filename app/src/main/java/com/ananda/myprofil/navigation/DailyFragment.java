package com.ananda.myprofil.navigation;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.adapter.ListDailyActivityAdapter;
import com.ananda.myprofil.navigation.adapter.ListDataFriends;
import com.ananda.myprofil.navigation.data.DataDailyActivity;
import com.ananda.myprofil.navigation.data.DataFriends;
import com.ananda.myprofil.navigation.property.DailyActivity;
import com.ananda.myprofil.navigation.property.Friends;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : Fragment ini Menampilkan Dialy activity memasukan data Dari RacycleView
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class DailyFragment extends Fragment {
    private RecyclerView rvDaily;
    private RecyclerView rvFriends;
    private ArrayList<DailyActivity> dailyList = new ArrayList<>();
    private ArrayList<Friends> frindsList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_daily, container, false);
        rvDaily = v.findViewById(R.id.rv_daily_activity);
        rvDaily.setHasFixedSize(true);
        rvFriends = v.findViewById(R.id.rv_friends);
        rvFriends.setHasFixedSize(true);

        dailyList.addAll(DataDailyActivity.getListData());
        frindsList.addAll(DataFriends.getListData());

        RecyclerDaily();
        RecyclerFriends();


        return v;
    }

    public void RecyclerDaily(){
        rvDaily.setLayoutManager(new LinearLayoutManager(getContext()));
        ListDailyActivityAdapter listDailyActivityAdapter = new ListDailyActivityAdapter(dailyList);
        rvDaily.setAdapter(listDailyActivityAdapter);
    }
    public void RecyclerFriends(){
        rvFriends.setLayoutManager(new LinearLayoutManager(getContext(), rvFriends.HORIZONTAL,false));
        ListDataFriends listDataFriends = new ListDataFriends(frindsList);
        rvFriends.setAdapter(listDataFriends);
    }



}
