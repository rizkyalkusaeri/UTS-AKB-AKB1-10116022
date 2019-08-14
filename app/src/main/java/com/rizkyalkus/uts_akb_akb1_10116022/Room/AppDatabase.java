package com.rizkyalkus.uts_akb_akb1_10116022.Room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.rizkyalkus.uts_akb_akb1_10116022.model.Kontak;
import com.rizkyalkus.uts_akb_akb1_10116022.model.KontakDao;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 11 Agustus 2019
 */

@Database(entities = {Kontak.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract KontakDao kontakDao();
}
