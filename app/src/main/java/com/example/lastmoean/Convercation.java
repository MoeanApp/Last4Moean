package com.example.lastmoean;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Convercation extends AppCompatActivity {

    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Intent intent2;

    BottomNavigationView bottomNavigationView;

    private static final String TAG = "activity_convercation";

    private ArrayList<String> names=new ArrayList<>();
    private ArrayList<String>majer=new ArrayList<>();

    converAdapter adapter;
    RecyclerView recycleView;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convercation);

        Toolbar toolbar=findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer4_layout);

        toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        /*bottomNavigationView=findViewById(R.id.buttom_nav);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.bn1) {
                    consulting();
                }
                if (menuItem.getItemId() == R.id.bn2) {
                    location();
                }
                if (menuItem.getItemId() == R.id.bn3) {
                   calendar();
                  }
            }
        });


        navigationView=findViewById(R.id.drawer_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.nav_childprofile) {
                    profile();
                    return true;
                }


                if (menuItem.getItemId() == R.id.nav_progress) {
                    progress();
                    return true;
                }

                if (menuItem.getItemId() == R.id.nav_videoforcaregiver) {
                    videos();
                    return true;

                }
                if (menuItem.getItemId() == R.id.nav_who_is_moean_for_caregiver) {
                    WhoIsMoean();
                    return true;
                }
                return false;
            }
        });*/
        initImageBitmaps();

    }

    public void profile(){

        intent2=new Intent(this,childprofile.class);
        startActivity(intent2);


    }
    public void consulting(){
        intent2=new Intent(this, Convercation.class);
        startActivity(intent2);

    }

    public void location(){
        intent2=new Intent(this, location.class);
        startActivity(intent2);

    }
    public void progress(){
        intent2=new Intent(this, mile.class);
        startActivity(intent2);

    }
    public void videos(){
        intent2=new Intent(this,Videos.class);
        startActivity(intent2);
    }

    public void WhoIsMoean(){
        intent2=new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
    public void calendar(){
        intent2=new Intent(this,calendar.class);
        startActivity(intent2);
    }

    private void initImageBitmaps(){
        Log.d(TAG,"initImageBitmaps:preparing bitmaps.");

        names.add("سارة خالد");
        majer.add("مرحبا");



        initRecyclerView();

    }
    public void initRecyclerView(){
        Log.d(TAG,"initRecyclerView:init recyclerview.");
        recycleView=findViewById(R.id.recycler_view3);
        adapter=new converAdapter(names,majer,this);
        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.ItemDecoration divider=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recycleView.addItemDecoration(divider);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recycleView);


    }
    ItemTouchHelper.SimpleCallback itemTouchHelperCallback =new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            names.remove(viewHolder.getAdapterPosition());
            adapter.notifyDataSetChanged();
        }
    };

    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}