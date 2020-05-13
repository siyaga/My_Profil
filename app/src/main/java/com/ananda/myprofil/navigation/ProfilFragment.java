package com.ananda.myprofil.navigation;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.ananda.myprofil.R;

/*
Tanggal Pengerjaan      : Selasa, 12 Mei 2020
Deskripsi Pengerjaan    : Fragment ini Menampilkan Profil dan menambahkan intent nomber,email, location dan dialog Versi aplikasi
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
public class ProfilFragment extends Fragment {
    ImageView imageTelephone, imageEmail, imageLocation;
    Button buttonAbout;
    AlertDialog.Builder dialog;
    LayoutInflater inflater;
    View dialogView;
    public ProfilFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profil, container, false);
        imageTelephone = v.findViewById(R.id.iv_add_call);
        imageEmail = v.findViewById(R.id.iv_email);
        imageLocation = v.findViewById(R.id.iv_place);
        buttonAbout = v.findViewById(R.id.btn_about_profil);

        imageTelephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "081371031191";
                Intent telephone = new Intent(Intent.ACTION_DIAL);
                telephone.setData(Uri.fromParts("tel",number,null));
                startActivity(telephone);
            }
        });

        imageEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "https://mail.google.com";
                Intent intentEmail = new Intent(Intent.ACTION_VIEW);
                intentEmail.setData(Uri.parse(email));
                startActivity(intentEmail);

            }
        });

        imageLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = "https://goo.gl/maps/bKTN7UpXcYMC8A5S6";
                Intent intentLocation = new Intent(Intent.ACTION_VIEW);
                intentLocation.setData(Uri.parse(location));
                startActivity(intentLocation);

            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogForm();
            }
        });

        return v;


    }

    private void DialogForm() {
        dialog = new AlertDialog.Builder(this.getContext());
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.version_aplication,null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setTitle("Version Aplication");
        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
