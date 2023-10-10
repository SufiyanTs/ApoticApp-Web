package com.example.loginpage;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class produkAdapter extends RecyclerView.Adapter<produkAdapter.produkHolder> {
    private ArrayList<SetterGetter1> listdata;
    public produkAdapter(ArrayList<SetterGetter1> listdata){
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public produkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.produk_dashboard,parent,false);
        produkHolder holder = new produkHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull produkHolder holder, int position) {
        final SetterGetter1 getData  =   listdata.get(position);
        String  titlemenu   =   getData.getTitle();
        String  logomenu    =   getData.getImg();
        holder.titleMenu.setText(titlemenu);
        if(logomenu.equals("Hand1")){
            holder.imgMenu.setImageResource(R.drawable.hand1);
        }else if(logomenu.equals("hand2")) {
            holder.imgMenu.setImageResource(R.drawable.hand2);
        }else if(logomenu.equals("hand3")) {
            holder.imgMenu.setImageResource(R.drawable.hand3);
        }else if(logomenu.equals("hand4")) {
            holder.imgMenu.setImageResource(R.drawable.hand4);
        }else if(logomenu.equals("hand5")) {
            holder.imgMenu.setImageResource(R.drawable.hand5);
        }else if(logomenu.equals("hand6")) {
            holder.imgMenu.setImageResource(R.drawable.hand6);
        }else if(logomenu.equals("hand7")) {
            holder.imgMenu.setImageResource(R.drawable.hand7);
        }else if(logomenu.equals("hand8")) {
            holder.imgMenu.setImageResource(R.drawable.hand8);
        }else if(logomenu.equals("hand9")) {
            holder.imgMenu.setImageResource(R.drawable.hand9);
        }


    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class produkHolder extends RecyclerView.ViewHolder {
        TextView    titleMenu;
        ImageView   imgMenu;
        public produkHolder(@NonNull View itemView) {
            super(itemView);
            titleMenu       = itemView.findViewById(R.id.titlee_1);
            imgMenu         = itemView.findViewById(R.id.hand_1);
        }
    }
}


