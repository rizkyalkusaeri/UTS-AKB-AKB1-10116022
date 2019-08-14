package com.rizkyalkus.uts_akb_akb1_10116022.Fragment;


import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rizkyalkus.uts_akb_akb1_10116022.Activity.InsertActivity;
import com.rizkyalkus.uts_akb_akb1_10116022.KontakDatabaseAdapter;
import com.rizkyalkus.uts_akb_akb1_10116022.R;
import com.rizkyalkus.uts_akb_akb1_10116022.Room.AppDatabase;
import com.rizkyalkus.uts_akb_akb1_10116022.model.Kontak;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.rizkyalkus.uts_akb_akb1_10116022.Room.MyApp.db;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 11 Agustus 2019
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDatabaseKontak extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private List<Kontak> listKontak = new ArrayList<>();
    Button btn_insert;


    public FragmentDatabaseKontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment_database_kontak, container, false);

        btn_insert = v.findViewById(R.id.btn_insert);
        btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),InsertActivity.class);
                startActivity(intent);
            }
        });

        fetchDataFromRoom();
        mRecyclerView = v.findViewById(R.id.rv_kontakdatabase);
        KontakDatabaseAdapter kontakDatabaseAdapter = new KontakDatabaseAdapter(getContext(), listKontak);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(kontakDatabaseAdapter);
        return v;
    }

    private void fetchDataFromRoom(){
        db = Room.databaseBuilder(getActivity().getApplicationContext(),AppDatabase.class,"kontak")
                .allowMainThreadQueries().build();

        listKontak = db.kontakDao().getAll();

        for (int i = 0 ;i <listKontak.size();i++){
            Log.e("Aplikasi",listKontak.get(i).getAlamat()+i);
            Log.e("Aplikasi",listKontak.get(i).getTelepon()+i);
            Log.e("Aplikasi",listKontak.get(i).getNama()+i);
            Log.e("Aplikasi",listKontak.get(i).getNim()+i);
        }
    }

}
