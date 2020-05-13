package com.ananda.myprofil.navigation.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.Friends;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Adapter RecycleView Friends
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class ListDataFriends extends RecyclerView.Adapter<ListDataFriends.ListViewHolder> {
    private ArrayList<Friends> listFriends;

    public ListDataFriends(ArrayList<Friends> list){
        this.listFriends = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_friend_list, viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Friends friends = listFriends.get(position);
        Glide.with(holder.itemView.getContext())
                .load(friends.getImageFriends())
                .apply(new RequestOptions().override(75,75))
                .into(holder.imageFriends);
        holder.textViewName.setText(friends.getNamaFriends());
    }

    @Override
    public int getItemCount() {
        return listFriends.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imageFriends;
        TextView textViewName;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFriends = itemView.findViewById(R.id.iv_friends);
            textViewName = itemView.findViewById(R.id.tv_friends);
        }
    }
}
