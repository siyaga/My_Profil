package com.ananda.myprofil.navigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.DailyActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Adapter RecycleView Daily Activity
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

public class ListDailyActivityAdapter extends RecyclerView.Adapter<ListDailyActivityAdapter.ListViewHolder> {
    private ArrayList<DailyActivity> listDaily;

    public ListDailyActivityAdapter(ArrayList<DailyActivity> list){
        this.listDaily = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_daily_activity, viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
    DailyActivity dailyActivity = listDaily.get(position);
    Glide.with(holder.itemView.getContext())
                .load(dailyActivity.getImageDaily())
                .apply(new RequestOptions().override(100,100))
                .into(holder.imageDaily);
    holder.tvDailyName.setText(dailyActivity.getJudulDaily());
    holder.tvDailyDeskripsi.setText(dailyActivity.getDeskripsiDaily());
    holder.tvDailyTime.setText(dailyActivity.getWaktuDaily());
    }

    @Override
    public int getItemCount() {
        return listDaily.size();
    }

     class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imageDaily;
        TextView tvDailyName, tvDailyDeskripsi, tvDailyTime;

         ListViewHolder(View itemView) {
            super(itemView);
             tvDailyName = itemView.findViewById(R.id.tv_daily_judul);
            imageDaily = itemView.findViewById(R.id.iv_daily);
            tvDailyDeskripsi = itemView.findViewById(R.id.tv_daily_deskripsi);
            tvDailyTime = itemView.findViewById(R.id.tv_daily_waktu);


        }
    }
}
