package com.example.lastmoean;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class childprofile extends AppCompatActivity {

    //FirebaseDatabase database;

    //the data base vid
    EditText name;
    Button save;


    //the age vid
    TextView tvdate;
    TextView tvage;
    FloatingActionButton floatingButton;

     //for menu and button nav
     private DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    BottomNavigationView bottomNavigationView;
    NavigationView navigationView;
    Intent intent2;
    Button b1;

    private static final String TAG = "activity_childprofile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childprofile);

        //database = FirebaseDatabase.getInstance().getRefrence("");//add refrence

        name = findViewById(R.id.name);

        //floatingButton = findViewById(R.id.floatingActionButton);
        tvdate = findViewById(R.id.tvthedate);
        //tvage = findViewById(R.id.tvage);

        //extera
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.child);

        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
        Log.d(TAG, "onCreate:started");
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
        });

        floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dd = new DatePickerDialog(v.getContext(),datePickerListener, year,month,day  );
                dd.getDatePicker().setMaxDate(new Date().getTime());
                dd.show();
            }
        });


        save = (Button)findViewById(R.id.buttonsave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savename();
            }
        });



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

    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener(){
        public void onDateSet(DatePicker datePicker , int year , int month, int day){
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR , year);
            c.set(Calendar.MONTH , month);
            c.set(Calendar.DAY_OF_MONTH, day);
            String format = new SimpleDateFormat("dd MMM YYYY").format(c.getTime());
            tvdate.setText(format);
            tvage.setText(Integer.toString(calculateAge(c.getTimeInMillis())));

        }

    };
    int calculateAge(Long date){
        Calendar dob = Calendar.getInstance();
        dob.setTimeInMillis(date);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR)- dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_MONTH)< dob.get(Calendar.DAY_OF_MONTH)){
            age--;
        }
        return age;
    }
    private void savename(){
        String thename = name.getText().toString().trim();

        if (!TextUtils.isEmpty(thename)) {
            // String id = database.push().getKey();
            // children one = new children(id,thename);
            // database.child(id).setValue(one);
            Toast.makeText(this, "تمت الإضافة", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "أدخل الاسم", Toast.LENGTH_LONG).show();
        }
    }



}



        */
    }}