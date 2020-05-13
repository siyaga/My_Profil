package com.ananda.myprofil.navigation.data;

import com.ananda.myprofil.navigation.property.Music;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Isi Data Music
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

public class DataMusic {
    private static String[] musicName = {
            "Loving Is Easy",
           "Boy pablo - Everytime",
            "FUR - If You Know That I'm Lonely"
    };

    private static String[] musicWebView = {
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iiynitQi5js\" frameborder=\"0\" allowfullscreen></iframe>",
           "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Lzi7ljJiLJQ\" frameborder=\"0\" allowfullscreen></iframe>",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IXllKXhFMEs\" frameborder=\"0\" allowfullscreen></iframe>"
    };

    public static ArrayList<Music> getListData(){
        ArrayList<Music> list  =new ArrayList<>();
        for (int position=0; position<musicName.length; position++){
            Music music = new Music();
            music.setJudulMusic(musicName[position]);
            music.setWebViewMusic(musicWebView[position]);
            list.add(music);
        }
        return list;
    }


}
