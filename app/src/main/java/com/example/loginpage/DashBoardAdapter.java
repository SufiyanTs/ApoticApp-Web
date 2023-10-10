package com.example.loginpage;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBoardHolder> {
    private ArrayList<SetterGetter> listdata;
    public DashBoardAdapter(ArrayList<SetterGetter>listdata){
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public DashBoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
        DashBoardHolder holder = new DashBoardHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardHolder holder, int position) {
        final SetterGetter getData  =   listdata.get(position);
        String  titlemenu   =   getData.getTitle();
        String  logomenu    =   getData.getImg();
        holder.titleMenu.setText(titlemenu);
        if(logomenu.equals("img_1")){
            holder.imgMenu.setImageResource(R.drawable.img_1);
        }else if(logomenu.equals("img_2")) {
            holder.imgMenu.setImageResource(R.drawable.img_2);
        }else if(logomenu.equals("img_3")) {
            holder.imgMenu.setImageResource(R.drawable.img_3);
        }else if(logomenu.equals("img_4")) {
            holder.imgMenu.setImageResource(R.drawable.img_4);
        }else if(logomenu.equals("img_5")) {
            holder.imgMenu.setImageResource(R.drawable.img_5);
        }else if(logomenu.equals("img_6")) {
            holder.imgMenu.setImageResource(R.drawable.img_6);
        }else if(logomenu.equals("img_7")) {
            holder.imgMenu.setImageResource(R.drawable.img_7);
        }else if(logomenu.equals("img_8")) {
            holder.imgMenu.setImageResource(R.drawable.img_8);
        }else if(logomenu.equals("img_9")) {
            holder.imgMenu.setImageResource(R.drawable.img_9);
        }


    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashBoardHolder extends RecyclerView.ViewHolder {
        TextView    titleMenu;
        ImageView   imgMenu;
        public DashBoardHolder(@NonNull View itemView) {
            super(itemView);
            titleMenu       = itemView.findViewById(R.id.title_1);
            imgMenu         = itemView.findViewById(R.id.logo_1);
        }
    }
}


