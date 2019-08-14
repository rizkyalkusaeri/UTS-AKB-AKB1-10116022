package com.rizkyalkus.uts_akb_akb1_10116022;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 17 Mei 2019
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

    public class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> lstFragment = new ArrayList<>();
        private final List<String> lstTitles = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return lstFragment.get(position);
        }

        @Override
        public int getCount() {
            return lstTitles.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return lstTitles.get(position);
        }

        public void AddFragment (Fragment fragment, String title) {
            lstFragment.add(fragment);
            lstTitles.add(title);
        }
    }
