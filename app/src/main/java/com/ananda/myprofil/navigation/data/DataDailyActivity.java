package com.ananda.myprofil.navigation.data;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.DailyActivity;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Isi Data Daily Activity
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

public class DataDailyActivity {

        private static int[] dailyImage = {
            R.drawable.book,
            R.drawable.film,
            R.drawable.gaming,
            R.drawable.sleep
        };
        private static String[] dailyName = {
            "Belajar",
            "Nonton Film",
            "Bermain Game",
            "Tidur"
        };


        private static String[] dailyDeskripsi = {
            "Memanfaatkan Waktu dengan belajar merupakan hal yang positif.",
            "Menonton film merupakan kegiatan yang dapat membantu wawasan tentang pefilman bisa saja menambah ilmu maupun tidak",
            "Bermain game merupakan hal yang bisa menghilangkan Stres",
            "Tidur merupakan Hal yang sangat penting di karenakan di butuhkannya istirahat yang cukup"
        };
        private static String[] dailyTime = {
        "08.00-12.00",
        "13.00-17.00",
        "19.00-21.30",
        "22.00-05.00"
        };

        public static ArrayList<DailyActivity> getListData(){
          ArrayList<DailyActivity> list = new ArrayList<>();
          for (int position =0; position < dailyName.length; position++){
              DailyActivity dailyActivity = new DailyActivity();
              dailyActivity.setImageDaily(dailyImage[position]);
              dailyActivity.setJudulDaily(dailyName[position]);
              dailyActivity.setDeskripsiDaily(dailyDeskripsi[position]);
              dailyActivity.setWaktuDaily(dailyTime[position]);
              list.add(dailyActivity);
          }
          return list;
      }

}
