package com.rizkyalkus.uts_akb_akb1_10116022.Room;

import android.app.Application;
import android.arch.persistence.room.Room;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 11 Agustus 2019
 */

public class MyApp extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext()
                ,AppDatabase.class,"kontak")
                .allowMainThreadQueries().build();
    }
}
