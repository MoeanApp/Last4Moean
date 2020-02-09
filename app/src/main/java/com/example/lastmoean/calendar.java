package com.example.lastmoean;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class calendar extends AppCompatActivity {
    private DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    BottomNavigationView bottomNavigationView;
    NavigationView navigationView;
    Intent intent2;

    private static final String TAG = "activity_calendar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Toolbar toolbar=findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.cal);

        toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Log.d(TAG,"onCreate:started");
       /* bottomNavigationView=findViewById(R.id.buttom_nav);
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
        navigationView = findViewById(R.id.drawer_menu);
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

}
