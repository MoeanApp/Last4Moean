package com.example.lastmoean;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    BottomNavigationView bottomNavigationView;
    NavigationView navigationView;
    Intent intent2;
    Button b1;

    private static final String TAG = "activity_main";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.twitter);

        Toolbar toolbar=findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer6_layout);

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
    public void twitter(View view){
        Intent twitterintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/MoeanApp"));
        startActivity(twitterintent);
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