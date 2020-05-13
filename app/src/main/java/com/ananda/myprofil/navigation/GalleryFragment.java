package com.ananda.myprofil.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.adapter.ListGalleryAdapter;
import com.ananda.myprofil.navigation.data.DataFriends;
import com.ananda.myprofil.navigation.data.DataGallery;
import com.ananda.myprofil.navigation.property.Friends;
import com.ananda.myprofil.navigation.property.Gallery;

import java.util.ArrayList;


/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : Fragment ini Menampilkan Gallery memasukan data Dari RacycleView
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class GalleryFragment extends Fragment {
    private RecyclerView rvGallery;
    private ArrayList<Gallery> galleryList = new ArrayList<>();

    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        rvGallery = v.findViewById(R.id.rv_gallery);
        rvGallery.setHasFixedSize(true);

        galleryList.addAll(DataGallery.getListData());
        RecycleViewGallery();



        return v;


    }

    public void RecycleViewGallery(){
        rvGallery.setLayoutManager(new GridLayoutManager(getContext(),2));
        ListGalleryAdapter listGalleryAdapter = new ListGalleryAdapter(galleryList);
        rvGallery.setAdapter(listGalleryAdapter);

    }
}
