package com.rizkyalkus.uts_akb_akb1_10116022;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 17 Mei 2019
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {

    View v;
    private List<Model> lsthome;
    private ViewPager   viewHome;
    private TabLayout indicatorhome;

    public FragmentHome() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      v = inflater.inflate(R.layout.fragment_fragment_home2,container,false);
      return v;
    }

}
