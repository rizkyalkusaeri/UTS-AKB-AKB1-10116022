package com.rizkyalkus.uts_akb_akb1_10116022.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 11 Agustus 2019
 */

@Dao
public interface KontakDao {
    @Query("SELECT * FROM kontak")
    List<Kontak> getAll();

    //Example Custum Query
    @Query("SELECT * FROM kontak WHERE nama LIKE :nama ")
    Kontak findByName(String nama);

    @Insert
    void insertAll(Kontak... kontak);

    @Delete
    public void deleteKontak(Kontak... kontak);

    @Update
    public void updateKontak(Kontak... kontak);
}
