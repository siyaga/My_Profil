package com.ananda.myprofil.navigation.data;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.Friends;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Isi Data Friends
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class DataFriends {
    private static int[] friendsImage = {
            R.drawable.friends_1,
            R.drawable.friends_2,
            R.drawable.friends_3,
            R.drawable.friends_4,
            R.drawable.friends_5
    };

    private static String[] friendsName = {
            "Salman Kaufman",
            "Mikael Lennon",
            "Casper Holmes",
            "Dylon Dodson",
            "Candice Cope"
    };
    public static ArrayList<Friends> getListData(){
        ArrayList<Friends> list = new ArrayList<>();
        for (int position =0; position < friendsName.length; position++){
            Friends friends = new Friends();
            friends.setImageFriends(friendsImage[position]);
            friends.setNamaFriends(friendsName[position]);
            list.add(friends);
        }
        return list;
    }
}
