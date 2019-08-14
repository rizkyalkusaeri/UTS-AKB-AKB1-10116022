package com.rizkyalkus.uts_akb_akb1_10116022;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 18 Mei 2019
 */

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rizkyalkus.uts_akb_akb1_10116022.model.ModelKontak;

import java.util.List;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder> {

    Context mContext;
    List<ModelKontak> mKontak;
    Dialog myDialog;


    public RecylerViewAdapter(Context mContext, List<ModelKontak> mKontak) {
        this.mContext = mContext;
        this.mKontak = mKontak;
    }

    @NonNull
    @Override
    public RecylerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_kontak,viewGroup,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        //Deklarasi Dialog
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_kontak);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        vHolder.item_kontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView dialog_name_tv = (TextView) myDialog.findViewById(R.id.dialog_nama_id);
                final TextView dialog_phone_tv = (TextView) myDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_contact_img = (ImageView) myDialog.findViewById(R.id.dialog_img_id);
                final Button dialog_btn_call = (Button) myDialog.findViewById(R.id.dialog_btn_call);
                Button dialog_btn_message = (Button)myDialog.findViewById(R.id.dialog_btn_message);

                dialog_name_tv.setText(mKontak.get(vHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mKontak.get(vHolder.getAdapterPosition()).getPhone());
                dialog_contact_img.setImageResource(mKontak.get(vHolder.getAdapterPosition()).getPhoto());

                Toast.makeText(mContext, "Test Click"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                myDialog.show();

                dialog_btn_call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String toPanggil = "tel:"+dialog_btn_call;
                        mContext.startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse(toPanggil)));


                    }
                });
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(mKontak.get(position).getName());
        holder.tv_phone.setText(mKontak.get(position).getPhone());
        holder.img.setImageResource(mKontak.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mKontak.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;
        private LinearLayout item_kontak;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_kontak = (LinearLayout) itemView.findViewById(R.id.kontak_item_id);
            tv_name = (TextView) itemView.findViewById(R.id.nama_kontak);
            tv_phone = (TextView) itemView.findViewById(R.id.phone_kontak);
            img = (ImageView) itemView.findViewById(R.id.img_kontak);

        }
    }
}
