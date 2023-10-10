package com.example.loginpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class produkadapterbaru extends RecyclerView.Adapter<produkadapterbaru.myViewHolder> {

Context context;
ArrayList<jproduk> list;

    public produkadapterbaru(Context context, ArrayList<jproduk> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        jproduk produk = list.get(position);
        holder.kodeobat.setText(produk.getKodeobat());
        holder.namaobat.setText(produk.getNamaobat());
        holder.jenisobat.setText(produk.getJenisobat());
        holder.stokobat.setText(produk.getStokobat());
        holder.harga.setText(produk.getHarga());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
        TextView kodeobat, namaobat, jenisobat, stokobat, harga;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            kodeobat = itemView.findViewById(R.id.kodeobat);
            namaobat = itemView.findViewById(R.id.namaobat);
            jenisobat = itemView.findViewById(R.id.jenisobat);
            stokobat = itemView.findViewById(R.id.stokobat);
            harga = itemView.findViewById(R.id.harga);

        }
    }
}
