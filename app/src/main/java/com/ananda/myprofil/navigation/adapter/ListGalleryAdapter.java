package com.ananda.myprofil.navigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.Gallery;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Adapter RecycleView Gallery
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class ListGalleryAdapter extends RecyclerView.Adapter<ListGalleryAdapter.ListViewHolder> {
    private ArrayList<Gallery> listGallery;

    public ListGalleryAdapter(ArrayList<Gallery> list){
        this.listGallery = list;
    }

    @NonNull
    @Override
    public ListGalleryAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gallery, viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListGalleryAdapter.ListViewHolder holder, int position) {
        Gallery gallery = listGallery.get(position);
        Glide.with(holder.itemView.getContext())
                .load(gallery.getImageGllary())
                .apply(new RequestOptions().override(170,150))
                .into(holder.imageGallery);
    }

    @Override
    public int getItemCount() {
        return listGallery.size();
    }

    public class ListViewHolder extends  RecyclerView.ViewHolder{
        public ImageView imageGallery;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageGallery = itemView.findViewById(R.id.iv_gallery);
        }
    }
}
