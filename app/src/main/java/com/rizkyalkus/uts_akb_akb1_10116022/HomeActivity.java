package com.rizkyalkus.uts_akb_akb1_10116022;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 17 Mei 2019
 */

public class HomeActivity extends AppCompatActivity {

   private TabLayout tabLayout;
   private ViewPager viewPager;
   private ViewPagerAdapter adapter;

    private FragmentHome fragmentHome;
    private FragmentKontak fragmentKontak;
    private FragmentDaftar fragmentDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout_id);
        viewPager = (ViewPager) findViewById(R.id.view_pager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Ambil Fragment
        adapter.AddFragment(new FragmentHome(),"Profile");
        adapter.AddFragment(new FragmentKontak(),"Kontak");
        adapter.AddFragment(new FragmentDaftar(),"Daftar Teman");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_profile);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_kontak);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_daftar);

        //menghilangkan shadow pada action bar


    }



}
