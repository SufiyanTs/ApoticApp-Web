package com.example.loginpage;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginpage.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class produk extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    promoFragment pfragment = new promoFragment();
    dashboard dboard    = new dashboard();
    ProfileFragment pfile = new ProfileFragment();

    ActivityMainBinding binding;
    RecyclerView recyclerView;
    ArrayList<SetterGetter1> datamenu;
    GridLayoutManager gridLayoutManager;
    produkAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.produk_list);

        /*bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, dashboard).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, dashboard).commit();
                        return true;
                    case R.id.promo:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, promoFragment).commit();
                    case R.id.Profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,ProfileFragment).commit();
                        return true;
                }
                return false;
            }
        });
*/

        recyclerView        = findViewById(R.id.rv_menu1);
        addData();
        gridLayoutManager       =   new GridLayoutManager(this,3);
        recyclerView.setLayoutManager((gridLayoutManager));
        adapter             =   new produkAdapter(datamenu);
        recyclerView.setAdapter(adapter);
    }

    public void addData(){

        datamenu    = new ArrayList<>();
        datamenu.add(new SetterGetter1("Hand sanitizer", "hand1"));
        datamenu.add(new SetterGetter1("P3k", "hand2"));
        datamenu.add(new SetterGetter1("Alat Kesehatan", "hand3"));
        datamenu.add(new SetterGetter1("kontrasepsi", "hand4"));
        datamenu.add(new SetterGetter1("Vitamin", "hand5"));
        datamenu.add(new SetterGetter1("Obat Herbal", "hand6"));
        datamenu.add(new SetterGetter1("Suplemen", "hand7"));
        datamenu.add(new SetterGetter1("Kecantikan", "hand8"));
        datamenu.add(new SetterGetter1("Susu", "hand9"));
    }
}