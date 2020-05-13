package com.ananda.myprofil.navigation.data;

import com.ananda.myprofil.R;
import com.ananda.myprofil.navigation.property.Gallery;

import java.util.ArrayList;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : class ini Membuat Isi Data Gallery
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class DataGallery {
    private static int[] galleryImage = {
            R.drawable.gallery_1,
            R.drawable.gallery_2,
            R.drawable.gallery_3,
            R.drawable.gallery_4,
            R.drawable.gallery_5,
            R.drawable.gallery_6,
            R.drawable.gallery_7,
            R.drawable.gallery_8
    };
    public static ArrayList<Gallery> getListData(){
        ArrayList<Gallery> list = new ArrayList<>();
        for (int position =0; position < galleryImage.length; position++){
            Gallery gallery = new Gallery();
            gallery.setImageGllary(galleryImage[position]);
            list.add(gallery);
        }
        return list;
    }
}
