package com.ananda.myprofil.navigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.Music;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Adapter RecycleView Music
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

public class ListMusicAdapter extends RecyclerView.Adapter<ListMusicAdapter.ListViewHolder> {
    private ArrayList<Music> listMusic;

    public ListMusicAdapter(ArrayList<Music> list){
        this.listMusic = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_music, viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Music music = listMusic.get(position);
        holder.tvJudulMusic.setText(music.getJudulMusic());
        holder.webViewMusic.loadData(listMusic.get(position).getWebViewMusic(), "text/html","utf-8");


    }

    @Override
    public int getItemCount() {
        return listMusic.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        TextView tvJudulMusic;
        WebView webViewMusic;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvJudulMusic = itemView.findViewById(R.id.tv_music);
            webViewMusic = itemView.findViewById(R.id.wv_music);

            webViewMusic.getSettings().setJavaScriptEnabled(true);
            webViewMusic.setWebChromeClient(new WebChromeClient(){

            });

        }
    }
}
