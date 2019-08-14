package com.rizkyalkus.uts_akb_akb1_10116022.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.rizkyalkus.uts_akb_akb1_10116022.R;
import com.rizkyalkus.uts_akb_akb1_10116022.model.Kontak;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;

import static com.rizkyalkus.uts_akb_akb1_10116022.Room.MyApp.db;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 11 Agustus 2019
 */

public class InsertActivity extends AppCompatActivity {

    @BindView(R.id.etNama)EditText etNama;
    @BindView(R.id.etNim)EditText etNim;
    @BindView(R.id.etTelepon)EditText etTelepon;
    @BindView(R.id.etAlamat)EditText etAlamat;
    Kontak kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        ButterKnife.bind(this);

        Stetho.initializeWithDefaults(this);
        new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();
    }

    @OnClick(R.id.btInsert)void buttonListener(){
        if (!etAlamat.getText().toString().isEmpty()&&!etTelepon.getText().toString().isEmpty()&&
                !etNama.getText().toString().isEmpty()&&!etNim.getText().toString().isEmpty()){

            kontak = new Kontak();
            kontak.setAlamat(etAlamat.getText().toString());
            kontak.setTelepon(etTelepon.getText().toString());
            kontak.setNama(etNama.getText().toString());
            kontak.setNim(etNim.getText().toString());
            //Insert data in database
            db.kontakDao().insertAll(kontak);
            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(InsertActivity.this, HomeActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Mohon masukkan dengan benar", Toast.LENGTH_SHORT).show();
        }
    }
}
