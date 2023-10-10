package com.example.loginpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class newproduk extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    produkadapterbaru myAdapter;
    ArrayList<jproduk> listproduk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newproduk);

        recyclerView = findViewById(R.id.listproduk);
        database = FirebaseDatabase.getInstance().getReference("dataobat");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listproduk = new ArrayList<>();
        myAdapter = new produkadapterbaru(this, listproduk);
        recyclerView.setAdapter(myAdapter);


        database.addValueEventListener((new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    jproduk produk = dataSnapshot.getValue(jproduk.class);
                    listproduk.add(produk);
                }
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        }));
    }
}