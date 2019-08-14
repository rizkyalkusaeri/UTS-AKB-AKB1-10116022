package com.rizkyalkus.uts_akb_akb1_10116022;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rizkyalkus.uts_akb_akb1_10116022.model.Kontak;

import java.util.List;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 11 Agustus 2019
 */

public class KontakDatabaseAdapter extends RecyclerView.Adapter<KontakDatabaseAdapter.MyViewHolder> {

    private Context mContext;
    private List<Kontak> lstKontak;

    public KontakDatabaseAdapter(Context mContext, List<Kontak> lstKontak) {
        this.mContext = mContext;
        this.lstKontak = lstKontak;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kontak_database, viewGroup,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.nama.setText(lstKontak.get(i).getNama());
        myViewHolder.nim.setText(lstKontak.get(i).getNim());
        myViewHolder.telepon.setText(lstKontak.get(i).getTelepon());
        myViewHolder.alamat.setText(lstKontak.get(i).getAlamat());

    }

    @Override
    public int getItemCount() {
        return lstKontak.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nama,nim,telepon,alamat;

        public MyViewHolder(@NonNull View v) {
            super(v);

            nama = v.findViewById(R.id.tvNama);
            nim = v.findViewById(R.id.tvNim);
            telepon = v.findViewById(R.id.tvTelepon);
            alamat = v.findViewById(R.id.tvAlamat);
        }
    }
}
