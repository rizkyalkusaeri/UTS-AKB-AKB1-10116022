package com.rizkyalkus.uts_akb_akb1_10116022;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rizkyalkus.uts_akb_akb1_10116022.presenter.MainPresenterActivity;
import com.rizkyalkus.uts_akb_akb1_10116022.view.MainView;

import java.util.ArrayList;
import java.util.List;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 17 Mei 2019
 */


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKontak extends Fragment implements MainView {

    View v;
    private MainPresenterActivity presenter;


    public FragmentKontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       v = inflater.inflate(R.layout.fragment_fragment_kontak2,container,false);
        return v;
       }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        presenter = new MainPresenterActivity(this);
//        TextView wa = v.findViewById(R.id.get_wa);
//        TextView ig = v.findViewById(R.id.get_ig);
//        TextView fb = v.findViewById(R.id.get_fb);



//


//        fb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Uri uri = Uri.parse("http://instagram.com/_u/rizkyalkusaerii");
//                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
//
//                likeIng.setPackage("com.instagram.android");
//
//                try {
//                    startActivity(likeIng);
//                } catch (ActivityNotFoundException e) {
//                    startActivity(new Intent(Intent.ACTION_VIEW,
//                            Uri.parse("http://instagram.com/rizkyalkusaerii")));
//                }
//
//            }
//        });

    }


    @Override
    public void updateUserInfoTextView(String info) {



    }
}
