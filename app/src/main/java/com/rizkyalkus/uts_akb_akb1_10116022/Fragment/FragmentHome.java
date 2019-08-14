package com.rizkyalkus.uts_akb_akb1_10116022.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.rizkyalkus.uts_akb_akb1_10116022.Activity.HomeActivity;
import com.rizkyalkus.uts_akb_akb1_10116022.Activity.LoginActivity;
import com.rizkyalkus.uts_akb_akb1_10116022.PreferencesUtility;
import com.rizkyalkus.uts_akb_akb1_10116022.R;
import com.rizkyalkus.uts_akb_akb1_10116022.model.Model;

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
    private TextView userLoggedIn;
    private TextView btnLogout;
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
      userLoggedIn = v.findViewById(R.id.tv_userLoggedIn);
      btnLogout = v.findViewById(R.id.btn_logout);

      userLoggedIn.setText(PreferencesUtility.getLoggedInUser(getContext()));
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PreferencesUtility.clearLoggedInUser(getContext());
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
                }
        });

        return v;
    }

}
