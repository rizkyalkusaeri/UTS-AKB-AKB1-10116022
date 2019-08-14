package com.rizkyalkus.uts_akb_akb1_10116022.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rizkyalkus.uts_akb_akb1_10116022.R;
import com.rizkyalkus.uts_akb_akb1_10116022.RecylerViewAdapter;
import com.rizkyalkus.uts_akb_akb1_10116022.model.ModelKontak;

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
public class FragmentDaftar extends Fragment {

    View v;
    private RecyclerView myRecylerView;
    private List<ModelKontak> lstkontak;

    public FragmentDaftar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment_daftar,container,false);
        myRecylerView = (RecyclerView) v.findViewById(R.id.kontak_recylerview);
        RecylerViewAdapter recylerViewAdapter = new RecylerViewAdapter(getContext(),lstkontak);
        myRecylerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecylerView.setAdapter(recylerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        lstkontak = new ArrayList<>();
        lstkontak.add(new ModelKontak("Afrizal MY","082127895511",R.drawable.af));
        lstkontak.add(new ModelKontak("Abdul Karim","082127895511",R.drawable.abdul));
        lstkontak.add(new ModelKontak("calvin Budi","082127895511",R.drawable.calvin));
        lstkontak.add(new ModelKontak("Vanadia","082127895511",R.drawable.vanadia));
        lstkontak.add(new ModelKontak("Ira Yuti","082127895511",R.drawable.ira));
        lstkontak.add(new ModelKontak("Viki Firaus","082127895511",R.drawable.vijey));
        lstkontak.add(new ModelKontak("Nurghaida Azhar","082127895511",R.drawable.gida));
        lstkontak.add(new ModelKontak("Fajar Nugraha","082127895511",R.drawable.japra));




    }
}
